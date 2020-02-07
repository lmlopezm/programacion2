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
	private JTextField txtBuscarEst;
	private JButton btnAgregar;
	private JButton btnBuscar;
	private JList listaEstudiantes;
	private JButton btnBorrar;
	private JLabel lblLogo;
	private JLabel lblBorrar;
	private JTextField txtBorrarEst;
	private JButton btnMateria;

	public General() {
		setIconImage(Toolkit.getDefaultToolkit().getImage(General.class.getResource("/images/logo bosque png.png")));
		// Ventana Principal Caracteristicas
		setTitle("Oficinas el Bosque");
		setResizable(false);
		setSize(676, 350);
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
		lblBienvenida.setBounds(161, 11, 226, 24);
		panelContenedor.add(lblBienvenida);

		/**
		 * Makoa™ marca de agua
		 */
		lblMakoa = new JLabel("Makoa \u2122");
		lblMakoa.setFont(new Font("Monospaced", Font.BOLD, 11));
		lblMakoa.setBounds(606, 295, 52, 14);
		panelContenedor.add(lblMakoa);

		/**
		 * Etiqueta buscar estudiante
		 */
		lblBuscar = new JLabel("Buscar estudiante:");
		lblBuscar.setFont(new Font("MS Reference Sans Serif", Font.PLAIN, 13));
		lblBuscar.setBounds(26, 152, 125, 14);
		panelContenedor.add(lblBuscar);

		/**
		 * Txt para digitar cedula del estudiante a buscar
		 */
		txtBuscarEst = new JTextField();
		txtBuscarEst.setBounds(161, 151, 117, 20);
		panelContenedor.add(txtBuscarEst);
		txtBuscarEst.setColumns(10);

		/**
		 * Boton de accion para buscar al estudiante
		 */
		btnBuscar = new JButton("Buscar");
		btnBuscar.setActionCommand("BUSCAR");
		btnBuscar.setFont(new Font("Monospaced", Font.BOLD, 12));
		btnBuscar.setBounds(288, 149, 89, 23);
		panelContenedor.add(btnBuscar);

		/**
		 * Boton de accion que dirige al usuario a una ventana donde puede ingresar los
		 * datos del sujeto a registrar
		 */
		btnAgregar = new JButton("Agregar Estudiante");
		btnAgregar.setActionCommand("AGREGAR");
		btnAgregar.setFont(new Font("Monospaced", Font.BOLD, 12));
		btnAgregar.setBounds(26, 226, 171, 23);
		panelContenedor.add(btnAgregar);

		/**
		 * Boton de accion que permite al usuario eliminar al usuario de la lista
		 */
		btnBorrar = new JButton("Borrar");
		btnBorrar.setActionCommand("BORRAR");
		btnBorrar.setFont(new Font("Monospaced", Font.BOLD, 12));
		btnBorrar.setBounds(288, 181, 89, 24);
		panelContenedor.add(btnBorrar);

		/**
		 * Etiqueta de borrar Estudiante
		 */
		lblBorrar = new JLabel("Eliminar estudiante:");
		lblBorrar.setFont(new Font("MS Reference Sans Serif", Font.PLAIN, 13));
		lblBorrar.setBounds(26, 185, 136, 14);
		panelContenedor.add(lblBorrar);

		/**
		 * Txt donde se escribe la cedula del estudiante a eliminar
		 */
		txtBorrarEst = new JTextField();
		txtBorrarEst.setColumns(10);
		txtBorrarEst.setBounds(161, 182, 117, 20);
		panelContenedor.add(txtBorrarEst);

		/**
		 * Lista donde se muestran todos los estudiantes
		 */
		listaEstudiantes = new JList();
		listaEstudiantes.setBounds(430, 41, 213, 243);
		panelContenedor.add(listaEstudiantes);

		/**
		 * Logo de la Universidad El bosque
		 */
		lblLogo = new JLabel("");
		lblLogo.setIcon(new ImageIcon(General.class.getResource("/images/logo bosque.png")));
		lblLogo.setBounds(26, 41, 110, 97);
		panelContenedor.add(lblLogo);

		/**
		 * Boton que redirige al usuario a una ventana donde puede agregar una materia a
		 * la lista interna de cursos dictados por la facultad
		 */
		btnMateria = new JButton("Agregar Materia");
		btnMateria.setFont(new Font("Monospaced", Font.BOLD, 12));
		btnMateria.setActionCommand("AGREGARM");
		btnMateria.setBounds(26, 261, 171, 23);
		panelContenedor.add(btnMateria);
		setVisible(true);

	}

	public static void main(String[] args) {
		General g1 = new General();
	}
}
