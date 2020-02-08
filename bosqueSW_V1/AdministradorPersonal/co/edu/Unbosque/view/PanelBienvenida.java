package co.edu.Unbosque.view;

import java.awt.Color;
import java.awt.Font;

import javax.swing.*;

public class PanelBienvenida extends JPanel{

	private static final long serialVersionUID = 1L;
	
	public static final String BUSCAR = "Buscar";
	
	public static final String AGREGAR = "Agregar";
	
	private JLabel lBienvenida;
	
	private JLabel lBuscar;
	
	private JTextField tBuscar;
	
	private JButton bBuscar;
	
	private JButton bAgregar;

	
	public PanelBienvenida() {
		
		setLayout(null);
		setBackground(new Color(217, 21, 11));
		
		lBienvenida = new JLabel("Bienvenido a las oficinas del Bosque");
		lBienvenida.setFont(new Font("Tahoma", Font.BOLD, 18));
		lBienvenida.setForeground(Color.WHITE);
		lBienvenida.setBounds(15, 0, 400, 50);
		add(lBienvenida);
		
		lBuscar = new JLabel("Cédula: ");
		lBuscar.setFont(new Font("Tahoma", Font.BOLD, 18));
		lBuscar.setForeground(Color.WHITE);
		lBuscar.setBounds(50, 50, 150, 50);
		add(lBuscar);
		
		tBuscar = new JTextField();
		tBuscar.setFont(new Font("Tahoma", Font.BOLD, 18));
		tBuscar.setForeground(Color.BLACK);
		tBuscar.setBounds(150, 64, 180, 24);
		add(tBuscar);
		
		bBuscar = new JButton("Buscar");
		bBuscar.setFont(new Font("Tahoma", Font.BOLD, 18));
		bBuscar.setBackground(Color.GRAY);
		bBuscar.setForeground(Color.WHITE);
		bBuscar.setBounds(150, 100, 180, 24);
		add(bBuscar);
		
		bBuscar.setActionCommand(BUSCAR);
		
		bAgregar = new JButton("Agregar");
		bAgregar.setFont(new Font("Tahoma", Font.BOLD, 18));
		bAgregar.setBackground(Color.GRAY);
		bAgregar.setForeground(Color.WHITE);
		bAgregar.setBounds(150, 130, 180, 24);
		add(bAgregar);
		
		bAgregar.setActionCommand(AGREGAR);
		
	}

}
