package ciutatsM3;
import java.util.*;

public class CiutatsM3 {

	public static void main(String[] args) {
		
		/* Nivell 1
		   Fase 1
			Crea sis variables tipus String buides.
			Demana per consola que s’introdueixin els noms.
			Introdueix els següents noms de ciutats (Barcelona, Madrid, Valencia, Malaga, Cadis, Santander) per teclat.
			Mostra per consola el nom de les 6 ciutats.
		*/
		
		String city1 = "";
		String city2 = "";
		String city3 = "";
		String city4 = "";
		String city5 = "";
		String city6 = "";
		Scanner reader3 = new Scanner(System.in);
		
		for(int i=1; i<=6; i++) {
			System.out.print("Introdueix la ciutat nº " + i + ": ");
			
			if(i==1) {
				city1 = reader3.nextLine();
			} else if(i==2) {
				city2 = reader3.nextLine();
			} else if(i==3) {
				city3 = reader3.nextLine();
			} else if(i==4) {
				city4 = reader3.nextLine();
			} else if(i==5) {
				city5 = reader3.nextLine();
			} else if(i==6) {
				city6 = reader3.nextLine();
			}
		}
		
		reader3.close();
		System.out.println();
		
		for(int j=1; j<=6; j++) {
			if(j==1) {
				System.out.print(city1 + ", ");
			} else if(j==2) {
				System.out.print(city2 + ", ");
			} else if(j==3) {
				System.out.print(city3 + ", ");
			} else if(j==4) {
				System.out.print(city4 + ", ");
			} else if(j==5) {
				System.out.print(city5 + ", ");
			} else if(j==6) {
				System.out.print(city6 + ".");
			}
		}
		
		/* Fase 2
			Un cop tenim els noms de les ciutats guardats en variables haurem de passar l’informació a un array (arrayCiutats).
			Quan tinguem l’array ple, haurem de mostrar per consola el nom de les ciutats ordenades per ordre alfabètic.
		*/
		System.out.println();
		
		String [] arrayCiutats= {city1, city2, city3, city4, city5, city6};
		
		Arrays.sort(arrayCiutats);
		
		System.out.println();
		
		System.out.println("Llista de ciutats ordenades alfabèticament:");
		
		for(String city : arrayCiutats) {
			System.out.println(city);
		}
		
		/* Fase 3
			Cambieu les vocals “a” dels noms de les ciutats per el número 4 i guardeu els noms modificats en un nou array(ArrayCiutatsModificades).
			Mostreu per consola l’array modificat i ordenat per ordre alfabètic.
		*/
		System.out.println();
		
		String[] arrayCiutatsModificades = new String[arrayCiutats.length];
		int contador = 0;
		
		for(String city : arrayCiutats) {
			String cityMod = "";
			
			for(int i=0; i<city.length();i++) {
				char c = city.charAt(i);
				char cMod = '4';
				if(c =='a') {
					c = cMod;	
				}
				cityMod += c;
			}
			
			arrayCiutatsModificades[contador] = cityMod;
			contador++;
		}
		
		System.out.println("Llista de ciutats modificades i ordenades alfabèticament:");
				
		for(String cityM : arrayCiutatsModificades) {
			System.out.println(cityM);
		}
		
		/* Fase 4
			Creeu un nou array de caràcters (char array[])per cada una de les ciutats que tenim. La mida dels nous arrays serà la llargada de cada 
			String (string nomCiutat.Length).
			Ompliu els nous arrays lletra per lletra.
			Mostreu per consola els nous arrays amb els noms invertits (Ex: Barcelona - anolecraB).
		*/
		System.out.println();
		
		char[] charCity1 = new char[city1.length()];
		char[] charCity2 = new char[city2.length()];
		char[] charCity3 = new char[city3.length()];
		char[] charCity4 = new char[city4.length()];
		char[] charCity5 = new char[city5.length()];
		char[] charCity6 = new char[city6.length()];
		
		System.out.println("Llista de ciutats amb els noms invertits:");
		
		//charCity1
		for(int i=0; i<city1.length(); i++) {
			char c = city1.charAt(i);
			charCity1[i] = c;
		}
		
	    for(int i=0; i<charCity1.length; i++) {
	         System.out.print(charCity1[i]);
	    }
	     
	    System.out.print(" - ");

	    for(int i=charCity1.length-1; i>=0 ;i--) {
	         System.out.print(charCity1[i]);
	    }
	    
	    System.out.println();
	    
	    //charCity2
  		for(int i=0; i<city2.length(); i++) {
  			char c = city2.charAt(i);
  			charCity2[i] = c;
  		}
  		
  	    for(int i=0; i<charCity2.length; i++) {
  	         System.out.print(charCity2[i]);
  	    }
  	     
  	    System.out.print(" - ");

  	    for(int i=charCity2.length-1; i>=0 ;i--) {
  	         System.out.print(charCity2[i]);
  	    }
  	    
  	    System.out.println();
		
  	    //charCity3
  		for(int i=0; i<city3.length(); i++) {
  			char c = city3.charAt(i);
  			charCity3[i] = c;
  		}
  		
  	    for(int i=0; i<charCity3.length; i++) {
  	         System.out.print(charCity3[i]);
  	    }
  	     
  	    System.out.print(" - ");

  	    for(int i=charCity3.length-1; i>=0 ;i--) {
  	         System.out.print(charCity3[i]);
  	    }
  	    
  	    System.out.println();
  	    
  	    //charCity4
  		for(int i=0; i<city4.length(); i++) {
  			char c = city4.charAt(i);
  			charCity4[i] = c;
  		}
  		
  	    for(int i=0; i<charCity4.length; i++) {
  	         System.out.print(charCity4[i]);
  	    }
  	     
  	    System.out.print(" - ");

  	    for(int i=charCity4.length-1; i>=0 ;i--) {
  	         System.out.print(charCity4[i]);
  	    }
  	    
  	    System.out.println();
  	    
  	    //charCity5
  		for(int i=0; i<city5.length(); i++) {
  			char c = city5.charAt(i);
  			charCity5[i] = c;
  		}
  		
  	    for(int i=0; i<charCity5.length; i++) {
  	         System.out.print(charCity5[i]);
  	    }
  	     
  	    System.out.print(" - ");

  	    for(int i=charCity5.length-1; i>=0 ;i--) {
  	         System.out.print(charCity5[i]);
  	    }
  	    
  	    System.out.println();
  	    
  	    //charCity6
  		for(int i=0; i<city6.length(); i++) {
  			char c = city6.charAt(i);
  			charCity6[i] = c;
  		}
  		
  	    for(int i=0; i<charCity6.length; i++) {
  	         System.out.print(charCity6[i]);
  	    }
  	     
  	    System.out.print(" - ");

  	    for(int i=charCity6.length-1; i>=0 ;i--) {
  	         System.out.print(charCity6[i]);
  	    }
  	    
  	    System.out.println();
	}
	
}

		
