package com.GodOfMen.render.drawable;

import java.awt.Image;

import com.GodOfMen.mathUtil.Vector2D;

public interface Renderable {
	
	
	/**
	 * 
	 * @return the Vector representing the center of the object to render
	 */
	public Vector2D getCenter();
	
	/**
	 * 
	 * @return the Vector representing the top left corner of the object to render
	 */
	public Vector2D getTopLeft();
	
	/**
	 * 
	 * @return the image to draw for this object
	 */
	public Image getImage();
	
	
	/**
	 * 
	 * @return the integer layer on which this object should be drawn
	 */
	public int getLayer();
	
	
}
