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

	public boolean agregarComision(String cedula, String nombre, String apellido, int anioIngreso, String genero,
			String telefono, String correo, String direccion, int Clientes, int ComisionxCliente) {

		Concomision nuevo = new Concomision(IG.getPanAgregar().gettCedula().getText(),
				IG.getPanAgregar().gettNombre().getText(), IG.getPanAgregar().gettApellido().getText(),
				Integer.parseInt(IG.getPanAgregar().gettAnioIngreso().getText()),
				IG.getPanAgregar().gettGenero().getText(), IG.getPanAgregar().gettTel().getText(),
				IG.getPanAgregar().gettCorreo().getText(), IG.getPanAgregar().gettCorreo().getText(), 0, 0);
		if (buscarProducto(cedula) == null) {
			personas.add(nuevo);
			JOptionPane.showMessageDialog(null, "El empleado con: " + cedula + " ha sido agregado", "Oficias el Bosque",
					JOptionPane.INFORMATION_MESSAGE);
			return true;
		} else {
			JOptionPane.showMessageDialog(null, "El empleado: " + cedula + " ya se encuentra agregado",
					"Venta Producto TecnoShop", JOptionPane.WARNING_MESSAGE);
			return false;
		}

	}

	public Persona buscarProducto(String identificador) {
		Persona encontrado = null;

		if (!personas.isEmpty()) {
			System.out.println(personas);
			for (int i = 0; i < personas.size(); i++) {
				if (personas.get(i).getTelefono().equals(identificador)) {
					encontrado = personas.get(i);
					JOptionPane.showMessageDialog(null, "Ingeniero: " + encontrado);
				}
			}
		} else {
			JOptionPane.showMessageDialog(null,
					"el producto con el ID: " + identificador + " no se encuentra registrado");
		}

		return encontrado;
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
		if (e.getActionCommand().equals("Borrar")) {
			System.out.println("Borrando...");
		}
		if (e.getActionCommand().equals("Guardar")) {
//			Senior
//			Persona nuevo = new Persona(IG.getPanAgregar().gettCedula().getText(),
//					IG.getPanAgregar().gettNombre().getText(), IG.getPanAgregar().gettApellido().getText(),
//					Integer.parseInt(IG.getPanAgregar().gettAnioIngreso().getText()),
//					IG.getPanAgregar().gettGenero().getText(), IG.getPanAgregar().gettTel().getText(),
//					IG.getPanAgregar().gettCorreo().getText(), IG.getPanAgregar().gettDireccion().getText()) {
//				int Calcular_salario() {
//					int i = 0;
//					return i;
//				}
//			};
		}

	}

}
