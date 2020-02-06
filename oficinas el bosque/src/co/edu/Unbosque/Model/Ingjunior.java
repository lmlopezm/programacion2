package co.edu.Unbosque.Model;

public class Ingjunior extends Persona{	
	private int nivel;
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
	 * @param  nivel es el  nivel del usuario.  nivel!=null, nivel!=""
	 */
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
