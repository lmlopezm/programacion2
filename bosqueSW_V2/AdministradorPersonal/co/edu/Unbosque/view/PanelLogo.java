package co.edu.Unbosque.view;

import java.awt.*;

import javax.swing.*;

public class PanelLogo extends JPanel{

	private static final long serialVersionUID = 1L;

	private JLabel imagen;
	private ImageIcon icono;
	
	public PanelLogo() {
		
		setLayout(null);
		setBackground(new Color(217, 21, 11));
		
		imagen = new JLabel();
		icono = new ImageIcon(PanelLogo.class.getResource("/util/logoBosque2.png"));		
		icono.setImage(icono.getImage().getScaledInstance(300, 120, Image.SCALE_SMOOTH));
		imagen.setIcon(icono);
		imagen.setBounds(30, 0, 350, 100);		
		add(imagen);

	}
}
