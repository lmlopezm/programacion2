	package co.edu.Unbosque.Model;

	public abstract  class Persona {
	private String cedula; 
	private String nombre ;
	private String apellidos;
	private int anioIngreso; 
	private String genero;
	private String telefono;
	private String correo;
	private String direccion;

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

public Persona(String cedula, String nombre, String apellidos, int anioIngreso, String genero, String telefono,
		String correo, String direccion) {

	this.cedula = cedula;
	this.nombre = nombre;
	this.apellidos = apellidos;
	this.anioIngreso = anioIngreso;
	this.genero = genero;
	this.telefono = telefono;
	this.correo = correo;
	this.direccion = direccion;


}


/**
 * metodo para obtener la cedula
 * <b> pre <b> que exista el atributo
 * <b> post <b> obtener la cedula
 * @return cedula
 */

public String getCedula() {
	return cedula;
}

/**
 * metodo para actualizar la cedula 
 * <b> pre </b> que exista el atributo
 * <b> post </b> se ha modificado la cedula
 * @param cedula es la cedula del usuario. cedula!=null, cedula!=""
 */


public void setCedula(String cedula) {
	this.cedula = cedula;
}


/**
 * metodo para obtener el nombre
 * <b> pre <b> que exista el atributo
 * <b> post <b> obtener el nombre
 * @return nombre
 */
public String getNombre() {
	return nombre;
}

/**
 * metodo para actualizar el nombre 
 * <b> pre </b> que exista el atributo
 * <b> post </b> se ha modificado el nombre
 * @param nombre es el nombre del usuario. nombre!=null, nombre!=""
 */

public void setNombre(String nombre) {
	this.nombre = nombre;
}

/**
 * metodo para obtener el apellido
 * <b> pre <b> que exista el atributo
 * <b> post <b> obtener el apellido
 * @return apellido
 */

public String getApellidos() {
	return apellidos;
}



/**
 * metodo para actualizar el apellido 
 * <b> pre </b> que exista el atributo
 * <b> post </b> se ha modificado el apellido
 * @param apellido es el apellido del usuario. apellido!=null, apellido!=""
 */
public void setApellidos(String apellidos) {
	this.apellidos = apellidos;
}


/**
 * metodo para obtener el anioIngreso
 * <b> pre <b> que exista el atributo
 * <b> post <b> obtener el anioIngreso
 * @return anioIngreso
 */
public int getAnioIngreso() {
	return anioIngreso;
}


/**
 * metodo para actualizar el anioIngreso 
 * <b> pre </b> que exista el atributo
 * <b> post </b> se ha modificado el anioIngreso
 * @param anioIngreso es el anioIngreso del usuario. anioIngreso!=null, anioIngreso!=""
 */

public void setAnioIngreso(int anioIngreso) {
	this.anioIngreso = anioIngreso;
}

/**
 * metodo para obtener el genero
 * <b> pre <b> que exista el atributo
 * <b> post <b> obtener el genero
 * @return genero
 */


public String getGenero() {
	return genero;
}



/**
 * metodo para actualizar el genero
 * <b> pre </b> que exista el atributo
 * <b> post </b> se ha modificado el genero
 * @param genero es el genero del usuario. genero!=null, genero!=""
 */
public void setGenero(String genero) {
	this.genero = genero;
}


/**
 * metodo para obtener el telefono
 * <b> pre <b> que exista el atributo
 * <b> post <b> obtener el telefono
 * @return telefono
 */
public String getTelefono() {
	return telefono;
}

/**
 * metodo para actualizar el telefono
 * <b> pre </b> que exista el atributo
 * <b> post </b> se ha modificado el telefono
 * @param telefono es el telefono del usuario. telefono!=null, telefono!=""
 */

public void setTelefono(String telefono) {
	this.telefono = telefono;
}


/**
 * metodo para obtener el correo
 * <b> pre <b> que exista el atributo
 * <b> post <b> obtener el correo
 * @return correo
 */
public String getCorreo() {
	return correo;
}


/**
 * metodo para actualizar el correo
 * <b> pre </b> que exista el atributo
 * <b> post </b> se ha modificado el correo
 * @param correo es el correo del usuario. correo!=null, correo!=""
 */
public void setCorreo(String correo) {
	this.correo = correo;
}



/**
 * metodo para obtener la direccion
 * <b> pre <b> que exista el atributo
 * <b> post <b> obtener la direccion
 * @return direccion
 */
public String getDireccion() {
	return direccion;
}


/**
 * metodo para actualizar la direccion 
 * <b> pre </b> que exista el atributo
 * <b> post </b> se ha modificado la direccion
 * @param direccion es la direccion del usuario. direccion!=null, direccion!=""
 */
public void setDireccion(String direccion) {
	this.direccion = direccion;
}

abstract int Calcular_salario();

@Override
public String toString() {
	return "Persona [cedula=" + cedula + ", nombre=" + nombre + ", apellidos=" + apellidos + ", anioIngreso="
			+ anioIngreso + ", genero=" + genero + ", telefono=" + telefono + ", correo=" + correo + ", direccion="
			+ direccion + "]";
}


}
