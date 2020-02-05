package co.edu.Unbosque.Model;

public class Ingjunior extends Persona{	
	private int nivel;
	
	public Ingjunior(String cedula, String nombre, String apellidos, int anioIngreso, String genero, String telefono,
			String correo, String direccion, int nivel) {
		super(cedula, nombre, apellidos, anioIngreso, genero, telefono, correo, direccion);
		this.nivel = nivel;
	}
	

	@Override
	int Calcular_salario() {
		// TODO Auto-generated method stub
		return 0;
	}
	
}
