package Herramientas;

import Clases.Persona;
import Clases.Animal;
import Clases.Ciudadano;
import Clases.Estudiante;
import Clases.Gato;
import Clases.Perro;

public class Principal {
	static float estatura = 90;
	public static void main(String[] args) {
		int cantidad;
		cantidad = 4;
		int edad = 18;
		edad = 20;
		
		System.out.println("Se ejecuta! :D");
		System.out.print("La edad es: ");
		System.out.println(edad);
		
		float peso;
		peso = 60.3f;
		
		double estatura = 1.7;
		
		byte unByte = 127;
		
		cantidad = unByte;
		
		unByte = 100;
		
		int resultado1 = cantidad * edad;
		
		float resultado2 = edad * peso;// int * float
		
		double resultado3 = (peso * estatura);//float * double

		double tipocambio = 6.9;
		double precio = 1000;
		float resultado4 = (float)(tipocambio * precio);// Casteo
		int resultado5 = (int)resultado2;
		
		/*
		int cambiodehorario = 0;
		int cambio_de_horario = 0;
		int cambioDeHorario = 0; // camel case
		int 768 = 90;
		int 768asds = 90;
		int a768 = 90;
		int aa768xx = 90;
		*/
		// Métodos
		ejemploDeMetodos1();
		ejemploDeMetodos2(4, 19);
		double resultadoMulti =multiplicar(10,3.4);
		
		System.out.println("Ya se ejecutó SegundoMetodo!!");
		System.out.println("La multiplicación es: "+ resultadoMulti);
		// Alcance (variables y métodos)
		
		//Arreglos
		
		//Arreglo unidimensional
		int[] numeros;
		numeros = new int[4]; // [][][][]
		
		numeros[2] = 15;
		
		try {
			numeros[4] = 20;
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("Ocurrió un error de indice, que no vuelva a pasar");
			numeros[3] = 20;
		}
		
		System.out.println("La ejecución sigue.");
		System.out.println(numeros[2]+ ", "+numeros[3]);
		
		//Iteraciones
		// While (mientras)
		int indice = 0;
		while(indice < 4) {
			System.out.println(numeros[indice]);
			indice = indice + 1;//indice++;
		}
		System.out.println("La ejecución sigue.");
		//For (para)
		for(int i = 0;i < 4; i++) {
			System.out.println(numeros[i]);
		}
		
		//Arreglos bidimensionales (matriz)
		int[][] tablero = new int[2][3];// [0-1][0-2]
		/*
		 * [  ][  ][  ]
		 * [  ][25][06]
		 * 
		 * [][  ]
		 * [][25]
		 * [][06]
		 * 
		 * */
		
		tablero[1][1] = 25;
		tablero[1][2] = 6;
		
		for(int fila = 0; fila < 2;fila++) {
			for(int columna = 0; columna < 3; columna++) {
				System.out.print("["+tablero[fila][columna]+"]");
			}
			System.out.println();
		}
		
		// Arreglo tridimensional
		int[][][] cubo = new int[3][3][3];
		/*
		 * [][][]  [][][]  [][][]
		 * [][][]  [][][]  [][][]
		 * [][][]  [][][]  [][][]
		 * */
		//Arreglos multidimensionales
		int[][][][][][] cosa = new int[2][4][6][8][3][43];
		
		// Ejemplo objetos
		Persona p01;
		p01 = new Persona();// Constructor por defecto
		Persona p02 = new Persona("Ana","Sosa",27);
		p01.setNombre("Pepe");
		p01.setApellido("Perales");
		p01.setEdad(15);
		System.out.println("Mi primera persona creada:");
		System.out.println("Nombre completo: "+p01.getNombre() + " " + p01.getApellido() + "\nEdad: "+p01.getEdad()+" años.");
		System.out.println(String.format("Nombre completo: %s %s\nEdad: %d años.", p01.getNombre(),p01.getApellido(),p01.getEdad()));
		p01.hablar();
		p01.soyMayorDeEdad();
		p01.setEdad(-5000);
		System.out.println("Nombre completo: "+p01.getNombre() + " " + p01.getApellido() + "\nEdad: "+p01.getEdad()+" años.");
		
		System.out.println("Estudiantes\n***************");
		Estudiante est01 = new Estudiante();
		est01.hablar();
		est01.setNombre("Samantha");
		est01.setApellido("Barrios");
		est01.setEdad(20);
		est01.setCarrera("Contaduría Pública");
		est01.setCi("123456");
		est01.setEmail("samantha.b@gmail.com");
		est01.presentarse();
		Persona p_aux = est01;
		p_aux.presentarse();
		//Ciudadano c1 = new Ciudadano();//Error: No se puede crear una instancia de una interface
		
		Perro prr = new Perro();
		Gato gt = new Gato("Garfield","Naranja",4);
		prr.sonidoAnimal();
		gt.sonidoAnimal();
		Animal an = prr;
		
		Animal[] animales = new Animal[3];
		animales[0] = new Gato();
		animales[1] = prr;
		animales[2] = gt;
		System.out.println("Iterando en mi colección de animales:");
		for(Animal a : animales) {
			a.sonidoAnimal();
		}
	}
	
	public static void ejemploDeMetodos1() {
		double precio = 1000;
		precio = precio + estatura;
		System.out.println("Se ejecuta el segundo método! :D");
	}
	public static void ejemploDeMetodos2(int num1, int num2) {
		//int suma = num2+ num1; // 32 -> "32"
		System.out.println(120);
		System.out.println("La suma es: "+ (num1 + num2));
	}
	public static double multiplicar(double n1, double n2) {
		/*
		double resultado = n1 * n2;
		return resultado;
		*/
		return n1 * n2;
	}
}
