package Clases;

public class Estudiante extends Persona implements Ciudadano{
	private String carrera;
	private String ci;
	private String email;
	//constructores
	public String getCarrera() {
		return carrera;
	}
	public void setCarrera(String carrera) {
		this.carrera = carrera;
	}
	public String getCi() {
		return ci;
	}
	public void setCi(String ci) {
		this.ci = ci;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	public void presentarse() {
		System.out.println(String.format("Soy estudiante %s %s de la carrera de %s, mi CI es %s, además mi email es %s.", nombre, apellido, carrera, ci, email));
	}
	@Override
	public void comprarBienInmueble(String codCatastral) {
		System.out.println("Procedo a comprar la propiedad " + codCatastral);
	}
}
// ejemplo interface Animal sonidoAnimal()
