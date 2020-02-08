package co.edu.Unbosque.Model;

public class Ingsenior extends Persona{
private int numerodeventas;

/**
 * metodo constructor
 * <b> pre </b> que los atributos ya esten creados
 * <b> post </b> inicializar los atributos
 * @param  cedula es la  cedula del usuario.  cedula!=null,  cedula!=""
 * @param  nombre  es el nombre del usuario.  nombre!=null,  nombre!=""
 * @param  apellido es el apellido del usuario.  apellido!=null,  apellido!=""	
 * @param  aniodeIngreso es el aniodeIngreso del usuario.  aniodeIngreso!=null,  aniodeIngreso!=""
 * @param  genero es el genero del usuario.  genero!=null,  genero!=""
 * @param  correo es el correo del usuario.  correo!=null,  correo!=""
 * @param  direccion es la direccion del usuario.  direccion!=null, direccion!=""
 * @param  numerodeventas es el numerodeventas  del usuario.  numerodeventas!=null,  numerodeventas!=""
 */
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
