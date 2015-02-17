package com.GodOfMen.render.drawing;

import java.util.ArrayList;
import java.util.Iterator;

import com.GodOfMen.render.drawable.RenderObject;

public class RenderObjectIterator implements Iterator<RenderObject>{
	
	private int index;
	private ArrayList<RenderObject> renderObjects;
	
	protected RenderObjectIterator(RenderObjectContainer container){
		index = 0;
		renderObjects = container.getContainer();
	}
	
	
	/**
	 * True if this Iterator has another element to give. Only call next() if this returns true.
	 */
	public boolean hasNext() {
		return index < renderObjects.size();
	}
	
	/**
	 * Gets the next RenderObject from this Iterator.
	 */
	public RenderObject next() {
		RenderObject obj = renderObjects.get(index);
		index++;
		return obj;
	}
	
	
	/**
	 * Remove the last element given by next() from this collection.
	 */
	public void remove() {
		if(index == 0) return;
		renderObjects.remove(index-1);
	}
	
	
	
	
	
	
}
