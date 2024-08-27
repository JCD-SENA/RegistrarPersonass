package jcd.registrarpersonas;

public class Persona {

	private String nombre;
	private String documento;
	private String profesion;
	private int edad;
	private String direccion;
	private String telefono;
	
	
	public Persona(){
		
	}
	
	
	public Persona(String nombre, String documento, String profesion, int edad, String direccion, String telefono) {
		super();
		this.nombre = nombre;
		this.documento = documento;
		this.profesion = profesion;
		this.edad = edad;
		this.direccion = direccion;
		this.telefono = telefono;
	}


	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public String getDocumento() {
		return documento;
	}


	public void setDocumento(String documento) {
		this.documento = documento;
	}


	public String getProfesion() {
		return profesion;
	}


	public void setProfesion(String profesion) {
		this.profesion = profesion;
	}


	public int getEdad() {
		return edad;
	}


	public void setEdad(int edad) {
		this.edad = edad;
	}


	public String getDireccion() {
		return direccion;
	}


	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}


	public String getTelefono() {
		return telefono;
	}


	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}


	@Override
	public String toString() {
		return "Persona [nombre=" + nombre + ", documento=" + documento + ", profesion=" + profesion + ", edad=" + edad
				+ ", direccion=" + direccion + ", telefono=" + telefono + "]";
	}
	
	
	
	
	
	
	
}
