package Clases;

public class Persona {
	protected String nombre;
	protected String apellido;
	protected int edad;
	public Persona(String nombre, String apellido, int edad) {
		this.nombre = nombre;
		this.apellido = apellido;
		this.edad = edad;
	}
	public Persona(String x, String y) {
		nombre = "";
		apellido = "";
		edad = 0;
	}
	public Persona() {
		nombre = "NA";
		apellido = "NA";
		edad = 18;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		if(nombre.length() > 2 && nombre.length() < 20)
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
		if(edad > 0)
			this.edad = edad;
	}
	public void hablar() {
		System.out.println("Hola, soy una persona");
	}
	public void soyMayorDeEdad() {
		if(calculoMayoriaEdad(edad))
			System.out.println("Soy mayor de edad");
		else
			System.out.println("Soy menor de edad!!");
	}
	private boolean calculoMayoriaEdad(int n) {
		if(n >= 18)
			return true;
		else
			return false;
	}
	public void presentarse() {
		System.out.println(String.format("Me llamo %s %s y tengo %d años.", nombre, apellido, edad));
	}
}
