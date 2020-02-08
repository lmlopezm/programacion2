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
	 * Metodo agregar una persona en el archivo <b> pre </b> El arreglo personas ya
	 * esta creado. <b> post </b> Se ha agregado un nuevo objeto y se ha agregado al
	 * arreglo.
	 * 
	 * @param persona persona != null. persona != "".
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
	 * metodo agregar <b> pre </b> que existan los parametros <b> post </b> agregar
	 * un usuario
	 * 
	 * @param cedula           es la cedula del usuario. cedula!=null, cedula!=""
	 * @param nombre           es el nombre del usuario. nombre!="", nombre!=""
	 * @param apellido         es el apellido del usuario. apellido!=null,
	 *                         apellido!=""
	 * @param anioIngreso      es el anioIngreso del usuario. anioIngreso!=null,
	 *                         anioIngreso!=""
	 * @param genero           es el genero del usuario. genero!="", genero!=null
	 * @param telefono         es el telefono. telefono!="", telefono!=null
	 * @param correo           es el correo del usuario. correo!="", correo!=""
	 * @param direccion        es la direccion del usuario. direccion!="",
	 *                         direccion!=null
	 * @param Clientes         es el nClientes del usuario. Clientes!="",
	 *                         Clientes!=null
	 * @param ComisionxCliente es la ComisionxCliente del usuario.
	 *                         ComisionxCliente!="", ComisionxCliente!=null
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

	/**
	 * metodo agregar <b> pre </b> que existan los parametros <b> post </b> agregar
	 * un usuario
	 * 
	 * @param cedula      es la cedula del usuario. cedula!=null, cedula!=""
	 * @param nombre      es el nombre del usuario. nombre!="", nombre!=""
	 * @param apellido    es el apellido del usuario. apellido!=null, apellido!=""
	 * @param anioIngreso es el anioIngreso del usuario. anioIngreso!=null,
	 *                    anioIngreso!=""
	 * @param genero      es el genero del usuario. genero!="", genero!=null
	 * @param telefono    es el telefono. telefono!="", telefono!=null
	 * @param correo      es el correo del usuario. correo!="", correo!=""
	 * @param direccion   es la direccion del usuario. direccion!="",
	 *                    direccion!=null
	 * @param nivel       es el nivel del usuario. nivel!="", nivel!=null
	 * @return
	 */
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

	/**
	 * metodo agregar <b> pre </b> que existan los parametros <b> post </b> agregar
	 * un usuario
	 * 
	 * @param cedula           es la cedula del usuario. cedula!=null, cedula!=""
	 * @param nombre           es el nombre del usuario. nombre!="", nombre!=""
	 * @param apellido         es el apellido del usuario. apellido!=null,
	 *                         apellido!=""
	 * @param anioIngreso      es el anioIngreso del usuario. anioIngreso!=null,
	 *                         anioIngreso!=""
	 * @param genero           es el genero del usuario. genero!="", genero!=null
	 * @param telefono         es el telefono. telefono!="", telefono!=null
	 * @param correo           es el correo del usuario. correo!="", correo!=""
	 * @param direccion        es la direccion del usuario. direccion!="",
	 *                         direccion!=null
	 * @param Clientes         es el nClientes del usuario. Clientes!="",
	 *                         Clientes!=null
	 * @param ComisionxCliente es el ComisionxCliente del usuario.
	 *                         ComisionxCliente!="", ComisionxCliente!=null
	 * @return
	 */
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
	 * metodo buscar usuario <b> pre </b> que existan los parametros <b> post </b>
	 * buscar un usuario
	 * 
	 * @param cedula es la cedula del usuario. cedula!="", cedula!=null
	 * @return encontrado
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
			if (IG.getPanAgregar().getCbTipoPersonal().getSelectedItem().equals("Ingeniero Junior")) {
				int niv = 0;
				if (IG.getPanAgregar().getCbNivel().getSelectedItem().equals("Uno")) {
					niv = 1;
				} else if (IG.getPanAgregar().getCbNivel().getSelectedItem().equals("Dos")) {
					niv = 2;
				} else if (IG.getPanAgregar().getCbNivel().getSelectedItem().equals("Tres")) {
					niv = 3;
				} else if (IG.getPanAgregar().getCbNivel().getSelectedItem().equals("Cuatro")) {
					niv = 4;
				} else if (IG.getPanAgregar().getCbNivel().getSelectedItem().equals("Cinco")) {
					niv = 5;
				}
				agregarJunior(IG.getPanAgregar().gettCedula().getText(), IG.getPanAgregar().gettNombre().getText(),
						IG.getPanAgregar().gettApellido().getText(),
						Integer.parseInt(IG.getPanAgregar().gettAnioIngreso().getText()),
						IG.getPanAgregar().gettGenero().getText(), IG.getPanAgregar().gettTel().getText(),
						IG.getPanAgregar().gettCorreo().getText(), IG.getPanAgregar().gettCorreo().getText(), niv);
				System.out.println("Se agrego ing Junior");
				IG.getPanBienvenido().setVisible(true);
				IG.getPanAgregar().setVisible(false);
				System.out.println(personas);
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
