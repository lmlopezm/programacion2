package co.edu.Unbosque.controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

import javax.swing.JOptionPane;

import co.edu.Unbosque.Model.Concomision;
import co.edu.Unbosque.Model.Ingjunior;
import co.edu.Unbosque.Model.Ingsenior;
import co.edu.Unbosque.Model.Persona;
import co.edu.Unbosque.view.View;

public class Controller implements ActionListener {

	private View IG;
	private ArrayList<Persona> personas;
	private ObjectInputStream entrada;
	private ObjectOutput salida;
	private File archivo = new File("data/datos.dat");

	public Controller() {

		IG = new View(this);
		IG.setVisible(true);

		personas = new ArrayList<Persona>();

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
//				personas = (ArrayList<Persona>) entrada.readObject();
//			} catch (ClassNotFoundException | IOException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}
//		}

	}

	/**
	 * Metodo que al pasarle por parametro un objeto persona lo escribe en el
	 * archivo
	 * 
	 * @param persona
	 */
	public void escribirEnArchivo(Persona persona) {
		try {
			salida = new ObjectOutputStream(new FileOutputStream(archivo));
			salida.writeObject(personas);
			salida.close();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

	/**
	 * Metodo de agregar empleado por comision el cual hace uso de el metodo buscar
	 * persona para validar si el usuario nuevo ya existe o no
	 * 
	 * @param cedula
	 * @param nombre
	 * @param apellido
	 * @param anioIngreso
	 * @param genero
	 * @param telefono
	 * @param correo
	 * @param direccion
	 * @param Clientes
	 * @param ComisionxCliente
	 * @return
	 */
	public boolean agregarComision(String cedula, String nombre, String apellido, int anioIngreso, String genero,
			String telefono, String correo, String direccion, int Clientes, int ComisionxCliente) {

		Concomision nuevo = new Concomision(cedula, nombre, apellido, anioIngreso, genero, telefono, correo, direccion,
				0, 0);
		if (buscarPersona(cedula) == null) {
			personas.add(nuevo);
			JOptionPane.showMessageDialog(null, "El empleado con: " + cedula + " ha sido agregado", "Oficias el Bosque",
					JOptionPane.INFORMATION_MESSAGE);
			escribirEnArchivo(nuevo);
			return true;
		} else {
			JOptionPane.showMessageDialog(null, "El empleado: " + cedula + " ya se encuentra agregado",
					"Venta Producto TecnoShop", JOptionPane.WARNING_MESSAGE);
			return false;
		}

	}

	public boolean agregarJunior(String cedula, String nombre, String apellido, int anioIngreso, String genero,
			String telefono, String correo, String direccion, int nivel) {
		Ingjunior nuevo = new Ingjunior(cedula, nombre, apellido, anioIngreso, genero, telefono, correo, direccion,
				nivel);
		if (buscarPersona(cedula) == null) {
			personas.add(nuevo);
			JOptionPane.showMessageDialog(null, "El empleado con: " + cedula + " ha sido agregado", "Oficias el Bosque",
					JOptionPane.INFORMATION_MESSAGE);
			escribirEnArchivo(nuevo);
			return true;
		} else {
			JOptionPane.showMessageDialog(null, "El empleado: " + cedula + " ya se encuentra agregado",
					"Venta Producto TecnoShop", JOptionPane.WARNING_MESSAGE);
			return false;
		}

	}

	public boolean agregarSenior(String cedula, String nombre, String apellido, int anioIngreso, String genero,
			String telefono, String correo, String direccion, int numVentas) {

		Ingsenior nuevo = new Ingsenior(cedula, nombre, apellido, anioIngreso, genero, telefono, correo, direccion, 0);
		if (buscarPersona(cedula) == null) {
			personas.add(nuevo);
			JOptionPane.showMessageDialog(null, "El empleado con: " + cedula + " ha sido agregado", "Oficias el Bosque",
					JOptionPane.INFORMATION_MESSAGE);
			escribirEnArchivo(nuevo);
			return true;
		} else {
			JOptionPane.showMessageDialog(null, "El empleado: " + cedula + " ya se encuentra agregado",
					"Venta Producto TecnoShop", JOptionPane.WARNING_MESSAGE);
			return false;
		}

	}

	/**
	 * Metodo que busca en el arreglo de personas, una persona que tenga la cedula
	 * pasada por parametro
	 * 
	 * @param cedula
	 * @return
	 */
	public Persona buscarPersona(String cedula) {
		Persona encontrado = null;

		if (!personas.isEmpty()) {
			System.out.println(personas);
			for (int i = 0; i < personas.size(); i++) {
				if (personas.get(i).getTelefono().equals(cedula)) {
					encontrado = personas.get(i);
					JOptionPane.showMessageDialog(null, "Ingeniero: " + encontrado);
				}
			}
		} else {
			JOptionPane.showMessageDialog(null, "el producto con el ID: " + cedula + " no se encuentra registrado");
		}

		return encontrado;
	}

	/**
	 * Metodo que hace uso de del metodo buscarPersona y elimina al empleado
	 * encontrado del arreglo y del File
	 * 
	 * @param cedula
	 * @return
	 */
	public boolean eliminarPersona(String cedula) {
		Persona eliminado = buscarPersona(cedula);

		if (eliminado != null) {
			personas.remove(eliminado);
			JOptionPane.showMessageDialog(null, "El empleado con Cedula: " + cedula + " ha sido eliminado",
					"Oficinas el Bosque", JOptionPane.INFORMATION_MESSAGE);
			archivo.delete();
			try {
				archivo.createNewFile();
				for (int i = 0; i < personas.size(); i++) {
					escribirEnArchivo(personas.get(i));
				}
			} catch (IOException e) {
				e.printStackTrace();
			}

			return true;
		}
		JOptionPane.showMessageDialog(null, "El empleado con Cedula: " + cedula + " no esta en la base de datos",
				"Oficinas el Bosque", JOptionPane.INFORMATION_MESSAGE);
		return false;
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
			if (IG.getPanBienvenido().gettBuscar().getText() != "") {
				IG.getPanBienvenido().setVisible(false);
				IG.getPanModificar().setVisible(true);
			} else {
				JOptionPane.showMessageDialog(null, "Porfavor ingrese la cedula del empleado");
			}
		}
		// IG.getPanBienvenido().gettBuscar().getText() != ""

		if (e.getActionCommand().equals("Volver2")) {
			IG.getPanModificar().setVisible(false);
			IG.getPanBienvenido().setVisible(true);
		}
		if (e.getActionCommand().equals("Borrar")) {

			System.out.println("Borrando...");
		}
		if (e.getActionCommand().equals("Guardar")) {
			if (IG.getPanAgregar().getCbTipoPersonal().equals("Ingeniero Junior")) {
				agregarJunior(IG.getPanAgregar().gettCedula().getText(), IG.getPanAgregar().gettNombre().getText(),
						IG.getPanAgregar().gettApellido().getText(),
						Integer.parseInt(IG.getPanAgregar().gettAnioIngreso().getText()),
						IG.getPanAgregar().gettGenero().getText(), IG.getPanAgregar().gettTel().getText(),
						IG.getPanAgregar().gettCorreo().getText(), IG.getPanAgregar().gettCorreo().getText(),
						Integer.parseInt(IG.getPanAgregar().getNivel().getText()));
				System.out.println("Se agrego ing Junior");
				IG.getPanBienvenido().setVisible(true);
				IG.getPanAgregar().setVisible(false);
			} else if (IG.getPanAgregar().getCbTipoPersonal().equals("Ingeniero Senior")) {
				agregarSenior(IG.getPanAgregar().gettCedula().getText(), IG.getPanAgregar().gettNombre().getText(),
						IG.getPanAgregar().gettApellido().getText(),
						Integer.parseInt(IG.getPanAgregar().gettAnioIngreso().getText()),
						IG.getPanAgregar().gettGenero().getText(), IG.getPanAgregar().gettTel().getText(),
						IG.getPanAgregar().gettCorreo().getText(), IG.getPanAgregar().gettCorreo().getText(), 0);
				System.out.println("Se agrego ing Senior");
				IG.getPanBienvenido().setVisible(true);
				IG.getPanAgregar().setVisible(false);
			} else if (IG.getPanAgregar().getCbTipoPersonal().equals("A comisión")) {
				agregarComision(IG.getPanAgregar().gettCedula().getText(), IG.getPanAgregar().gettNombre().getText(),
						IG.getPanAgregar().gettApellido().getText(),
						Integer.parseInt(IG.getPanAgregar().gettAnioIngreso().getText()),
						IG.getPanAgregar().gettGenero().getText(), IG.getPanAgregar().gettTel().getText(),
						IG.getPanAgregar().gettCorreo().getText(), IG.getPanAgregar().gettCorreo().getText(), 0, 0);
				System.out.println("Se agrego a Comision");
				IG.getPanBienvenido().setVisible(true);
				IG.getPanAgregar().setVisible(false);
			}
		}

	}

}
