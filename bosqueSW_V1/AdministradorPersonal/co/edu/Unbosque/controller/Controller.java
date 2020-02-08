package co.edu.Unbosque.controller;

import java.awt.event.*;
import java.io.File;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;

import co.edu.Unbosque.view.*;

public class Controller implements ActionListener {

	private View IG;
	private ObjectInputStream entrada;
	private ObjectOutput salida;
	private File archivo = new File("data/datos.dat");

	public Controller() {

		IG = new View(this);

		IG.setVisible(true);

	}

	@Override
	public void actionPerformed(ActionEvent e) {

		if (e.getActionCommand().equals(PanelAgregar.VOLVER)) {

		}

	}

}
