package com.GodOfMen.render.drawable;

public interface Clickable {
	
	/**
	 * This method is called when this Clickable is clicked by the mouse.
	 */
	public void onClick();
	
	
	/**
	 * This method is called when the mouse moves over this Clickable.
	 */
	public void onMouseOver();
	
	
	/**
	 * This method is called when the mouse moves off this Clickable.
	 */
	public void onMouseMoveOff();
	
	
	/**
	 * This method is called when the mouse is pressed on this Clickable.
	 */
	public void onMousePress();
	
	
	/**
	 * This method is called when the mouse is released on this Clickable.
	 */
	public void onMouseRelease();
	
	
}
