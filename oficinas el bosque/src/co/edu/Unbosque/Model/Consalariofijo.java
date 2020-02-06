package co.edu.Unbosque.Model;

public class Consalariofijo extends Persona{
	final int Sueldo_fijo = 3500000;
	
	

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
	 */
	public Consalariofijo(String cedula, String nombre, String apellidos, int anioIngreso, String genero,
			String telefono, String correo, String direccion) {
		super(cedula, nombre, apellidos, anioIngreso, genero, telefono, correo, direccion);
		// TODO Auto-generated constructor stub
	}



	/**
	 * metodo para obtener el Sueldo_fijo
	 * <b> pre <b> que exista el atributo
	 * <b> post <b> obtener el Sueldo_fijo
	 * @return Sueldo_fijo
	 */
	public int getSueldo_fijo() {
		return Sueldo_fijo;
	}


	@Override
	int Calcular_salario() {
		// TODO Auto-generated method stub
		return 0;
	}
	
	
}
