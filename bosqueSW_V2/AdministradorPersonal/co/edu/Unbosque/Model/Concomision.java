package co.edu.Unbosque.Model;

public class Concomision extends Persona {
	
	private final double SAL_MINIMO = 1100000;
	private int nClientesCap;	
	private double montoPorClientes;
	
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
	 * @param  ndeclientescap es el numerodeclientescap  del usuario.  ndeclientescap!=null,  ndeclientescap!=""
	 * @param  montoPorclientes es el monto por clinetes del usuario.  montoPorclientes!=null,  montoPorclientes!=""
	 */
	public Concomision(	String cedula, 
						String nombre, 
						String apellidos, 
						int anioIngreso, 
						String genero, 
						String telefono,
						String correo, 
						String direccion, 
						int ndeclientescap, 
						double montoPorclientes) {
													super(cedula, nombre, apellidos, anioIngreso, genero, telefono, correo, direccion);
													setnClientesCap(ndeclientescap);
													setMontoPorClientes(montoPorclientes);
	}

	/**
	 * metodo para calular el salario
	 * <b> pre </b> que exista el trabajador
	 * <b> post </b> calcular el salario
	 * @param salario es el salario del usuario. salario!=null, salario!=""
	 * @param Ndeclientescap es el Ndeclientescap del usuario. Ndeclientescap!=null, Ndeclientescap!=""
	 * @param MontoPorclientes es el MontoPorclientes del usuario. MontoPorclientes!=null, MontoPorclientes!=""
	 * @return salario
	 */
@Override
	double Calcular_salario() {
	
	if (getnClientesCap()*getMontoPorClientes()<SAL_MINIMO) {
		return SAL_MINIMO+(getnClientesCap()*getMontoPorClientes());
	}
	else {
		return getnClientesCap()*getMontoPorClientes();
	}
}
/**
 * metodo para obtener el numero de clientes captados
 * <b> pre <b> que exista el atributo
 * <b> post <b> obtener el numero de clientes captados
 * @return Ndecleintescap
 */
public int getnClientesCap() {
	return nClientesCap;
}


/**
 * metodo para actualizar los Ndeclientescap
 * <b> pre </b> que exista el atributo
 * <b> post </b> se ha modificado el numero de clientes captados
 * @param el Nclintescap son los clientes captados por el usuario. Ndeclientescap!=null, Ndeclientescap!=""
 */
public void setnClientesCap(int nClientesCap) {
	this.nClientesCap = nClientesCap;
}


/**
 * metodo para obtener el MontoPorclientes
 * <b> pre <b> que exista el atributo
 * <b> post <b> obtener el MontoPorclientes
 * @return MontoPorclientes
 */

public double getMontoPorClientes() {
	return montoPorClientes;
}

/**
 * metodo para actualizar el MontoPorclientes
 * <b> pre </b> que exista el atributo
 * <b> post </b> se ha modificado el MontoPorclientes
 * @param MontoPorclientes son el MontoPorclientes del usuario. MontoPorclientes!=null, MontoPorclientes!=""
 */

public void setMontoPorClientes(double montoPorClientes) {
	this.montoPorClientes = montoPorClientes;
}


/**
 * metodo para obtener el SAL_fijo
 * <b> pre <b> que exista el atributo
 * <b> post <b> obtener el Sueldo_fijo
 * @return SAL_fijo
 */
public double getSAL_MINIMO() {
	return SAL_MINIMO;
}

}
