package Challenge1;

import java.util.Arrays;
import java.util.Scanner;


public class numArray {

	public static void main(String[] args) {
		
		int [] numeros = new int [10];
		array(numeros);
		printArray(numeros);
		order(numeros);
		
		
	}
	public static int [] array(int [] numeros) {
		for(int x = 0; x < numeros.length; x++) {
			numeros[x] = (int) (Math.random() * 100) + 1;
		}
		return numeros;
	}
	public static void printArray(int[] numeros){
		for(int i = 0; i < numeros.length; i++){
			System.out.print(String.valueOf(numeros[i])+  " ");
		}
		System.out.println("\n");
	}
	public static void order(int[] numeros){
		Scanner sc = new Scanner(System.in);
		System.out.println("Escoge como desea ordenr el array");
		System.out.println("1. Desc ");
		System.out.println("2. Asc");
		int tipo = sc.nextInt();
		if(tipo == 1) {
			int temporal = 0;
			for (int i = 0; i < numeros.length; i++) {
		        for (int j = 0; j < (numeros.length -i-1); j++) {
		            if (numeros[j + 1] > numeros[j]) {
		                temporal = numeros[j + 1];
		                numeros[j + 1] = numeros[j];
		                numeros[j] = temporal;
		            }
		        }
		    }
			System.out.println("Array de forma Descendente " + Arrays.toString(numeros));	
		}if (tipo == 2) {
			int temp = 0;
			for (int i = 0; i < numeros.length; i++) {
		        for (int j = 1; j < (numeros.length -i); j++) {
		        	if (numeros[j - 1] > numeros[j]) {
		                temp = numeros[j - 1];
		                numeros[j - 1] = numeros[j];
		                numeros[j] = temp;
		            }
		        }
		    }
			System.out.println("Array de forma Ascendente " + Arrays.toString(numeros));
	}
		
			
		
	}
	}


