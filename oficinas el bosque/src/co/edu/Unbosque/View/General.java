package co.edu.Unbosque.View;

import java.awt.Color;
import java.awt.Font;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JTextField;
import java.awt.Toolkit;

public class General extends JFrame {
	private JPanel panelContenedor;
	private JLabel lblMakoa;
	private JLabel lblBienvenida;
	private JLabel lblBuscar;
	private JTextField txtBuscarIng;
	private JButton btnAgregar;
	private JButton btnBuscar;
	private JLabel lblLogo;
	private JButton btnSalir;

	public General() {
		setIconImage(Toolkit.getDefaultToolkit().getImage(General.class.getResource("/images/logo bosque png.png")));
		// Ventana Principal Caracteristicas
		setTitle("Oficinas el Bosque");
		setResizable(false);
		setSize(426, 293);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLocationRelativeTo(null);

		/**
		 * Creacion de panel Contenedor
		 */

		panelContenedor = new JPanel();
		panelContenedor.setBackground(new Color(255, 153, 102));
		getContentPane().add(panelContenedor);
		panelContenedor.setLayout(null);

		/**
		 * Mensaje de Bienvenida, intuitivo con el usuario
		 */
		lblBienvenida = new JLabel("Bienvenido a las oficinas del bosque.");
		lblBienvenida.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 12));
		lblBienvenida.setBounds(26, 35, 226, 24);
		panelContenedor.add(lblBienvenida);

		/**
		 * Makoa™ marca de agua
		 */
		lblMakoa = new JLabel("Makoa \u2122");
		lblMakoa.setFont(new Font("Monospaced", Font.BOLD, 11));
		lblMakoa.setBounds(358, 239, 52, 14);
		panelContenedor.add(lblMakoa);

		/**
		 * Etiqueta Trabajador estudiante
		 */
		lblBuscar = new JLabel("Buscar Trabajador:");
		lblBuscar.setFont(new Font("MS Reference Sans Serif", Font.PLAIN, 13));
		lblBuscar.setBounds(26, 96, 135, 14);
		panelContenedor.add(lblBuscar);

		/**
		 * Txt para digitar cedula del trabajador a buscar
		 */
		txtBuscarIng = new JTextField();
		txtBuscarIng.setBounds(164, 95, 117, 20);
		panelContenedor.add(txtBuscarIng);
		txtBuscarIng.setColumns(10);

		/**
		 * Boton de accion para buscar al trabajador
		 */
		btnBuscar = new JButton("Buscar");
		btnBuscar.setActionCommand("BUSCAR");
		btnBuscar.setFont(new Font("Monospaced", Font.BOLD, 12));
		btnBuscar.setBounds(26, 121, 89, 23);
		panelContenedor.add(btnBuscar);

		/**
		 * Boton de accion que dirige al usuario a una ventana donde puede ingresar los
		 * datos del sujeto a registrar
		 */
		btnAgregar = new JButton("Agregar trabajador");
		btnAgregar.setActionCommand("AGREGAR");
		btnAgregar.setFont(new Font("Monospaced", Font.BOLD, 12));
		btnAgregar.setBounds(26, 158, 171, 23);
		panelContenedor.add(btnAgregar);

		/**
		 * Logo de la Universidad El bosque
		 */
		lblLogo = new JLabel("");
		lblLogo.setIcon(new ImageIcon(General.class.getResource("/images/logo bosque.png")));
		lblLogo.setBounds(291, 53, 110, 97);
		panelContenedor.add(lblLogo);
		
		btnSalir = new JButton("Salir");
		btnSalir.setFont(new Font("Monospaced", Font.BOLD, 12));
		btnSalir.setActionCommand("SALIR");
		btnSalir.setBounds(26, 192, 89, 23);
		panelContenedor.add(btnSalir);
		setVisible(true);

	}

	public static void main(String[] args) {
		General g1 = new General();
	}
}
