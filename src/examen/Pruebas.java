package examen;

import datos.Examen;

public class Pruebas {

	// Desarrolllar los métodos del examen AQUI (ver Objetivos)
	public static void main(String[] args) {
		// Hacer las llamadas a los métodos AQUI.
		// (no olvidar recoger los valores devueltos
		
		// 2.1 declara e inicializa  dos objetos de la clase Examen.
		Examen exm1 = new Examen();
		Examen exm2 = new Examen();
		
		// 2.2 añadir los dos objetos anteriores a un array de esa clase, de 5 elementos de tamaño.
		Examen[] exmArray = new Examen[5];
		exmArray[0] = exm1;
		exmArray[1] = exm2;

		
	}
}
