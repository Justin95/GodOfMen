package com.GodOfMen.render.drawable;

import java.awt.Image;

import com.GodOfMen.mathUtil.Vector2D;

public abstract class RenderObject implements Renderable, Clickable{
	
	private Vector2D center;
	private double width;
	private double height;
	/**
	 * The Layer this RenderObject should be drawn on
	 */
	private int layer;
	private Image texture;
	
	
	/**
	 * Constructs a new RenderObject.
	 * @param center the Vector2D center of this RenderObject
	 * @param width the width of this RenderObject
	 * @param height the height of this RenderObject
	 * @param layer the layer this RenderObject will be drawn onto
	 * @param texture the Image that will be Rendered as this RenderObject
	 */
	public RenderObject(Vector2D center, double width, double height, int layer, Image texture){
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
		double x = center.getIHat() + width  / 2;
		double y = center.getJHat() + height / 2;
		return new Vector2D(x, y);
	}
	
	
	/**
	 * 
	 * @return the Image object which will be drawn as this RenderObject
	 */
	public Image getImage(){
		return this.texture;
	}
	
	
	/**
	 * 
	 * @return the integer layer number representing the layer on to which this RenderObject is drawn
	 */
	public int getLayer(){
		return this.layer;
	}
	
	
	
}
