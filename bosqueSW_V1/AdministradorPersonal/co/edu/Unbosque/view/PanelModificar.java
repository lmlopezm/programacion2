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

	
	private JLabel lMensaje;	
	private JLabel lNombre;	
	private JLabel lApellido;	
	private JLabel lGenero;	
	private JLabel lTel;	
	private JLabel lCorreo;	
	private JLabel lDireccion;	
	private JLabel AnioIngreso;	
	private JLabel tipoPersonal;	
	private JLabel Nivel;
	private JLabel lSueldo;
	
	private JTextField tNombre;	
	private JTextField tApellido;	
	private JTextField tGenero;	
	private JTextField tTel;	
	private JTextField tCorreo;	
	private JTextField tDireccion;	
	private JTextField tAnioIngreso;	
	
	private JComboBox<String> cbNivel;
	private JComboBox<String> cbTipoPersonal;
	
	private JButton bModificar;	
	private JButton bVolver2;

	
	public PanelModificar() {
		
		setLayout(null);
		setBackground(new Color(217, 21, 11));
		
		lMensaje = new JLabel("Agregar nuevo personal");
		lMensaje.setFont(new Font("Tahoma", Font.BOLD, 18));
		lMensaje.setForeground(Color.WHITE);
		lMensaje.setBounds(15, 0, 400, 50);
		add(lMensaje);
		
		lNombre = new JLabel("Nombre: ");
		lNombre.setFont(new Font("Tahoma", Font.BOLD, 18));
		lNombre.setForeground(Color.WHITE);
		lNombre.setBounds(50, 50, 150, 20);
		add(lNombre);
		
		tNombre = new JTextField();
		tNombre.setFont(new Font("Tahoma", Font.BOLD, 18));
		tNombre.setForeground(Color.BLACK);
		tNombre.setBounds(170, 50, 180, 20);
		add(tNombre);
		
		lApellido = new JLabel("Apellido: ");
		lApellido.setFont(new Font("Tahoma", Font.BOLD, 18));
		lApellido.setForeground(Color.WHITE);
		lApellido.setBounds(50, 75, 150, 20);
		add(lApellido);
		
		tApellido = new JTextField();
		tApellido.setFont(new Font("Tahoma", Font.BOLD, 18));
		tApellido.setForeground(Color.BLACK);
		tApellido.setBounds(170, 75, 180, 20);
		add(tApellido);
		
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
		cbNivel.addItem("Seis");
		add(cbNivel);
		cbNivel.setVisible(false);
		
		bModificar = new JButton("Modificar");
		bModificar.setFont(new Font("Tahoma", Font.BOLD, 18));
		bModificar.setBackground(Color.GRAY);
		bModificar.setForeground(Color.WHITE);
		bModificar.setBounds(50, 300, 180, 50);
		add(bModificar);
		
		bModificar.setActionCommand(MODIFICAR);
		
		bVolver2 = new JButton("Volver");
		bVolver2.setFont(new Font("Tahoma", Font.BOLD, 18));
		bVolver2.setBackground(Color.GRAY);
		bVolver2.setForeground(Color.WHITE);
		bVolver2.setBounds(220, 430, 150, 24);
		add(bVolver2);
		
		bVolver2.setActionCommand(VOLVER2);
		
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
	


}
