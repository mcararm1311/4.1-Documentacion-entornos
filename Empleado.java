package ies;
/** 
 * Esta clase me va a servir para aprender a documentar con javadoc 
 * @author Martin Carrasco Armijo
 * @version 1.0
 * @since 14/04/23
 * 
 * **/


public class Empleado {
	private int emp_no;
	private String nombre;
	private String apellido;
	private String pobla;
	private String oficio;
	private Double salario;
	



	public Empleado(int emp_no, String nombre, String apellido, String pobla, String oficio,
			Double salario, Departamento dept) {
		this.emp_no = emp_no;
		this.nombre = nombre;
		this.apellido = apellido;
		this.pobla = pobla;
		this.oficio = oficio;
		this.salario = salario;
		
	}
	
	public Empleado(int emp_no, String nombre, Double salario, Departamento dept) {
		this.emp_no = emp_no;
		this.nombre = nombre;
		this.salario = salario;
		
	}
	/**
	 * Método que nos devuelve el valor que tiene actual la variable a la que 
	 * hace referencia.
	 * 
	 */

	public int getEmp_no() {
		return emp_no;
	}

	/**
	 * Método que añade o modifica el valor de la variable a la que hace referencia
	 * @param emp_no Variable que queremos modificar.
	 */

	public void setEmp_no(int emp_no) {
		this.emp_no = emp_no;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getPobla() {
		return pobla;
	}

	public void setPobla(String pobla) {
		this.pobla = pobla;
	}

	public String getOficio() {
		return oficio;
	}

	public void setOficio(String oficio) {
		this.oficio = oficio;
	}

	public Double getSalario() {
		return salario;
	}

	public void setSalario(Double salario) {
		this.salario = salario;
	}
	
	
	
	
/**
 * Método que hace la subida de salario añadiendo al salario 
 * por defecto el número de la subida.
 * 
 * @param subida Numero en double (con decimales) del valor de la subida.
 * 
 * 
 */

	public void subidasalario(Double subida) {
		salario = salario + subida;
	}
	
	/**
	 * Método que devuelve una sentencia boolean donde 
	 * comprueba si el nombre contiene ["" (comillas)]
	 * retornando false  si las contiene y true si no las contiene
	 * 
	 * @return boolean 
	 * 
	 */
	private boolean comprobar(){
		if (nombre.equals("")){
			
			return false;
		}
		return true;
	}
}