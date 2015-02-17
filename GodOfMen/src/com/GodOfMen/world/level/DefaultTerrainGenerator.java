package com.GodOfMen.world.level;

public class DefaultTerrainGenerator implements TerrainGenerator{
	
	
	
	
	public DefaultTerrainGenerator(long seed){
		
	}
	
	
	/**
	 * Creates an array of shorts describing the terrain with each Terrain piece being addressable
	 * by [width * y + x]. Each Terrain piece is described by:
	 * 
	 * 2 bytes describing a short id of the TerrainType (TerrainType.java)
	 * 
	 */
	public Tile[] createTerrain(int width, int height){
		Tile[] terrain = new Tile[width * height];
		
		//TODO
		
		return terrain;
	}
	
}
