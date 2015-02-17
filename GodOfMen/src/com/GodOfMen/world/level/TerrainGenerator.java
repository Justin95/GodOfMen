package com.GodOfMen.world.level;

public interface TerrainGenerator {
	
	
	
	/**
	 * This method is intended to create a Tile array representing the Terrain.
	 * Each Tile should contain be a valid TerrainType from the TerrainType enumeration.
	 * Each (x, y) location should be at the location [width * y + x] in the array.
	 * In this coordinate system (0, 0) is at the top left and (width, height) is at the bottom right.
	 * @param width the width of the Terrain
	 * @param height the height of the Terrain
	 * @return a Tile array representing the Terrain
	 */
	public Tile[] createTerrain(int width, int height);
	
	
	
	
}
