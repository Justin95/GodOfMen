package com.GodOfMen.render.drawing;

import com.GodOfMen.mathUtil.Vector2D;

public class Camera {
	
	/**
	 * The constant to multiply by to convert meters to the number of pixels on screen
	 */
	public static final double PIXELS_PER_METER = .1;
	
	private Vector2D pos;
	
	public Camera(double x, double y){
		this.pos = new Vector2D(x, y);
	}
	
	
	/**
	 * 
	 * @return the Vector2D object representing this Camera's position
	 */
	public Vector2D getPosition(){
		return this.pos;
	}
	
	
	
}
