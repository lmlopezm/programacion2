package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import modelo.Mundo;
import vistaGUI.InterfazGUI;
import vistaGUI.PanelEntrada;

public class Controlador implements ActionListener{
	
	@SuppressWarnings("unused")
	private Mundo bd;
	
	private InterfazGUI gui;
	
	public Controlador() {
		
		bd = new Mundo();
		gui = new InterfazGUI(this);
		
		gui.setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent evento) {
		gui.getPanelEntrada();
		if (evento.getActionCommand().equals(PanelEntrada.CONVERTIR)) {
			gui.getPanelResultados().getTxtMonto().setText(gui.getPanelEntrada().getTxtNumero().getText()+" Procesado");
		}
	}

}
