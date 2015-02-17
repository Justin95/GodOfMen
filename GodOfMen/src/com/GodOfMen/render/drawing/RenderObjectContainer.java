package com.GodOfMen.render.drawing;

import java.util.ArrayList;

import com.GodOfMen.render.drawable.RenderObject;

/**
 * 
 * @author Justin
 *
 *This Class serves as a Container for RenderObjects to be rendered.
 *Keeps them sorted by layer to allow for easy iteration during drawing.
 */
public class RenderObjectContainer implements Iterable<RenderObject>{
	
	/**
	 * The ArrayList of RenderObjects. Contains the render objects used on a specific order:
	 * greatest layer number to least layer number
	 */
	private ArrayList<RenderObject> renderObjects;
	
	
	
	protected RenderObjectContainer(){
		renderObjects = new ArrayList<RenderObject>();
	}
	
	
	/**
	 * Adds a RenderObject to the Collection and sorts it according to layer.
	 * @param renObj the RenderObject to add
	 */
	protected void addRenderObject(RenderObject renObj){
		for(int i = 0; i < renderObjects.size(); i++){
			if(renderObjects.get(i).getLayer() < renObj.getLayer()){
				renderObjects.add(i, renObj);
				return;
			}
		}
		renderObjects.add(0, renObj);
	}
	
	
	/**
	 * Removes a RenderObject from the Collection.
	 * @param renObj the RenderObject to Remove
	 */
	protected void removeRenderObject(RenderObject renObj){
		renderObjects.remove(renObj);
	}
	
	
	/**
	 * Should only be called in the RenderObjectIterator class.
	 * @return a copy of the sorted ArrayList storing all the RenderObjects to be drawn
	 */
	protected ArrayList<RenderObject> getContainer(){
		return new ArrayList<RenderObject>(this.renderObjects);
	}
	
	
	/**
	 * Creates an Iterator over the RenderObjects in this RenderObjectContainer.
	 * @return an Iterator over the RenderObjects in this RenderObjectContainer
	 */
	public RenderObjectIterator iterator(){
		return new RenderObjectIterator(this);
	}
	
	
}
