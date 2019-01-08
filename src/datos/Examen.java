package datos;

public class Examen {
	// Objetivos 1 y 2
	private int obj1;
	private String obj2;
	private char obj3;
	private boolean obj4;
	
	public Examen() {};


	public Examen(int obj1, String obj2, char obj3, boolean obj4) {
		this.obj1 = obj1;
		this.obj2 = obj2;
		this.obj3 = obj3;
		this.obj4 = obj4;
	}
	
	


	public int getObj1() {
		return obj1;
	}


	public void setObj1(int obj1) {
		this.obj1 = obj1;
	}


	public String getObj2() {
		return obj2;
	}


	public void setObj2(String obj2) {
		this.obj2 = obj2;
	}


	public char getObj3() {
		return obj3;
	}


	public void setObj3(char obj3) {
		this.obj3 = obj3;
	}


	public boolean isObj4() {
		return obj4;
	}


	public void setObj4(boolean obj4) {
		this.obj4 = obj4;
	}




	private int[][] notasAlumnos = { { 5, 6, 3, 9, 8 }, { 7, 2, 8, 4, 5 }, { 8, 5, 6, 2, 4 } };
	private String[] alumnos = { "Pepe", "Manuel", "Carlos" };
	private String[] modulos = { "PRO", "SSF", "LND", "LNT", "FOL" };
	
	/*5. A partir de la propiedad notasAlumnos, clase Examen, se pide:
	 * Un listado con la nota media de cada alumno. Debe salir el nombre  de cada alumno con su nota media
	 */
	
	public void listadoNotaMedia() {
		int acumulador = 0;
		for(int i=0; i<notasAlumnos.length; i++) {
			for(int j=0; j<notasAlumnos[i].length; j++) {
				acumulador += notasAlumnos[i][j];
			}
			System.out.println(alumnos[i] + ": " + acumulador + " de Nota Media.");
		}
	}
	
}
