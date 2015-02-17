package com.GodOfMen.world.level;

public class Terrain {
	
	
	private Tile[] tiles;
	private int width;
	private int height;
	
	
	public Terrain(int width, int height, TerrainGenerator generator){
		this.width = width;
		this.height = height;
		this.tiles = generator.createTerrain(width, height);
	}
	
	
	/**
	 * Gets the TerrainType Object representing the type of terrain at the given x,y.
	 * If the given x and y are out of bounds null is returned.
	 * Note: in this coordinate system 0,0 is the top left and width,height is the bottom left.
	 * @param x the x coordinate
	 * @param y the y coordinate
	 * @return a TerrainType Object
	 */
	public TerrainType getTerrainAt(int x, int y){
		Tile tile = getTileAt(x, y);
		return tile.getTerrainType();
	}
	
	
	/**
	 * Gets the Tile object at the given x,y coordinates. 
	 * Returns null if the coordinates are out of bounds.
	 * @param x the x coordinate of the Tile
	 * @param y the y coordinate of the Tile
	 * @return The Tile object associated with these coordinates
	 */
	public Tile getTileAt(int x, int y){
		if(x >= this.width || y >= this.height || x < 0 || y < 0) return null;
		return this.tiles[this.width * y + x];
	}
	
	
}
