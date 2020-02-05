package co.edu.Unbosque.Model;

public class Ingsenior extends Persona{
private int numerodeventas;


public Ingsenior(String cedula, String nombre, String apellidos, int anioIngreso, String genero, String telefono,
		String correo, String direccion, int numerodeventas) {
	super(cedula, nombre, apellidos, anioIngreso, genero, telefono, correo, direccion);
	this.numerodeventas = numerodeventas;
}


@Override
int Calcular_salario() {
	// TODO Auto-generated method stub
	return 0;
}


}
