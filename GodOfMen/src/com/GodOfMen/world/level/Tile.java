package com.GodOfMen.world.level;

/**
 * 
 * @author Justin  Github: Justin95
 * 
 * Each instance of this class represents a square of the world map.
 * The world is a grid of tiles. Each Tile represents about 10 meters by 10 meters.
 *
 */
public class Tile {
	
	
	private TerrainType   terrainType;   //the terrain on this tile
	private TerrainObject terrainObject; //represents a building, wall, farm, etc
	
	
	/**
	 * Constructs a Tile from a TerrainType and possibly a TerrainObject.
	 * If there is no TerrainObject intended on this Tile make the TerrainObject null.
	 * @param terrainType   The type of terrain, one of many in the TerrainType enumeration, should not be null
	 * @param terrainObject The optional TerrainObject that exists on this tile, represents a building, wall, etc
	 * can be null of there is to be no such object on this tile.
	 */
	Tile(TerrainType terrainType, TerrainObject terrainObject){
		this.terrainType = terrainType;
		this.terrainObject = terrainObject;
	}
	
	
	/**
	 * 
	 * @return the TerrainType of this Tile.
	 */
	public TerrainType getTerrainType(){
		return this.terrainType;
	}
	
	
	/**
	 * This method tests whether this Tile contains a TerrainObject.
	 * If this Tile does not contain a terrain object, getTerrainObject() will return null.
	 * Use this method to avoid unpleasant null pointers.
	 * @return true if this Tile's TerrainObject is not null
	 */
	public boolean containsTerrainObject(){
		return this.terrainObject != null;
	}
	
	
	/**
	 * Use the containsTerrainObject method to check if this Tile has a TerrainObject associated with it
	 * @return this Tile's TerrainObject
	 */
	public TerrainObject getTerrainObject(){
		return this.terrainObject;
	}
	
	/**
	 * Sets this Tile's terrainObject. Useful for adding or deleting a structure.
	 * @param terrainObject the new TerrainObject, can be null
	 */
	public void setTerrainObject(TerrainObject terrainObject){
		this.terrainObject = terrainObject;
	}
	
	
}
