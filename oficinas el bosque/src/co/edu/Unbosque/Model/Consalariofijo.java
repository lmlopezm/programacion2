package co.edu.Unbosque.Model;

public class Consalariofijo extends Persona{
	final int Sueldo_fijo = 3500000;
	
	
	
	public Consalariofijo(String cedula, String nombre, String apellidos, int anioIngreso, String genero,
			String telefono, String correo, String direccion) {
		super(cedula, nombre, apellidos, anioIngreso, genero, telefono, correo, direccion);
		// TODO Auto-generated constructor stub
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
