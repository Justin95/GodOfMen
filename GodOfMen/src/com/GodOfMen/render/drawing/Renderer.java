package com.GodOfMen.render.drawing;

import java.awt.Graphics;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.util.Iterator;

import com.GodOfMen.mathUtil.Vector2D;
import com.GodOfMen.render.drawable.RenderObject;
import com.GodOfMen.render.window.GameCanvas;
import com.GodOfMen.render.window.GameWindow;

public class Renderer {
	
	private GameWindow window;
	private RenderObjectContainer container;
	private Camera camera;
	
	public Renderer(GameWindow window, Camera camera){ 
		this.window = window;
		this.container = new RenderObjectContainer();
		this.camera = camera;
	}
	
	
	/**
	 * Draw all the RenderObjects the Renderer currently has.
	 */
	public void render(){
		Iterator<RenderObject> iterator = container.iterator();
		GameCanvas canvas = window.getCanvas();
		Graphics g = canvas.getDrawingBuffer().getGraphics();
		while(iterator.hasNext()){
			RenderObject renObj = iterator.next();
			draw(g, renObj);
		}
	}
	
	
	
	/**
	 * Draws the given RenderObject onto the given Graphics object.
	 * @param g the Graphics object to draw onto
	 * @param renObj the RenderObject to draw
	 */
	private void draw(Graphics g, RenderObject renObj){//note need relative camera pos
		BufferedImage texture = renObj.getImage();
		Vector2D topLeft = new Vector2D(
				Camera.PIXELS_PER_METER * (renObj.getTopLeft().getIHat() - this.camera.getPosition().getIHat()),
				Camera.PIXELS_PER_METER * (renObj.getTopLeft().getJHat() - this.camera.getPosition().getJHat())
		);
		Vector2D bottomRight = new Vector2D(
				Camera.PIXELS_PER_METER * (renObj.getBottomRight().getIHat() - this.camera.getPosition().getIHat()),
				Camera.PIXELS_PER_METER * (renObj.getBottomRight().getJHat() - this.camera.getPosition().getJHat())
		);
		g.drawImage(
				(Image) texture,
				(int)topLeft.getIHat(),
				(int)topLeft.getJHat(),
				(int)bottomRight.getIHat(),
				(int)bottomRight.getIHat(),
				0,
				0,
				texture.getWidth(null),
				texture.getHeight(null),
				null
		);
	}
	
	
	
	
	/**
	 * Adds the given RenderObject to the container of RenderObjects.
	 * @param renObj the RenderObject to add
	 */
	public void addToRenderList(RenderObject renObj){
		this.container.addRenderObject(renObj);
	}
	
	
	/**
	 * Removes the given RenderObject from the container of RenderObjects.
	 * @param renObj the RenderObject to remove
	 */
	public void removeFromRenderList(RenderObject renObj){
		this.container.removeRenderObject(renObj);
	}
	
	/**
	 * Sets this Renderer's Camera object.
	 * @param camera the new Camera object
	 */
	public void setCamera(Camera camera){
		this.camera = camera;
	}
	
}
