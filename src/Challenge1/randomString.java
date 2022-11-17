package Challenge1;

import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class randomString {
	
public static void main(String[] args) {
		
		int l = 10;
		String str = RandomString (l);
		System.out.printf("CADENA ALEATORIA DE %d CARACTERES: %s \n", l, str);
		Scanner sc = new Scanner (System.in);
		boolean exit = false;
		int tipo;
		StringBuilder str1 = new StringBuilder (str);
		str1 = str1.delete(8, 10);
		
		while (!exit) {
			System.out.println("Escoge un tipo marcando 1, 2 ó 3");
			System.out.println("1. Tipo A ");
			System.out.println("2. Tipo B ");
			System.out.println("3. Salir ");
			tipo = sc.nextInt();
			
			switch (tipo) {
			case 1:
				System.out.println("ESCOGISTE TIPO A: 54" + str1 +"\n");
				break;
			case 2:
				System.out.println("ESCOGISTE TIPO B: 08" + str1 +"\n");
				break;
			case 3:
				exit = true;
				break; 
			default:
				System.out.println("Solo numeros entre 1 y 3");
			}
		}
		
	}

	private static String RandomString(int l) {
		String charNum = "0147852369";
		String str = "";
		for (int x = 0; x < l; x++) {
			int randomIndex = numRandom(0, charNum.length() -1);
			char charRandom = charNum.charAt(randomIndex);
			str += charRandom;
		}
		return str;
	}

	private static int numRandom(int i, int j) {
		
		return ThreadLocalRandom.current().nextInt(i, j +1);
	}
}
