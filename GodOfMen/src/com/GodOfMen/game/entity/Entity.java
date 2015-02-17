package com.GodOfMen.game.entity;

import com.GodOfMen.assets.Texture;
import com.GodOfMen.mathUtil.Vector2D;


public class Entity {
	
	private Vector2D position;
	private Texture  texture;
	
	public Entity(Vector2D pos, Texture texture){
		this.position = pos;
		this.texture  = texture;
	}
	
	
	/**
	 * 
	 * @return The position vector of this entity represented as a Vector2D
	 */
	public Vector2D getPosition(){
		return this.position;
	}
	
	
	/**
	 * 
	 * @return The texture of this entity
	 */
	public Texture getTexture(){
		return this.texture;
	}
	
	
}
