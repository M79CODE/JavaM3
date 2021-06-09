package fibonacciM3;

import java.util.Scanner;

public class FibonacciM3 {

	public static void main(String[] args) {
		
		/* Nivell 3
			Escriviu un programa que donat un numero N retorni la seqüència de Fibonacci fins al numero N.
			La seqüència de Fibonacci és la sèrie de nombres: 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, ... El número següent es troba sumant els dos números anteriors.
		*/
		
		Scanner reader3 = new Scanner(System.in);
		System.out.print("Introdueix un número per mostrar-te la seqüència de Fibonacci: ");
		int n = reader3.nextInt();
		
		if(n<1) {
			System.out.println("Has d'introduir un número igual o major que 1");
			n = reader3.nextInt();
		}
		
		reader3.close();
		
		fibonacciCalc(n);

	}
	
	static void fibonacciCalc(int n) {
		
		int fibNum = 0;
		int[] fibonacciNums = new int[n];
	    
		for(int i=0; i<n; i++) {
			if (i==0){
				fibonacciNums[i] = fibNum;
		    } else if (i==1) {
		    	fibNum = 1;
				fibonacciNums[i] = fibNum;
		    } else {
		    	fibNum = fibonacciNums[i-1] + fibonacciNums[i-2];
				fibonacciNums[i] = fibNum;
		    } 
		}
				
		System.out.println();
		
		System.out.println("Seqüència de Fibonacci de " + n + ":");
		
		for(int i=0; i<fibonacciNums.length ;i++) {
 	         System.out.print(fibonacciNums[i] + " ");
 	    }
	}

}
