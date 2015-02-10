package com.GodOfMen.game.main;

import com.GodOfMen.render.drawing.Camera;
import com.GodOfMen.render.drawing.Renderer;
import com.GodOfMen.render.window.GameWindow;

public class Game {
	
	public static void main(String[] args){
		Game game = new Game();
		game.start();
	}
	
	private Renderer render;
	private GameWindow window;
	private boolean keepRunning;
	private Camera camera;
	
	
	private Game(){
		this.camera = new Camera(0,0);
		this.window = new GameWindow("God of Men");
		this.render = new Renderer(window, camera);
	}
	
	
	/**
	 * Starts the game running
	 */
	public void start(){
		this.keepRunning = true;
		loop();
		cleanUp();
	}
	
	
	/**
	 * The main game loop
	 */
	private void loop(){
		while(keepRunning){
			if(window.isClosed()) keepRunning = false;
			
			render.render();
			
		}
	}
	
	/**
	 * Frees any resources and ends the game cleanly.
	 */
	private void cleanUp(){
		this.window.close();
	}
	
	
	/**
	 * Stops the game
	 */
	public void stop(){
		this.keepRunning = false;
	}
	
	
}
