package co.edu.Unbosque.Model;

public class Concomision extends Persona {
	
	final int Sueldo_fijo = 3500000;
	private int Ndeclientescap;	
	private int MontoPorclientes;
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
public Concomision(String cedula, String nombre, String apellidos, int anioIngreso, String genero, String telefono,
			String correo, String direccion, int ndeclientescap, int montoPorclientes) {
		
	
	super(cedula, nombre, apellidos, anioIngreso, genero, telefono, correo, direccion);
		Ndeclientescap = ndeclientescap;
		MontoPorclientes = montoPorclientes;
	}



/**
 * metodo para obtener el numero de clientes captados
 * <b> pre <b> que exista el atributo
 * <b> post <b> obtener el numero de clientes captados
 * @return Ndecleintescap
 */
public int getNdeclientescap() {
		return Ndeclientescap;
	}

/**
 * metodo para actualizar los ingresos
 * <b> pre </b> que exista el atributo
 * <b> post </b> se ha modificado el numero de clientes captados
 * @param el Nclintescap son los clientes captados por el usuario. Ndeclientescap!=null, Ndeclientescap!=""
 */

	public void setNdeclientescap(int ndeclientescap) {
		Ndeclientescap = ndeclientescap;
	}

	/**
	 * metodo para obtener el MontoPorclientes
	 * <b> pre <b> que exista el atributo
	 * <b> post <b> obtener el MontoPorclientes
	 * @return MontoPorclientes
	 */

	public int getMontoPorclientes() {
		return MontoPorclientes;
	}



	/**
	 * metodo para actualizar el MontoPorclientes
	 * <b> pre </b> que exista el atributo
	 * <b> post </b> se ha modificado el MontoPorclientes
	 * @param MontoPorclientes son el MontoPorclientes del usuario. MontoPorclientes!=null, MontoPorclientes!=""
	 */
	public void setMontoPorclientes(int montoPorclientes) {
		MontoPorclientes = montoPorclientes;
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
