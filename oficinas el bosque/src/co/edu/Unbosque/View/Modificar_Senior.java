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

public class Modificar_Senior extends JFrame {
	private JPanel panelContenedor;
	private JLabel lblLogoPersona;
	private JTextField txtNombre;
	private JTextField txtApellido;
	private JTextField txtCedula;
	private JTextField txtgenero;
	private JLabel lblApellido;
	private JLabel lblTelefono;
	private JLabel lblCedula;
	private JLabel lblDireccion;
	private JTextField txttelefono;
	private JLabel lblAñoIngreso;
	private JButton btnModificar;
	private JButton btnAtras;
	private JLabel lblNombre;
	private JLabel lblGenero;
	private JLabel lblMakoa;
	private JTextField txtDireccion;
	private JTextField txtAnioIngreso;
	private JLabel lblTrabajador;
	private JComboBox TipoingCombo;
	private JLabel lblNivel;
	private JLabel lblSueldo;
	private JLabel lblValorSueldo;
	private JTextField txtVentas;

	public Modificar_Senior() {
		/**
		 * Caracteristicas de la ventana
		 */
		setIconImage(Toolkit.getDefaultToolkit().getImage(Modificar_Senior.class.getResource("/images/logo bosque png.png")));
		setTitle("Oficinas el bosque");
		setSize(450, 473);
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
		lblLogoPersona.setIcon(new ImageIcon(Modificar_Senior.class.getResource("/images/Icon image 3.png")));
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
		lblGenero = new JLabel("Genero:");
		lblGenero.setFont(new Font("MS Reference Sans Serif", Font.PLAIN, 13));
		lblGenero.setBounds(37, 225, 68, 23);
		panelContenedor.add(lblGenero);

		/**
		 * Etiqueta del codigo o identificación
		 */
		lblTelefono = new JLabel("Telefono:");
		lblTelefono.setFont(new Font("MS Reference Sans Serif", Font.PLAIN, 13));
		lblTelefono.setBounds(37, 259, 68, 23);
		panelContenedor.add(lblTelefono);

		/**
		 * Txt donde se encuentra el codigo o identificació del sujeto
		 */
		txtCedula = new JTextField();
		txtCedula.setColumns(10);
		txtCedula.setBounds(131, 296, 121, 20);
		panelContenedor.add(txtCedula);

		/**
		 * Etiqueta del la carrera
		 */
		lblCedula = new JLabel("Correo:");
		lblCedula.setFont(new Font("MS Reference Sans Serif", Font.PLAIN, 13));
		lblCedula.setBounds(37, 293, 68, 23);
		panelContenedor.add(lblCedula);

		/**
		 * Txt donde se encuentra la carrera cursa por el sujeto
		 */
		txtgenero = new JTextField();
		txtgenero.setColumns(10);
		txtgenero.setBounds(131, 228, 121, 20);
		panelContenedor.add(txtgenero);

		/**
		 * Etiqueta de la ciudad
		 */
		lblDireccion = new JLabel("Direcci\u00F3n:");
		lblDireccion.setFont(new Font("MS Reference Sans Serif", Font.PLAIN, 13));
		lblDireccion.setBounds(37, 327, 68, 23);
		panelContenedor.add(lblDireccion);

		/**
		 * Txt donde se encuentra la ciudad de origen del sujeto
		 */
		txttelefono = new JTextField();
		txttelefono.setColumns(10);
		txttelefono.setBounds(131, 262, 121, 20);
		panelContenedor.add(txttelefono);

		/**
		 * Etiqueta de la facultad
		 */
		lblAñoIngreso = new JLabel("A\u00F1o Ingreso:");
		lblAñoIngreso.setFont(new Font("MS Reference Sans Serif", Font.PLAIN, 13));
		lblAñoIngreso.setBounds(37, 361, 85, 23);
		panelContenedor.add(lblAñoIngreso);

		/**
		 * Boton que modifica los datos del estudiante encontrado despues de haber sido
		 * buscado mediante su codigo en la ventana principal
		 */
		btnModificar = new JButton("Modificar");
		btnModificar.setFont(new Font("Monospaced", Font.BOLD, 12));
		btnModificar.setActionCommand("MODIFICAR");
		btnModificar.setBounds(292, 270, 106, 23);
		panelContenedor.add(btnModificar);

		/**
		 * Boton que cierra la ventana y vueve a la ventana principal
		 */
		btnAtras = new JButton("Atras");
		btnAtras.setFont(new Font("Monospaced", Font.BOLD, 12));
		btnAtras.setActionCommand("ATRAS");
		btnAtras.setBounds(292, 305, 106, 23);
		panelContenedor.add(btnAtras);

		/**
		 * Makoa™ marca de agua
		 */
		lblMakoa = new JLabel("Makoa \u2122");
		lblMakoa.setFont(new Font("Monospaced", Font.BOLD, 11));
		lblMakoa.setBounds(358, 399, 52, 14);
		panelContenedor.add(lblMakoa);
		
		txtDireccion = new JTextField();
		txtDireccion.setColumns(10);
		txtDireccion.setBounds(131, 330, 121, 20);
		panelContenedor.add(txtDireccion);
		
		txtAnioIngreso = new JTextField();
		txtAnioIngreso.setColumns(10);
		txtAnioIngreso.setBounds(131, 364, 121, 20);
		panelContenedor.add(txtAnioIngreso);
		
		lblTrabajador = new JLabel("Trabajador:");
		lblTrabajador.setFont(new Font("MS Reference Sans Serif", Font.PLAIN, 13));
		lblTrabajador.setBounds(37, 395, 85, 23);
		panelContenedor.add(lblTrabajador);
		
		TipoingCombo = new JComboBox();
		TipoingCombo.setBounds(131, 396, 121, 24);
		panelContenedor.add(TipoingCombo);
		
		lblNivel = new JLabel("Numero de Ventas:");
		lblNivel.setFont(new Font("MS Reference Sans Serif", Font.PLAIN, 13));
		lblNivel.setBounds(292, 157, 127, 23);
		panelContenedor.add(lblNivel);
		
		lblSueldo = new JLabel("Sueldo:");
		lblSueldo.setFont(new Font("MS Reference Sans Serif", Font.PLAIN, 13));
		lblSueldo.setBounds(292, 208, 58, 23);
		panelContenedor.add(lblSueldo);
		
		lblValorSueldo = new JLabel("000000");
		lblValorSueldo.setFont(new Font("MS Reference Sans Serif", Font.PLAIN, 13));
		lblValorSueldo.setBounds(292, 236, 58, 23);
		panelContenedor.add(lblValorSueldo);
		
		txtVentas = new JTextField();
		txtVentas.setColumns(10);
		txtVentas.setBounds(292, 179, 81, 20);
		panelContenedor.add(txtVentas);

		setVisible(true);
	}

	public static void main(String[] args) {
		Modificar_Senior i1 = new Modificar_Senior();
	}
}
