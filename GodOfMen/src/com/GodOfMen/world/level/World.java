package com.GodOfMen.world.level;

/**
 * 
 * 
 * This Class contains all the relevant information about the loaded world.
 * This includes raw terrain data and structures.
 * This Class also provides the necessary methods to interact with the world.
 *
 * @author Justin    Github: Justin95
 */
public class World {
	
	private Terrain terrain;
	
	
	/**
	 * Constructs a new World from a given width, height, and terrainGenerator.
	 * TerrainGenerator can be implemented to create a world from a file.
	 * @param width  the width of the world, x
	 * @param height the height of the world, y
	 * @param terrainGenerator
	 */
	public World(int width, int height, TerrainGenerator terrainGenerator){
		this.terrain = new Terrain(width, height, terrainGenerator);
		
	}
	
	
	/**
	 * Construct a World object from a Terrain object and a TerrainObjectsMap.
	 * This constructor should be used to make a World object from reading a file.
	 * @param terrain a Terrain object representing the raw Terrain
	 */
	protected World(Terrain terrain){
		this.terrain = terrain;
	}
	
	
	/**
	 * Gets the Tile at the given x,y coordinates. The coordinate scheme is such that:
	 * (0,0) is in the top left and (width, height) is the bottom right.
	 * @param x the x value of the tile
	 * @param y the y value of the tile
	 * @return the Tile object at the given coordinates
	 */
	public Tile getTileAt(int x, int y){
		return this.terrain.getTileAt(x, y);
	}
	
	
}
