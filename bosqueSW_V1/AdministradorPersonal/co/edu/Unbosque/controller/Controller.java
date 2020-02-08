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

		
		IG.getPanAgregar();
		IG.getPanBienvenido();
		IG.getPanModificar();
		
		if (e.getActionCommand().equals("Volver")) {
			IG.getPanBienvenido().setVisible(true);
			IG.getPanAgregar().setVisible(false);
		}
		if (e.getActionCommand().equals("Agregar")) {
			IG.getPanBienvenido().setVisible(false);
			IG.getPanAgregar().setVisible(true);
		}
		if (e.getActionCommand().equals("Buscar")) {
			IG.getPanBienvenido().setVisible(false);
			IG.getPanModificar().setVisible(true);
		}
		if (e.getActionCommand().equals("Volver2")) {
			IG.getPanModificar().setVisible(false);
			IG.getPanBienvenido().setVisible(true);
		}
		
	}

}
