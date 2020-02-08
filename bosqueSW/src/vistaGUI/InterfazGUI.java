package vistaGUI;

import java.awt.BorderLayout;

import javax.swing.JFrame;

import controlador.Controlador;

public class InterfazGUI extends JFrame{

	private static final long serialVersionUID = 1L;
	
	PanelEntrada panelEntrada;
	PanelResultados panelResultados;
	
	public InterfazGUI(Controlador control) {
		
		setSize(500, 400);
		setResizable(false);
		setTitle("Titulo de la Ventana Principal");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		setLayout(new BorderLayout());
		
		panelEntrada = new PanelEntrada();
		add(panelEntrada, BorderLayout.NORTH);
		
		panelResultados = new PanelResultados();
		add(panelResultados, BorderLayout.CENTER);
		
		panelEntrada.getButConvertir().addActionListener(control);

	}
	
	public PanelEntrada getPanelEntrada() {
		return panelEntrada;
	}
	public PanelResultados getPanelResultados() {
		return panelResultados;
	}

}
