package co.edu.Unbosque.controller;

import java.awt.event.*;

import co.edu.Unbosque.view.*;

public class Controller implements ActionListener{
	
	private View IG;
	
	public Controller() {
		
		IG = new View(this);
		
		IG.setVisible(true);
	
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
		
	}
	
	

}
