package Clases;

public class Gato extends Mascota  implements Animal {
	private int cantVidas;
	public Gato(){
		super("NA","NA");
		cantVidas = 1;
	}
	public Gato(String nombre, String raza, int cantVidas) {
		super(nombre, raza);
		this.cantVidas = cantVidas;
	}
	@Override
	public void sonidoAnimal() {
		System.out.println("Miau Miau");
	}
}
