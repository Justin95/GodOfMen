package com.GodOfMen.render.drawable;

import java.awt.image.BufferedImage;

import com.GodOfMen.assets.Texture;
import com.GodOfMen.mathUtil.Vector2D;

public class RenderObject implements Renderable{
	
	/**
	 * The Center of this RenderObject in units of meters
	 */
	private Vector2D center;
	private double width; //units of meters
	private double height;//units of meters
	/**
	 * The Layer this RenderObject should be drawn on, 
	 * higher numbers indicated this RenderObject will be closer to the bottom.
	 */
	private int layer;
	private Texture texture;
	
	
	/**
	 * Constructs a new RenderObject.
	 * @param center the Vector2D center of this RenderObject
	 * @param width the width of this RenderObject
	 * @param height the height of this RenderObject
	 * @param layer the layer this RenderObject will be drawn onto
	 * @param texture the Image that will be Rendered as this RenderObject
	 */
	public RenderObject(Vector2D center, double width, double height, int layer, Texture texture){
		this.texture = texture;
		this.center = center;
		this.width = width;
		this.height = height;
		this.layer = layer;
	}
	
	
	
	/**
	 * 
	 * @return a Vector2D object representing the center of this RenderObject
	 */
	public Vector2D getCenter(){
		return this.center;
	}
	
	
	/**
	 * 
	 * @return a Vector2D object representing the top left corner of this RenderObject
	 */
	public Vector2D getTopLeft(){
		double x = center.getIHat() - width  / 2;
		double y = center.getJHat() - height / 2;
		return new Vector2D(x, y);
	}
	
	
	/**
	 * 
	 * @return a Vector2D object representing the top left corner of this RenderObject
	 */
	public Vector2D getBottomRight(){
		double x = center.getIHat() + width  / 2;
		double y = center.getJHat() + height / 2;
		return new Vector2D(x, y);
	}
	
	
	/**
	 * 
	 * @return the BufferedImage object which will be drawn as this RenderObject
	 */
	public BufferedImage getImage(){
		return this.texture.getImage();
	}
	
	
	/**
	 * 
	 * @return the integer layer number representing the layer on to which this RenderObject is drawn
	 */
	public int getLayer(){
		return this.layer;
	}
	
	
}
