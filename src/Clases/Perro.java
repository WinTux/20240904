package Clases;

public class Perro extends Mascota implements Animal{
	public Perro() {
		super("NA","NA");
	}
	@Override
	public void sonidoAnimal() {
		System.out.println("Guau Guau");
	}

}
