package co.edu.Unbosque.Model;

public class Ingsenior extends Consalariofijo{
	private int numerodeventas;

	/**
	 * método constructor
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
	public Ingsenior(	String cedula, 
						String nombre, 
						String apellidos, 
						int anioIngreso, 
						String genero, 
						String telefono,
						String correo, 
						String direccion, 
						int numerodeventas) {
												super(cedula, nombre, apellidos, anioIngreso, genero, telefono, correo, direccion);
												setNumerodeventas(numerodeventas);
	}

	/**
	 * metodo para calular el salario
	 * <b> pre </b> que exista el trabajador
	 * <b> post </b> calcular el salario
	 * @param salario es el salario del usuario. salario!=null, salario!=""
	 * @param numerodeventas es el numerodeventas del usurio. numerodeventas!=null, numerodeventas!=""
	 * @return salario
	 */
	@Override
	double Calcular_salario() {
		double adicionalVentas = 0;
		double salFijo = getSUELDO_FIJO();
		double sulFijo = super.Calcular_salario();
		if (numerodeventas >= 1 && numerodeventas <=5) {
			adicionalVentas = salFijo*0.10;
			return sulFijo + adicionalVentas;
		}
		if (numerodeventas >= 6 && numerodeventas <=10) {
			adicionalVentas = salFijo*0.15;
			return sulFijo + adicionalVentas;
		}
		if (numerodeventas >= 11 && numerodeventas <=20) {
			adicionalVentas = salFijo*0.20;
			return sulFijo + adicionalVentas;
		}
		if (numerodeventas >= 21) {
			adicionalVentas = salFijo*0.30;
			return sulFijo + adicionalVentas;
		}
		else {			
			return 0;
		}

}


/**
 * metodo para obtener el numero de ventas 
 * <b> pre <b> que exista el atributo
 * <b> post <b> obtener el numero de ventas 
 * @return Numerodeventas
 */
public int getNumerodeventas() {
	return numerodeventas;
}

/**
 * metodo para actualizar el Numerodeventas
 * <b> pre </b> que exista el atributo
 * <b> post </b> se ha modificado el Numerodeventas
 * @param Numerodeventas son el Numerodeventas del usuario. Numerodeventas!=null, Numerodeventas!=""
 */
public void setNumerodeventas(int numerodeventas) {
	this.numerodeventas = numerodeventas;
}


}
