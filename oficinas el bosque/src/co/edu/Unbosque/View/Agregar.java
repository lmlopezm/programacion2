package co.edu.Unbosque.View;

import javax.swing.JFrame;

import java.awt.Color;
import java.awt.Toolkit;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JButton;

public class Agregar extends JFrame {
	private JPanel panelContenedor;
	private JLabel lblLogoPersona;
	private JTextField txtNombre;
	private JTextField txtApellido;
	private JTextField txtanioIngreso;
	private JTextField txtCedula;
	private JTextField txtgenero;
	private JLabel lblApellido;
	private JLabel lblCedula;
	private JLabel lblgenero;
	private JLabel lbltelefono;
	private JTextField txttelefono;
	private JComboBox boxFacultad;
	private JLabel lblFacultad;
	private JButton btnAgregar;
	private JButton btnModificar;
	private JButton btnAtras;
	private JLabel lblNombre;
	private JLabel lblanioIngreso;
	private JLabel lblMakoa;

	public Agregar() {
		/**
		 * Caracteristicas de la ventana
		 */
		setIconImage(Toolkit.getDefaultToolkit().getImage(Agregar.class.getResource("/images/logo bosque png.png")));
		setTitle("Oficinas el bosque");
		setSize(450, 460);
		setResizable(false);
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		setLocationRelativeTo(null);

		/**
		 * Panel Contenedor, donde se agrega todo
		 */
		panelContenedor = new JPanel();
		panelContenedor.setBackground(new Color(255, 153, 102));
		getContentPane().add(panelContenedor);
		panelContenedor.setLayout(null);

		/**
		 * Etiqueta vacia donde se intorduce la imagen de un usuario para hacer mas
		 * intuitiva la interaccion
		 */
		lblLogoPersona = new JLabel("");
		lblLogoPersona.setIcon(new ImageIcon(Agregar.class.getResource("/images/Icon image 3.png")));
		lblLogoPersona.setBounds(171, 32, 81, 88);
		panelContenedor.add(lblLogoPersona);

		/**
		 * Etiqueta del nombre
		 */
		lblNombre = new JLabel("Nombre:");
		lblNombre.setFont(new Font("MS Reference Sans Serif", Font.PLAIN, 13));
		lblNombre.setBounds(37, 157, 68, 23);
		panelContenedor.add(lblNombre);

		/**
		 * Txt donde se encuentra el nombre del sujeto
		 */
		txtNombre = new JTextField();
		txtNombre.setBounds(131, 160, 121, 20);
		panelContenedor.add(txtNombre);
		txtNombre.setColumns(10);

		/**
		 * Etiqueta del apellido
		 */
		lblApellido = new JLabel("Apellido:");
		lblApellido.setFont(new Font("MS Reference Sans Serif", Font.PLAIN, 13));
		lblApellido.setBounds(37, 191, 68, 23);
		panelContenedor.add(lblApellido);

		/**
		 * Txt donde se encuentra el apellido del sujeto
		 */
		txtApellido = new JTextField();
		txtApellido.setColumns(10);
		txtApellido.setBounds(131, 194, 121, 20);
		panelContenedor.add(txtApellido);

		/**
		 * Etiqueta de la edad
		 */
		lblanioIngreso = new JLabel("añoingreso:");
		lblanioIngreso.setFont(new Font("MS Reference Sans Serif", Font.PLAIN, 13));
		lblanioIngreso.setBounds(37, 225, 68, 23);
		panelContenedor.add(lblanioIngreso);

		/**
		 * Txt donde se encuentra la edad del sujeto
		 */
		txtanioIngreso = new JTextField();
		txtanioIngreso.setColumns(10);
		txtanioIngreso.setBounds(131, 228, 121, 20);
		panelContenedor.add(txtanioIngreso);

		/**
		 * Etiqueta del codigo o identificación
		 */
		lblCedula = new JLabel("Cedula:");
		lblCedula.setFont(new Font("MS Reference Sans Serif", Font.PLAIN, 13));
		lblCedula.setBounds(37, 259, 68, 23);
		panelContenedor.add(lblCedula);

		/**
		 * Txt donde se encuentra el codigo o identificació del sujeto
		 */
		txtCedula = new JTextField();
		txtCedula.setColumns(10);
		txtCedula.setBounds(131, 262, 121, 20);
		panelContenedor.add(txtCedula);

		/**
		 * Etiqueta del la carrera
		 */
		lblgenero = new JLabel("Genero:");
		lblgenero.setFont(new Font("MS Reference Sans Serif", Font.PLAIN, 13));
		lblgenero.setBounds(37, 293, 68, 23);
		panelContenedor.add(lblgenero);

		/**
		 * Txt donde se encuentra la carrera cursa por el sujeto
		 */
		txtgenero = new JTextField();
		txtgenero.setColumns(10);
		txtgenero.setBounds(131, 296, 121, 20);
		panelContenedor.add(txtgenero);

		/**
		 * Etiqueta de la ciudad
		 */
		lbltelefono = new JLabel("Telefono:");
		lbltelefono.setFont(new Font("MS Reference Sans Serif", Font.PLAIN, 13));
		lbltelefono.setBounds(37, 327, 68, 23);
		panelContenedor.add(lbltelefono);

		/**
		 * Txt donde se encuentra la ciudad de origen del sujeto
		 */
		txttelefono = new JTextField();
		txttelefono.setColumns(10);
		txttelefono.setBounds(131, 330, 121, 20);
		panelContenedor.add(txttelefono);

		/**
		 * Combo box donde se encuentran las opciones de las diferentes facultades que
		 * hay
		 */
		boxFacultad = new JComboBox();
		boxFacultad.setBounds(131, 361, 121, 20);
		panelContenedor.add(boxFacultad);

		/**
		 * Etiqueta de la facultad
		 */
		lblFacultad = new JLabel("trabajador :");
		lblFacultad.setFont(new Font("MS Reference Sans Serif", Font.PLAIN, 13));
		lblFacultad.setBounds(37, 361, 68, 23);
		panelContenedor.add(lblFacultad);

		/**
		 * Boton que agrega al la lista un estudiante con los datos ingresados en los
		 * campos
		 */
		btnAgregar = new JButton("Agregar");
		btnAgregar.setFont(new Font("Monospaced", Font.BOLD, 12));
		btnAgregar.setActionCommand("AGREGAR");
		btnAgregar.setBounds(292, 158, 106, 23);
		panelContenedor.add(btnAgregar);

		/**
		 * Boton que modifica los datos del estudiante encontrado despues de haber sido
		 * buscado mediante su codigo en la ventana principal
		 */
		btnModificar = new JButton("Modificar");
		btnModificar.setFont(new Font("Monospaced", Font.BOLD, 12));
		btnModificar.setActionCommand("MODIFICAR");
		btnModificar.setBounds(292, 193, 106, 23);
		panelContenedor.add(btnModificar);

		/**
		 * Boton que cierra la ventana y vueve a la ventana principal
		 */
		btnAtras = new JButton("Atras");
		btnAtras.setFont(new Font("Monospaced", Font.BOLD, 12));
		btnAtras.setActionCommand("ATRAS");
		btnAtras.setBounds(292, 227, 106, 23);
		panelContenedor.add(btnAtras);

		/**
		 * Makoa™ marca de agua
		 */
		lblMakoa = new JLabel("Makoa \u2122");
		lblMakoa.setFont(new Font("Monospaced", Font.BOLD, 11));
		lblMakoa.setBounds(358, 399, 52, 14);
		panelContenedor.add(lblMakoa);

		setVisible(true);
	}

	public static void main(String[] args) {
		Agregar i1 = new Agregar();
	}
}
