package com.actividad.actividad07;

import java.awt.*;
import java.awt.event.*;

class VentanaCerrable extends Frame implements WindowListener {
	// constructores
	public VentanaCerrable() {
		super();
	}

	public VentanaCerrable(String title) {
		super(title);
		setSize(500, 500);
		addWindowListener(this);
	}

	@Override
	// m�todos de la interface WindowsListener
	public void windowActivated(WindowEvent e) {
		//TODO;
	}

	@Override
	public void windowClosed(WindowEvent e) {
		//TODO;
	}

	@Override
	public void windowClosing(WindowEvent e) {
		System.exit(0);
	}

	@Override
	public void windowDeactivated(WindowEvent e) {
		//TODO;
	}

	@Override
	public void windowDeiconified(WindowEvent e) {
		//TODO;
	}

	@Override
	public void windowIconified(WindowEvent e) {
		//TODO;
	}

	@Override
	public void windowOpened(WindowEvent e) {
		//TODO
		;
	}
}