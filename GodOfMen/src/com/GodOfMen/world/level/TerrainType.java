package com.GodOfMen.world.level;

public enum TerrainType {
	
	RESERVED		(0),
	GRASS_RICH		(1),
	GRASS_AVERAGE	(2),
	GRASS_POOR		(3),
	SAND_FINE		(4),
	SAND_AVERAGE	(5),
	SAND_ROUGH		(6),
	STONE			(7),
	STONE_COAL		(8),
	STONE_COPPER	(9),
	STONE_IRON		(10),
	STONE_GOLD		(11),
	STONE_ALUMINUM	(12),
	STONE_TITANIUM	(13),
	OCEAN_RICH		(14),
	OCEAN_AVERAGE	(15),
	OCEAN_POOR		(16),
	RIVER_NORTH		(17),
	RIVER_EAST		(18),
	RIVER_SOUTH		(19),
	RIVER_WEST		(20),
	FOREST_HEAVY	(21),
	FOREST_AVERAGE	(22),
	FOREST_THIN		(23);
	
	/**
	 * Used for saving Terrain to a file. Should be the same as the TerrainType's index in this enumeration.
	 */
	private short id;
	
	/**
	 * Constructs a new Terrain type.
	 * @param id an integer id for the terrain type however Short.MAX_VALUE is the maximum that can be assigned.
	 */
	TerrainType(int id /*, Texture texture //TODO*/){
		this.id = (short) id;
	}
	
	
	/**
	 * Gets the TerrainType which corresponds to the given ID.
	 * @param terrainID a byte ID
	 * @return the TerrainType Object for the given ID
	 */
	public static TerrainType getTerrainType(short terrainID){
		return TerrainType.values()[terrainID]; //this depends on the enumeration being listed in ID order
	}
	
	
	/**
	 * Gets the short integer ID of the given TerrainType.
	 * This ID is useful in saving the world to a file.
	 * @param type The TerrainType to get the ID of
	 * @return the short ID of the TerrainType
	 */
	public static short getTerrainTypeID(TerrainType type){
		return type.id;
	}
	
	
}
