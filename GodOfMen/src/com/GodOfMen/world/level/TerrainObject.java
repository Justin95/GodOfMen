package com.GodOfMen.world.level;

public class TerrainObject {
	
	/**
	 * Represents the type of TerrainObject, such as a wall, building, farm, etc.
	 */
	private TerrainObjectType terrainObjType;
	/**
	 * a floating point representation of this TerrainObject's health.
	 */
	private float health;
	/**
	 * Meta data required for certain TerrainObjects
	 */
	private short metaData;
	
	
	/**
	 * 
	 * @param terrainObjType The type of TerrainObject, such as a wall, building, or farm
	 * @param health the health of this TerrainObject
	 * @param metaData other data for use with this TerrainObject
	 */
	TerrainObject(TerrainObjectType terrainObjType, float health, short metaData){
		this.terrainObjType = terrainObjType;
		this.health = health;
		this.metaData = metaData;
	}
	
	
	/**
	 * 
	 * @return this TerrainObject's TerrainObjectType
	 */
	public TerrainObjectType getTerrainObjectType(){
		return this.terrainObjType;
	}
	
	
	/**
	 * 
	 * @return the floating point representation of this TerrainObject's health
	 */
	public float getHealth(){
		return this.health;
	}
	
	/**
	 * 
	 * @return the extra meta data of this TerrainObject
	 */
	public short getMetaData(){
		return this.metaData;
	}
	
}
