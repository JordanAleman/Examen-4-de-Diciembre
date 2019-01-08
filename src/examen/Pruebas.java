package examen;

import datos.Examen;

public class Pruebas {
	/*
	 * 3. Crear un m�todo que devuelva el producto de dos n�meros enteros. El prototipo del m�todo debe ser :
	 	* public int productoDosNumeros (int a, int b)
 	 * La implementaci�n del m�todo se debe hacer haciendo �repetici�n de sumas�.
	 */
	public int productoDosNumeros (int a, int b) {
		int sumador = a;
		for(int i=1; i<b; i++) {
			a += sumador;
		}
		return a;
	}
	

	// Desarrolllar los m�todos del examen AQUI (ver Objetivos)
	public static void main(String[] args) {
		// Hacer las llamadas a los m�todos AQUI.
		// (no olvidar recoger los valores devueltos
		
		// 2.1 declara e inicializa  dos objetos de la clase Examen.
		Examen exm1 = new Examen();
		Examen exm2 = new Examen();
		
		// 2.2 a�adir los dos objetos anteriores a un array de esa clase, de 5 elementos de tama�o.
		Examen[] exmArray = new Examen[5];
		exmArray[0] = exm1;
		exmArray[1] = exm2;
		
		// Objetivo 3
		System.out.println(new Pruebas().productoDosNumeros(3, 4));
		
	}
}
