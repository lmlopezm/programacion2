package co.edu.Unbosque.controller;

import java.awt.event.*;
import java.io.*;
import java.util.*;

import javax.swing.JOptionPane;

import co.edu.Unbosque.Model.Concomision;
import co.edu.Unbosque.Model.Ingjunior;
import co.edu.Unbosque.Model.Ingsenior;
import co.edu.Unbosque.Model.Persona;
import co.edu.Unbosque.view.*;

public class Controller implements ActionListener {

	private View IG;
	private ArrayList<Concomision> comisiones;
	private ArrayList<Ingjunior> juniors;
	private ArrayList<Ingsenior> seniors;
	private ArrayList<Persona> personas;
	private ObjectInputStream entrada;
	private ObjectOutput salida;
	private File archivo = new File("data/datos.dat");

	@SuppressWarnings("unchecked")
	public Controller() {

		IG = new View(this);
		IG.setVisible(true);

		personas = new ArrayList<Persona>();
		comisiones = new ArrayList<Concomision>();
		juniors = new ArrayList<Ingjunior>();
		seniors = new ArrayList<Ingsenior>();

		if (archivo.exists()) {
			System.out.println("El archivo ya existe");
		} else {
			try {
				archivo.createNewFile();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

		if (archivo.length() != 0) {
			try {
				entrada = new ObjectInputStream(new FileInputStream(archivo));
				personas = (ArrayList<Persona>) entrada.readObject();
				comisiones = (ArrayList<Concomision>) entrada.readObject();
				juniors = (ArrayList<Ingjunior>) entrada.readObject();
				seniors = (ArrayList<Ingsenior>) entrada.readObject();
			} catch (ClassNotFoundException | IOException e) {
				e.printStackTrace();
			}
		}
		
		

	}

	/**
	 * Metodo que al pasarle por parametro un objeto persona lo escribe en el
	 * archivo
	 * 
	 * @param persona
	 */
	public void escribirEnArchivo() {
		try {
			salida = new ObjectOutputStream(new FileOutputStream(archivo));
			//salida.writeObject(personas);
			salida.writeObject(juniors.toString());
			salida.close();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

//	public boolean agregarPersona(String cedula, String nombre, String apellido, int anioIngreso, String genero,
//			String telefono, String correo, String direccion) {
//
////		Persona nuevo =new Persona(cedula,nombre,apellido,anioIngreso,genero,telefono,correo,direccion);
//			
//			
//		
//	}

	@Override
	public void actionPerformed(ActionEvent e) {

		
		IG.getPanAgregar();
		IG.getPanBienvenido();
		IG.getPanModificar();
		
		String cedula = "";
		
		if (e.getActionCommand().equals("Volver")) {
			IG.getPanBienvenido().setVisible(true);
			IG.getPanAgregar().setVisible(false);
		}
		if (e.getActionCommand().equals("Agregar")) {
			if (IG.getPanBienvenido().gettBuscar().getText().equals("")) {
				JOptionPane.showMessageDialog(null, "Ingrese cédula");
			}else {
				IG.getPanBienvenido().setVisible(false);
				IG.getPanAgregar().setVisible(true);
				cedula = IG.getPanBienvenido().gettBuscar().getText();
				System.out.println(cedula);
			}
		}
		if (e.getActionCommand().equals("Buscar")) {
			if (IG.getPanBienvenido().gettBuscar().getText().equals("")) {
				JOptionPane.showMessageDialog(null, "Ingrese cédula");
			}else {
				IG.getPanBienvenido().setVisible(false);
				IG.getPanModificar().setVisible(true);
			}
			
		}
		if (e.getActionCommand().equals("Volver2")) {
			IG.getPanModificar().setVisible(false);
			IG.getPanBienvenido().setVisible(true);
		}
		if (e.getActionCommand().equals("Borrar")) {
			System.out.println("Borrando...");
		}
		if (e.getActionCommand().equals("Guardar")) {
			if (IG.getPanAgregar().getCbTipoPersonal().getSelectedItem().equals("Ingeniero Junior")) {
				int niv = 0;
				if (IG.getPanAgregar().getCbNivel().getSelectedItem().equals("Uno")) {
					niv = 1;
				}
				juniors.add(new Ingjunior(	cedula,
											IG.getPanAgregar().gettNombre().getText(),
											IG.getPanAgregar().gettApellido().getText(), 
											Integer.parseInt(IG.getPanAgregar().gettAnioIngreso().getText()),
											IG.getPanAgregar().gettGenero().getText(),
											IG.getPanAgregar().gettTel().getText(), 
											IG.getPanAgregar().gettCorreo().getText(), 
											IG.getPanAgregar().gettDireccion().getText(),
											niv
											));
				System.out.println(juniors.get(0));
				escribirEnArchivo();
			}
			if (IG.getPanAgregar().getCbTipoPersonal().getSelectedItem().equals("Ingeniero Senior")) {
				
			}
			if (IG.getPanAgregar().getCbTipoPersonal().getSelectedItem().equals("A comisión")) {
				
			}
			
		}
		
	}

}
