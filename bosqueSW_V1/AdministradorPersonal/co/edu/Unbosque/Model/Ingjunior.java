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
	

/**
 * metodo para obtener el nivel del usuario
 * <b> pre <b> que exista el atributo
 * <b> post <b> obtener el nivel del usuario
 * @return Nivel
 */
	public int getNivel() {
		return nivel;
	}


/**
 * metodo para actualizar el Nivel
 * <b> pre </b> que exista el atributo
 * <b> post </b> se ha modificado el Nivel
 * @param el Nivel es el  Nivel  del usuario. Nivel!=null, Nivel!=""
 */
	public void setNivel(int nivel) {
		this.nivel = nivel;
	}

	/**
	 * metodo para calular el salario
	 * <b> pre </b> que exista el trabajador
	 * <b> post </b> calcular el salario
	 * @param salario es el salario del usuario. salario!=null, salario!=""
	 * @param nivel es el nivel del usurio. nivel!=null, nivel!=""
	 * @return salario
	 */
	@Override
	int Calcular_salario() {
		// TODO Auto-generated method stub
		return 0;
	}
	
}
