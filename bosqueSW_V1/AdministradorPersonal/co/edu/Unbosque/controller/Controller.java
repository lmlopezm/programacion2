package co.edu.Unbosque.controller;

import java.awt.event.*;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;


import co.edu.Unbosque.view.*;

public class Controller implements ActionListener{
	private static File archivo = new File("data/datos.dat");
	private ObjectInputStream entrada;
	private View IG;
	
	public Controller() {
		if(!archivo.exists()) {
			try {
				archivo.createNewFile();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}else {
			
		
			if(archivo.length()!=0){
				
					try {
						
						entrada=new ObjectInputStream(new FileInputStream(archivo));
						
						
						//pr= (ArrayList<CongeladoPorAgua>) entrada.readObject();
						
					} catch (IOException e) {
						// TODO Auto-generated catch block
						
					}
			}
		}
		IG = new View(this);
		
		IG.setVisible(true);
	
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
		if (e.getActionCommand().equals(PanelAgregar.VOLVER)) {
			
		}
		
		
	}
	
	

}
