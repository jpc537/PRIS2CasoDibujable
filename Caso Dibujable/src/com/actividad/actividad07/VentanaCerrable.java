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
	// métodos de la interface WindowsListener
	public void windowActivated(WindowEvent e) {
		this.setEnabled(true);
	}

	@Override
	public void windowClosed(WindowEvent e) {
		this.dispose();
	}

	@Override
	public void windowClosing(WindowEvent e) {
		this.dispose();
	}

	@Override
	public void windowDeactivated(WindowEvent e) {
		this.setEnabled(false);
	}

	@Override
	public void windowDeiconified(WindowEvent e) {
		this.setIconImage(null);
	}

	@Override
	public void windowIconified(WindowEvent e) {
		this.setIconImage(getIconImage());
	}

	@Override
	public void windowOpened(WindowEvent e) {
		e.getWindow();
	}
}