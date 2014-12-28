package com.GodOfMen.render.window;

import java.awt.Canvas;
import java.awt.Graphics;

public class GameCanvas extends Canvas{
	
	private static final long serialVersionUID = 8251922003298730341L;
	

	protected GameCanvas(){
		super();
		this.addMouseListener(new GameMouseListener());
	}
	
	
	public void paint(Graphics g){
		
	}
	
	
	
	
}
