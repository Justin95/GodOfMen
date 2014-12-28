package com.GodOfMen.render.window;

import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Toolkit;

import javax.swing.JFrame;

/**
 * 
 * @author Justin
 *
 *This Class serves as the Main Window that the game is rendered onto.
 */
public class GameWindow extends JFrame{
	
	private static final long serialVersionUID = -8424656829783105498L;
	private GameCanvas canvas;
	private GameWindowListener windowListener;
	
	
	/**
	 * Constructs a new GameWindow Object and sets it visible.
	 */
	public GameWindow(){
		super();
		this.windowListener = new GameWindowListener();
		this.canvas = new GameCanvas();
		Dimension screenDimension = Toolkit.getDefaultToolkit().getScreenSize();
		this.setSize(screenDimension);
		this.add(canvas);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
		this.createBufferStrategy(3);
	}
	
	
	/**
	 * This method draws this GameWindow onto the given Graphics object.
	 * @param g The graphics object on which to paint
	 */
	public void paint(Graphics g){
		this.canvas.paint(g);
	}
	
	
	/**
	 * 
	 * @return this GameWindow's GameCanvas
	 */
	public GameCanvas getCanvas(){
		return this.canvas;
	}
	
	
	/**
	 * 
	 * @return true if the window has been closed, false otherwise.
	 */
	public boolean isClosed(){
		return this.windowListener.isClosed();
	}
	
	
	/**
	 * Closes this Window and frees associated resources.
	 */
	public void close(){
		this.setVisible(false);
		this.dispose();
	}
	
	
	
}
