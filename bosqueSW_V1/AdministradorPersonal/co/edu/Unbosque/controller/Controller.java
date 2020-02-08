package co.edu.Unbosque.controller;

import java.awt.event.*;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.util.ArrayList;

import co.edu.Unbosque.view.*;

public class Controller implements ActionListener {

	private View IG;
	private ObjectInputStream entrada;
	private ObjectOutput salida;
	private File archivo = new File("data/datos.dat");

	public Controller() {

		IG = new View(this);

		IG.setVisible(true);
//		if (archivo.exists()) {
//			System.out.println("El archivo ya existe");
//		} else {
//			try {
//				archivo.createNewFile();
//			} catch (IOException e) {
//				e.printStackTrace();
//			}
//		}
//
//		if (archivo.length() != 0) {
//			try {
//				entrada = new ObjectInputStream(new FileInputStream(archivo));
//				personas = (ArrayList<Personal>) entrada.readObject();
//			} catch (IOException | ClassNotFoundException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}
//
//		}

	}

	@Override
	public void actionPerformed(ActionEvent e) {

		if (e.getActionCommand().equals(PanelAgregar.VOLVER)) {

		}

	}

}
