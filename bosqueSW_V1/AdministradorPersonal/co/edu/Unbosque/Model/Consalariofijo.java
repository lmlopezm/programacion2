package co.edu.Unbosque.Model;

public class Consalariofijo extends Persona {
	
	private final int SUELDO_FIJO = 3500000;
	
	private double adicionalFijo = 0;

	/**
	 * metodo constructor <b> pre </b> que los atributos ya esten creados <b> post
	 * </b> inicializar los atributos
	 * 
	 * @param cedula        es la cedula del usuario. cedula!=null, cedula!=""
	 * @param nombre        es el nombre del usuario. nombre!=null, nombre!=""
	 * @param apellido      es el apellido del usuario. apellido!=null, apellido!=""
	 * @param aniodeIngreso es el aniodeIngreso del usuario. aniodeIngreso!=null,
	 *                      aniodeIngreso!=""
	 * @param genero        es el genero del usuario. genero!=null, genero!=""
	 * @param correo        es el correo del usuario. correo!=null, correo!=""
	 * @param direccion     es la direccion del usuario. direccion!=null,
	 *                      direccion!=""
	 */
	public Consalariofijo(String cedula, String nombre, String apellidos, int anioIngreso, String genero,
			String telefono, String correo, String direccion) {
		super(cedula, nombre, apellidos, anioIngreso, genero, telefono, correo, direccion);
		// TODO Auto-generated constructor stub
	}

	/**
	 * metodo para obtener el Sueldo_fijo <b> pre <b> que exista el atributo <b>
	 * post <b> obtener el Sueldo_fijo
	 * 
	 * @return Sueldo_fijo
	 */
	public int getSueldo_fijo() {
		return SUELDO_FIJO;
	}
	
	

	@Override
	int Calcular_salario() {
		if(getAnioIngreso()<2) {
			return SUELDO_FIJO;
		}
		if (getAnioIngreso()<3) {
			int cincoPorciento = (int) (SUELDO_FIJO*0.05);
			return SUELDO_FIJO+cincoPorciento;
		}
		if (getAnioIngreso()<7) {
			int diezPorCiento = (int) (SUELDO_FIJO*0.1);
			return SUELDO_FIJO+diezPorCiento;
		}
		if (getAnioIngreso()<15) {
			int quincePorCiento = (int) (SUELDO_FIJO*0.15);
			return SUELDO_FIJO+quincePorCiento;
		}
		else {
			return 0;
		}
		
	}

	@Override
	public String toString() {

		return super.toString();
	}
}
