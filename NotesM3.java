package notesM3;

import java.util.Scanner;

public class NotesM3 {

	public static void main(String[] args) {
		
		/* Nivell 2
			En aquest exercici crear�s un array bidimensional on introduir�s 3 notes per a 5 alumnes. Es calcular� la nota mitjana de
			cada alumna i s'indicar� si han susp�s o no.
			Crea un array bidimensional capa� de guardar 3 notes de 5 alumnes.
			Omple l�array amb un bucle demanant els valors per pantalla (nota entre 0 i 10), has d�identificar per pantalla quan
			�s una agrupaci� d�un alumne nou.
			Recorre l'array, fes la Mitjana aritm�tica de les 3 notes i indica si l'alumne ha aprovat o susp�s
		*/
		
		double[][] notes = new double[5][3];
		Scanner reader3 = new Scanner(System.in);
		double notaTotal;
		
		for(int i=0; i<5; i++) {
			for(int j=0; j<3;j++) {
				System.out.print("Introdueix la nota " + (j+1) + " per a l'alumne " + (i+1) + ": ");
				notes[i][j] = reader3.nextDouble();
			}
			System.out.println();
		}
		
		reader3.close();
		
		for(int i=0; i<5; i++) {
			notaTotal = 0;
			
			for(int j=0; j<3; j++) {
				notaTotal += notes[i][j];	
			}
			
			double notaMitja = notaTotal/3;
			
			if((notaMitja) >= 5) {
				System.out.println("L'alumne " + (i+1) + " ha aprovat amb un " + (notaMitja));
			} else {
				System.out.println("L'alumne " + (i+1) + " ha susp�s amb un " + (notaMitja));
			}
		}
	}
}
