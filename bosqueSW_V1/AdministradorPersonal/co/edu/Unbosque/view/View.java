package co.edu.Unbosque.view;

import java.awt.*;

import javax.swing.*;

import co.edu.Unbosque.controller.*;

public class View extends JFrame{

	private static final long serialVersionUID = 1L;
	
	private PanelLogo panLogo;
	
	private PanelBienvenida panBienvenido;
	
	private PanelAgregar panAgregar;
	
	public View(Controller controlador) {
		
		setSize(400, 600);
		
		setResizable(false);
		
		setIconImage(Toolkit.getDefaultToolkit().getImage(View.class.getResource("/util/logoBosque.png")));
		
		setTitle("Administrador de Personal");
		
		this.getContentPane().setBackground(new Color(217, 21, 11));
		
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		setLocationRelativeTo(null);
		
		getContentPane().setLayout(null);
		
		panLogo = new PanelLogo();
		panLogo.setBounds(0, 0, 400, 100);
		add(panLogo);
		
		panBienvenido = new PanelBienvenida();
		panBienvenido.setBounds(0, 100, 400, 500);
		add(panBienvenido);
		panBienvenido.setVisible(false);
		
		panAgregar = new PanelAgregar();
		panAgregar.setBounds(0, 100, 400, 500);
		add(panAgregar);
		
		
	}

}
