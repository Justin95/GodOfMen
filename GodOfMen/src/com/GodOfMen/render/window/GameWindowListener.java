package com.GodOfMen.render.window;

import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class GameWindowListener implements WindowListener {
	
	private boolean closed;
	
	protected GameWindowListener(){
		this.closed = false;
	}
	
	/**
	 * 
	 * @return true if the window has been closed, false otherwise.
	 */
	protected boolean isClosed(){
		return this.closed;
	}
	
	
	@Override
	public void windowActivated(WindowEvent arg0) {
		
		
	}
	
	@Override
	public void windowClosed(WindowEvent arg0) {
		this.closed = true;
	}

	@Override
	public void windowClosing(WindowEvent arg0) {
		
		
	}

	@Override
	public void windowDeactivated(WindowEvent arg0) {
		
		
	}

	@Override
	public void windowDeiconified(WindowEvent arg0) {
		
		
	}

	@Override
	public void windowIconified(WindowEvent arg0) {
		
		
	}

	@Override
	public void windowOpened(WindowEvent arg0) {
		
		
	}
	
	
	
	
	
	
}
