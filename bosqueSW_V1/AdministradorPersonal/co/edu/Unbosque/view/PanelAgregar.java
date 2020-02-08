package co.edu.Unbosque.view;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.*;

/**
 * 
 * @author Laura López
 *
 */
public class PanelAgregar extends JPanel {

	private static final long serialVersionUID = 1L;

	public static final String GUARDAR = "Guardar";

	public static final String VOLVER = "Volver";

	private JLabel lMensaje;
	private JLabel lNombre;
	private JLabel lApellido;
	private JLabel lCedula;
	private JLabel lGenero;
	private JLabel lTel;
	private JLabel lCorreo;
	private JLabel lDireccion;
	private JLabel AnioIngreso;
	private JLabel tipoPersonal;
	private JLabel Nivel;

	private JTextField tNombre;
	private JTextField tApellido;
	private JTextField tCedula;
	private JTextField tGenero;
	private JTextField tTel;
	private JTextField tCorreo;
	private JTextField tDireccion;
	private JTextField tAnioIngreso;

	private JComboBox<String> cbNivel;
	private JComboBox<String> cbTipoPersonal;

	private JButton bGuardar;
	private JButton bVolver;

	public PanelAgregar() {

		setLayout(null);
		setBackground(new Color(217, 21, 11));

		lMensaje = new JLabel("Agregar nuevo personal");
		lMensaje.setFont(new Font("Tahoma", Font.BOLD, 18));
		lMensaje.setForeground(Color.WHITE);
		lMensaje.setBounds(100, -20, 400, 50);
		add(lMensaje);

		lNombre = new JLabel("Nombre: ");
		lNombre.setFont(new Font("Tahoma", Font.BOLD, 18));
		lNombre.setForeground(Color.WHITE);
		lNombre.setBounds(50, 26, 150, 20);
		add(lNombre);

		tNombre = new JTextField();
		tNombre.setFont(new Font("Tahoma", Font.BOLD, 18));
		tNombre.setForeground(Color.BLACK);
		tNombre.setBounds(170, 26, 180, 20);
		add(tNombre);

		lApellido = new JLabel("Apellido: ");
		lApellido.setFont(new Font("Tahoma", Font.BOLD, 18));
		lApellido.setForeground(Color.WHITE);
		lApellido.setBounds(50, 50, 150, 20);
		add(lApellido);

		tApellido = new JTextField();
		tApellido.setFont(new Font("Tahoma", Font.BOLD, 18));
		tApellido.setForeground(Color.BLACK);
		tApellido.setBounds(170, 50, 180, 20);
		add(tApellido);
		
		lCedula = new JLabel("Cedula: ");
		lCedula.setFont(new Font("Tahoma", Font.BOLD, 18));
		lCedula.setForeground(Color.WHITE);
		lCedula.setBounds(50, 75, 150, 20);
		add(lCedula);

		tCedula = new JTextField();
		tCedula.setFont(new Font("Tahoma", Font.BOLD, 18));
		tCedula.setForeground(Color.BLACK);
		tCedula.setBounds(170, 75, 180, 20);
		add(tCedula);

		lGenero = new JLabel("Género: ");
		lGenero.setFont(new Font("Tahoma", Font.BOLD, 18));
		lGenero.setForeground(Color.WHITE);
		lGenero.setBounds(50, 100, 150, 20);
		add(lGenero);

		tGenero = new JTextField();
		tGenero.setFont(new Font("Tahoma", Font.BOLD, 18));
		tGenero.setForeground(Color.BLACK);
		tGenero.setBounds(170, 100, 180, 20);
		add(tGenero);

		lTel = new JLabel("Telefono: ");
		lTel.setFont(new Font("Tahoma", Font.BOLD, 18));
		lTel.setForeground(Color.WHITE);
		lTel.setBounds(50, 125, 150, 20);
		add(lTel);

		tTel = new JTextField();
		tTel.setFont(new Font("Tahoma", Font.BOLD, 18));
		tTel.setForeground(Color.BLACK);
		tTel.setBounds(170, 125, 180, 20);
		add(tTel);

		lCorreo = new JLabel("Correo: ");
		lCorreo.setFont(new Font("Tahoma", Font.BOLD, 18));
		lCorreo.setForeground(Color.WHITE);
		lCorreo.setBounds(50, 150, 150, 20);
		add(lCorreo);

		tCorreo = new JTextField("  @gmail.com");
		tCorreo.setFont(new Font("Tahoma", Font.BOLD, 18));
		tCorreo.setForeground(Color.BLACK);
		tCorreo.setBounds(170, 150, 180, 20);
		add(tCorreo);

		lDireccion = new JLabel("Dirección: ");
		lDireccion.setFont(new Font("Tahoma", Font.BOLD, 18));
		lDireccion.setForeground(Color.WHITE);
		lDireccion.setBounds(50, 175, 150, 20);
		add(lDireccion);

		tDireccion = new JTextField();
		tDireccion.setFont(new Font("Tahoma", Font.BOLD, 18));
		tDireccion.setForeground(Color.BLACK);
		tDireccion.setBounds(170, 175, 180, 20);
		add(tDireccion);

		AnioIngreso = new JLabel("Año ingreso: ");
		AnioIngreso.setFont(new Font("Tahoma", Font.BOLD, 18));
		AnioIngreso.setForeground(Color.WHITE);
		AnioIngreso.setBounds(50, 200, 150, 20);
		add(AnioIngreso);

		tAnioIngreso = new JTextField();
		tAnioIngreso.setFont(new Font("Tahoma", Font.BOLD, 18));
		tAnioIngreso.setForeground(Color.BLACK);
		tAnioIngreso.setBounds(170, 200, 180, 20);
		add(tAnioIngreso);

		tipoPersonal = new JLabel("Empleado: ");
		tipoPersonal.setFont(new Font("Tahoma", Font.BOLD, 18));
		tipoPersonal.setForeground(Color.WHITE);
		tipoPersonal.setBounds(50, 225, 150, 20);
		add(tipoPersonal);

		cbTipoPersonal = new JComboBox<String>();
		cbTipoPersonal.setFont(new Font("Tahoma", Font.BOLD, 18));
		cbTipoPersonal.setForeground(Color.BLACK);
		cbTipoPersonal.setBounds(170, 225, 180, 20);

		cbTipoPersonal.addItem("Ingeniero Senior");
		cbTipoPersonal.addItem("Ingeniero Junior");
		cbTipoPersonal.addItem("A comisión");
		add(cbTipoPersonal);

		Nivel = new JLabel("Nivel: ");
		Nivel.setFont(new Font("Tahoma", Font.BOLD, 18));
		Nivel.setForeground(Color.WHITE);
		Nivel.setBounds(50, 250, 150, 20);
		add(Nivel);
		Nivel.setVisible(false);

		cbNivel = new JComboBox<String>();
		cbNivel.setFont(new Font("Tahoma", Font.BOLD, 18));
		cbNivel.setForeground(Color.BLACK);
		cbNivel.setBounds(170, 250, 180, 20);
		cbNivel.addItem("Uno");
		cbNivel.addItem("Dos");
		cbNivel.addItem("Tres");
		cbNivel.addItem("Cuatro");
		cbNivel.addItem("Cinco");
		add(cbNivel);
		cbNivel.setVisible(false);

		bGuardar = new JButton("Guardar");
		bGuardar.setFont(new Font("Tahoma", Font.BOLD, 18));
		bGuardar.setBackground(Color.GRAY);
		bGuardar.setForeground(Color.WHITE);
		bGuardar.setBounds(50, 300, 180, 50);
		add(bGuardar);

		bGuardar.setActionCommand(GUARDAR);

		bVolver = new JButton("Volver");
		bVolver.setFont(new Font("Tahoma", Font.BOLD, 18));
		bVolver.setBackground(Color.GRAY);
		bVolver.setForeground(Color.WHITE);
		bVolver.setBounds(220, 430, 150, 24);
		add(bVolver);

		bVolver.setActionCommand(VOLVER);

		cbTipoPersonal.addItemListener(new ItemListener() {

			@SuppressWarnings("unused")
			@Override
			public void itemStateChanged(ItemEvent e) {
				int state = e.getStateChange();
				if (e.getItem() == "Ingeniero Junior") {
					cbNivel.setVisible(true);
					Nivel.setVisible(true);
				} else {
					cbNivel.setVisible(false);
					Nivel.setVisible(false);
				}

			}
		});

	}

	public JLabel getlMensaje() {
		return lMensaje;
	}

	public void setlMensaje(JLabel lMensaje) {
		this.lMensaje = lMensaje;
	}

	public JLabel getlNombre() {
		return lNombre;
	}

	public void setlNombre(JLabel lNombre) {
		this.lNombre = lNombre;
	}

	public JLabel getlApellido() {
		return lApellido;
	}

	public void setlApellido(JLabel lApellido) {
		this.lApellido = lApellido;
	}

	public JLabel getlGenero() {
		return lGenero;
	}

	public void setlGenero(JLabel lGenero) {
		this.lGenero = lGenero;
	}

	public JLabel getlTel() {
		return lTel;
	}

	public void setlTel(JLabel lTel) {
		this.lTel = lTel;
	}

	public JLabel getlCorreo() {
		return lCorreo;
	}

	public void setlCorreo(JLabel lCorreo) {
		this.lCorreo = lCorreo;
	}

	public JLabel getlDireccion() {
		return lDireccion;
	}

	public void setlDireccion(JLabel lDireccion) {
		this.lDireccion = lDireccion;
	}

	public JLabel getAnioIngreso() {
		return AnioIngreso;
	}

	public void setAnioIngreso(JLabel anioIngreso) {
		AnioIngreso = anioIngreso;
	}

	public JLabel getTipoPersonal() {
		return tipoPersonal;
	}

	public void setTipoPersonal(JLabel tipoPersonal) {
		this.tipoPersonal = tipoPersonal;
	}

	public JLabel getNivel() {
		return Nivel;
	}

	public void setNivel(JLabel nivel) {
		Nivel = nivel;
	}

	public JTextField gettNombre() {
		return tNombre;
	}

	public void settNombre(JTextField tNombre) {
		this.tNombre = tNombre;
	}

	public JTextField gettApellido() {
		return tApellido;
	}

	public void settApellido(JTextField tApellido) {
		this.tApellido = tApellido;
	}

	public JTextField gettGenero() {
		return tGenero;
	}

	public void settGenero(JTextField tGenero) {
		this.tGenero = tGenero;
	}

	public JTextField gettTel() {
		return tTel;
	}

	public void settTel(JTextField tTel) {
		this.tTel = tTel;
	}

	public JTextField gettCorreo() {
		return tCorreo;
	}

	public void settCorreo(JTextField tCorreo) {
		this.tCorreo = tCorreo;
	}

	public JTextField gettDireccion() {
		return tDireccion;
	}

	public void settDireccion(JTextField tDireccion) {
		this.tDireccion = tDireccion;
	}

	public JTextField gettAnioIngreso() {
		return tAnioIngreso;
	}

	public void settAnioIngreso(JTextField tAnioIngreso) {
		this.tAnioIngreso = tAnioIngreso;
	}

	public JComboBox<String> getCbNivel() {
		return cbNivel;
	}

	public void setCbNivel(JComboBox<String> cbNivel) {
		this.cbNivel = cbNivel;
	}

	public JComboBox<String> getCbTipoPersonal() {
		return cbTipoPersonal;
	}

	public void setCbTipoPersonal(JComboBox<String> cbTipoPersonal) {
		this.cbTipoPersonal = cbTipoPersonal;
	}

	public JButton getbGuardar() {
		return bGuardar;
	}

	public void setbGuardar(JButton bGuardar) {
		this.bGuardar = bGuardar;
	}

	public JButton getbVolver() {
		return bVolver;
	}

	public void setbVolver(JButton bVolver) {
		this.bVolver = bVolver;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	public static String getGuardar() {
		return GUARDAR;
	}

	public static String getVolver() {
		return VOLVER;
	}

	public JLabel getlCedula() {
		return lCedula;
	}

	public void setlCedula(JLabel lCedula) {
		this.lCedula = lCedula;
	}

	public JTextField gettCedula() {
		return tCedula;
	}

	public void settCedula(JTextField tCedula) {
		this.tCedula = tCedula;
	}
	


}
