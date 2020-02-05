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



public String getCedula() {
	return cedula;
}



public void setCedula(String cedula) {
	this.cedula = cedula;
}



public String getNombre() {
	return nombre;
}



public void setNombre(String nombre) {
	this.nombre = nombre;
}



public String getApellidos() {
	return apellidos;
}



public void setApellidos(String apellidos) {
	this.apellidos = apellidos;
}



public int getAnioIngreso() {
	return anioIngreso;
}



public void setAnioIngreso(int anioIngreso) {
	this.anioIngreso = anioIngreso;
}



public String getGenero() {
	return genero;
}



public void setGenero(String genero) {
	this.genero = genero;
}



public String getTelefono() {
	return telefono;
}



public void setTelefono(String telefono) {
	this.telefono = telefono;
}



public String getCorreo() {
	return correo;
}



public void setCorreo(String correo) {
	this.correo = correo;
}



public String getDireccion() {
	return direccion;
}



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
