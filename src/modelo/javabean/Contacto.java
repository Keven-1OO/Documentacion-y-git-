package modelo.javabean;

public class Contacto {
	
	// Attributes
	private String nombre;
	private String apellidos;
	private String telefono;
	private String email;
	private String empresa;
	
	// Constructor
	
	
	public Contacto() {
		super();
	}

	public Contacto(String nombre, String apellidos, String telefono, String email, String empresa) {
		super();
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.telefono = telefono;
		this.email = email;
		this.empresa = empresa;
	}
	
	
	// Get and Setters
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

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getEmpresa() {
		return empresa;
	}

	public void setEmpresa(String empresa) {
		this.empresa = empresa;
	}
	

	// To String
	@Override
	public String toString() {
		return "Contacto [nombre=" + nombre + ", apellidos=" + apellidos + ", telefono=" + telefono + ", email=" + email
				+ ", empresa=" + empresa + "]";
	}
	
	
	
}


