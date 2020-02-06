package co.edu.Unbosque.Model;

public class Concomision extends Persona {
	
	final int Sueldo_fijo = 3500000;
	private int Ndeclientescap;	
	private int MontoPorclientes;
			
//Constructor de la clase conComision
	// mensaje de prueba by sergio
public Concomision(String cedula, String nombre, String apellidos, int anioIngreso, String genero, String telefono,
			String correo, String direccion, int ndeclientescap, int montoPorclientes) {
		
	
	super(cedula, nombre, apellidos, anioIngreso, genero, telefono, correo, direccion);
		Ndeclientescap = ndeclientescap;
		MontoPorclientes = montoPorclientes;
	}



public int getNdeclientescap() {
		return Ndeclientescap;
	}



	public void setNdeclientescap(int ndeclientescap) {
		Ndeclientescap = ndeclientescap;
	}



	public int getMontoPorclientes() {
		return MontoPorclientes;
	}



	public void setMontoPorclientes(int montoPorclientes) {
		MontoPorclientes = montoPorclientes;
	}



	public int getSueldo_fijo() {
		return Sueldo_fijo;
	}



@Override
int Calcular_salario() {
	// TODO Auto-generated method stub
	return 0;
}

}
