package co.edu.Unbosque.view;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.*;

public class PanelModificar extends JPanel{

	private static final long serialVersionUID = 1L;
	
	public static final String MODIFICAR = "Modificar";
	
	public static final String VOLVER2 = "Volver2";
	
	public static final String BORRAR = "Borrar";

	
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
	private JLabel lSueldo;
	private JLabel lNumVentas;
	private JLabel lClientesCaptados;
	private JLabel lMontoPorCliente;
	
	private JTextField tNombre;	
	private JTextField tApellido;
	private JTextField tCedula;
	private JTextField tGenero;	
	private JTextField tTel;	
	private JTextField tCorreo;	
	private JTextField tDireccion;	
	private JTextField tAnioIngreso;
	private JTextField tNumVentas;
	private JTextField tCliCaptados;
	private JTextField tMontoCliente;
	
	private JComboBox<String> cbNivel;
	private JComboBox<String> cbTipoPersonal;
	
	private JButton bModificar;	
	private JButton bVolver2;
	private JButton bBorrar;

	
	public PanelModificar() {
		
		setLayout(null);
		setBackground(new Color(217, 21, 11));
		
		lMensaje = new JLabel("Modificar personal");
		lMensaje.setFont(new Font("Tahoma", Font.BOLD, 18));
		lMensaje.setForeground(Color.WHITE);
		lMensaje.setBounds(120, -18, 400, 50);
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
		
		lGenero = new JLabel("G�nero: ");
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
		
		tCorreo = new JTextField(" ");
		tCorreo.setFont(new Font("Tahoma", Font.BOLD, 18));
		tCorreo.setForeground(Color.BLACK);
		tCorreo.setBounds(170, 150, 180, 20);
		add(tCorreo);
		
		lDireccion = new JLabel("Direcci�n: ");
		lDireccion.setFont(new Font("Tahoma", Font.BOLD, 18));
		lDireccion.setForeground(Color.WHITE);
		lDireccion.setBounds(50, 175, 150, 20);
		add(lDireccion);
		
		tDireccion = new JTextField();
		tDireccion.setFont(new Font("Tahoma", Font.BOLD, 18));
		tDireccion.setForeground(Color.BLACK);
		tDireccion.setBounds(170, 175, 180, 20);
		add(tDireccion);
		
		AnioIngreso = new JLabel("A�o ingreso: ");
		AnioIngreso.setFont(new Font("Tahoma", Font.BOLD, 18));
		AnioIngreso.setForeground(Color.WHITE);
		AnioIngreso.setBounds(50, 200, 150, 20);
		add(AnioIngreso);
		
		tAnioIngreso = new JTextField();
		tAnioIngreso.setFont(new Font("Tahoma", Font.BOLD, 18));
		tAnioIngreso.setForeground(Color.BLACK);
		tAnioIngreso.setBounds(170, 200, 180, 20);
		add(tAnioIngreso);
		
		lSueldo = new JLabel("Sueldo: 00000");
		lSueldo.setFont(new Font("Tahoma", Font.BOLD, 18));
		lSueldo.setForeground(Color.WHITE);
		lSueldo.setBounds(130, 235, 150, 20);
		add(lSueldo);
		
		tipoPersonal = new JLabel("Empleado: ");
		tipoPersonal.setFont(new Font("Tahoma", Font.BOLD, 18));
		tipoPersonal.setForeground(Color.WHITE);
		tipoPersonal.setBounds(50, 275, 150, 20);
		add(tipoPersonal);
		
		cbTipoPersonal = new JComboBox<String>();
		cbTipoPersonal.setFont(new Font("Tahoma", Font.BOLD, 18));
		cbTipoPersonal.setForeground(Color.BLACK);
		cbTipoPersonal.setBounds(170, 275, 180, 20);		
		cbTipoPersonal.addItem(" ");
		cbTipoPersonal.addItem("Ingeniero Senior");
		cbTipoPersonal.addItem("Ingeniero Junior");
		cbTipoPersonal.addItem("A comisi�n");		
		add(cbTipoPersonal);
		
		Nivel = new JLabel("Nivel: ");
		Nivel.setFont(new Font("Tahoma", Font.BOLD, 18));
		Nivel.setForeground(Color.WHITE);
		Nivel.setBounds(50, 300, 150, 20);
		add(Nivel);
		Nivel.setVisible(false);
		
		cbNivel = new JComboBox<String>();
		cbNivel.setFont(new Font("Tahoma", Font.BOLD, 18));
		cbNivel.setForeground(Color.BLACK);
		cbNivel.setBounds(170, 300, 180, 20);
		cbNivel.addItem("Uno");
		cbNivel.addItem("Dos");
		cbNivel.addItem("Tres");	
		cbNivel.addItem("Cuatro");
		cbNivel.addItem("Cinco");
		add(cbNivel);
		cbNivel.setVisible(false);
		
		lNumVentas = new JLabel("# Ventas: ");
		lNumVentas.setFont(new Font("Tahoma", Font.BOLD, 18));
		lNumVentas.setForeground(Color.WHITE);
		lNumVentas.setBounds(50, 300, 150, 20);
		add(lNumVentas);
		lNumVentas.setVisible(false);
		
		tNumVentas = new JTextField();
		tNumVentas.setFont(new Font("Tahoma", Font.BOLD, 18));
		tNumVentas.setForeground(Color.BLACK);
		tNumVentas.setBounds(170, 300, 180, 20);
		add(tNumVentas);
		tNumVentas.setVisible(false);
		
		lClientesCaptados = new JLabel("# Clientes: ");
		lClientesCaptados.setFont(new Font("Tahoma", Font.BOLD, 18));
		lClientesCaptados.setForeground(Color.WHITE);
		lClientesCaptados.setBounds(50, 300, 150, 20);
		add(lClientesCaptados);
		lClientesCaptados.setVisible(false);
		
		tCliCaptados = new JTextField();
		tCliCaptados.setFont(new Font("Tahoma", Font.BOLD, 18));
		tCliCaptados.setForeground(Color.BLACK);
		tCliCaptados.setBounds(170, 300, 180, 20);
		add(tCliCaptados);
		tCliCaptados.setVisible(false);
		
		lMontoPorCliente = new JLabel("$ por Cliente: ");
		lMontoPorCliente.setFont(new Font("Tahoma", Font.BOLD, 18));
		lMontoPorCliente.setForeground(Color.WHITE);
		lMontoPorCliente.setBounds(50, 325, 150, 20);
		add(lMontoPorCliente);
		lMontoPorCliente.setVisible(false);
		
		tMontoCliente = new JTextField();
		tMontoCliente.setFont(new Font("Tahoma", Font.BOLD, 18));
		tMontoCliente.setForeground(Color.BLACK);
		tMontoCliente.setBounds(170, 325, 180, 20);
		add(tMontoCliente);
		tMontoCliente.setVisible(false);
		
		bModificar = new JButton("Modificar");
		bModificar.setFont(new Font("Tahoma", Font.BOLD, 18));
		bModificar.setBackground(Color.GRAY);
		bModificar.setForeground(Color.WHITE);
		bModificar.setBounds(130, 370, 150, 50);
		add(bModificar);
		
		bModificar.setActionCommand(MODIFICAR);
		
		bVolver2 = new JButton("Volver");
		bVolver2.setFont(new Font("Tahoma", Font.BOLD, 18));
		bVolver2.setBackground(Color.GRAY);
		bVolver2.setForeground(Color.WHITE);
		bVolver2.setBounds(210, 430, 150, 24);
		add(bVolver2);
		
		bVolver2.setActionCommand(VOLVER2);
		
		bBorrar = new JButton("Borrar");
		bBorrar.setFont(new Font("Tahoma", Font.BOLD, 18));
		bBorrar.setBackground(Color.GRAY);
		bBorrar.setForeground(Color.WHITE);
		bBorrar.setBounds(40, 430, 150, 24);
		add(bBorrar);
		
		bBorrar.setActionCommand(BORRAR);
		
		cbTipoPersonal.addItemListener(new ItemListener() {
			
			@SuppressWarnings("unused")
			@Override
			public void itemStateChanged(ItemEvent e) {
				int state = e.getStateChange();
				if (e.getItem() == "Ingeniero Junior") {
					cbNivel.setVisible(true);
					Nivel.setVisible(true);
					lNumVentas.setVisible(false);
					tNumVentas.setVisible(false);
					lClientesCaptados.setVisible(false);
					tCliCaptados.setVisible(false);
					lMontoPorCliente.setVisible(false);
					tMontoCliente.setVisible(false);
				} 				
				else {					
					if (e.getItem() == "Ingeniero Senior") {
						lNumVentas.setVisible(true);
						tNumVentas.setVisible(true);
						cbNivel.setVisible(false);
						Nivel.setVisible(false);
						lClientesCaptados.setVisible(false);
						tCliCaptados.setVisible(false);
						lMontoPorCliente.setVisible(false);
						tMontoCliente.setVisible(false);
					}
					else {
						if (e.getItem() == "A comisi�n") {
							cbNivel.setVisible(false);
							Nivel.setVisible(false);
							lNumVentas.setVisible(false);
							tNumVentas.setVisible(false);
							lClientesCaptados.setVisible(true);
							tCliCaptados.setVisible(true);
							lMontoPorCliente.setVisible(true);
							tMontoCliente.setVisible(true);
							
						} else {
							cbNivel.setVisible(false);
							Nivel.setVisible(false);
							lNumVentas.setVisible(false);
							tNumVentas.setVisible(false);
							lClientesCaptados.setVisible(false);
							tCliCaptados.setVisible(false);
							lMontoPorCliente.setVisible(false);
							tMontoCliente.setVisible(false);
						}
						
					}

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


	public JLabel getlSueldo() {
		return lSueldo;
	}


	public void setlSueldo(JLabel lSueldo) {
		this.lSueldo = lSueldo;
	}


	public JLabel getlNumVentas() {
		return lNumVentas;
	}


	public void setlNumVentas(JLabel lNumVentas) {
		this.lNumVentas = lNumVentas;
	}


	public JLabel getlClientesCaptados() {
		return lClientesCaptados;
	}


	public void setlClientesCaptados(JLabel lClientesCaptados) {
		this.lClientesCaptados = lClientesCaptados;
	}


	public JLabel getlMontoPorCliente() {
		return lMontoPorCliente;
	}


	public void setlMontoPorCliente(JLabel lMontoPorCliente) {
		this.lMontoPorCliente = lMontoPorCliente;
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


	public JTextField gettNumVentas() {
		return tNumVentas;
	}


	public void settNumVentas(JTextField tNumVentas) {
		this.tNumVentas = tNumVentas;
	}


	public JTextField gettCliCaptados() {
		return tCliCaptados;
	}


	public void settCliCaptados(JTextField tCliCaptados) {
		this.tCliCaptados = tCliCaptados;
	}


	public JTextField gettMontoCliente() {
		return tMontoCliente;
	}


	public void settMontoCliente(JTextField tMontoCliente) {
		this.tMontoCliente = tMontoCliente;
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


	public JButton getbModificar() {
		return bModificar;
	}


	public void setbModificar(JButton bModificar) {
		this.bModificar = bModificar;
	}


	public JButton getbVolver2() {
		return bVolver2;
	}


	public void setbVolver2(JButton bVolver2) {
		this.bVolver2 = bVolver2;
	}


	public static long getSerialversionuid() {
		return serialVersionUID;
	}


	public static String getModificar() {
		return MODIFICAR;
	}


	public static String getVolver2() {
		return VOLVER2;
	}


	public JButton getbBorrar() {
		return bBorrar;
	}


	public void setbBorrar(JButton bBorrar) {
		this.bBorrar = bBorrar;
	}


	public static String getBorrar() {
		return BORRAR;
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
