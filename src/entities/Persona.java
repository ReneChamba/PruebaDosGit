package entities;

public class Persona {
	
	private String nombre;
	private String apellido;
	private int edad;
	private boolean estadoCivil;
	
	public Persona() {}

	public Persona(String nombre, String apellido, int edad, boolean estadoCivil) {
		this.nombre = nombre;
		this.apellido = apellido;
		this.edad = edad;
		this.estadoCivil = estadoCivil;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public boolean isEstadoCivil() {
		return estadoCivil;
	}

	public void setEstadoCivil(boolean estadoCivil) {
		this.estadoCivil = estadoCivil;
	}

	@Override
	public String toString() {
		return "Persona [nombre=" + nombre + ", apellido=" + apellido + ", edad=" + edad + ", estadoCivil="
				+ estadoCivil + "]";
	}
	
	
	
	

}
