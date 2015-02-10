package com.GodOfMen.render.window;

import java.awt.Canvas;
import java.awt.Graphics;
import java.awt.image.BufferedImage;

public class GameCanvas extends Canvas{
	
	private static final long serialVersionUID = 8251922003298730341L;
	private GameWindow window;
	/**
	 * Acts as a Buffer to allow the Renderer to control the Canvas
	 */
	private BufferedImage read;
	/**
	 * Acts as a Buffer to allow the Renderer to control the Canvas
	 */
	private BufferedImage write;
	
	
	protected GameCanvas(GameWindow window){
		super();
		this.window = window;
		this.addMouseListener(new GameMouseListener());
		this.read  = new BufferedImage(window.getWidth(), window.getHeight(), BufferedImage.TYPE_INT_ARGB);
		this.write = new BufferedImage(window.getWidth(), window.getHeight(), BufferedImage.TYPE_INT_ARGB);
	}
	
	
	
	public void paint(Graphics g){
		int width  = window.getWidth();
		int height = window.getHeight();
		g.drawImage(read, 0, 0, width, height, 0, 0, width, height, null); //draw the read BufferdImage to g
	}
	
	
	/**
	 * Swaps the Buffers and repaints this Canvas. This method should be called every render cycle.
	 */
	public void update(){
		swapBuffers();
		this.repaint();
	}
	
	
	/**
	 * Swaps the read buffer with the old write buffer
	 */
	private void swapBuffers(){
		BufferedImage oldWrite = this.write;
		this.write = new BufferedImage(window.getWidth(), window.getHeight(), BufferedImage.TYPE_INT_ARGB);
		this.read = oldWrite;
	}
	
	
	
	/**
	 * Use this Bufferd Image to draw onto this Canvas.
	 * @return a BufferedImage used as a Buffer to allow drawing to this Canvas.
	 */
	public BufferedImage getDrawingBuffer(){
		return this.write;
	}
	
	
	
}
