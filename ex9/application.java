package ex9;

import java.util.Scanner;

public class application {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String texto = sc.nextLine();
		int contador = 0;
		for(int i= 0; i<texto.length();i++) {
			char letra = Character.toLowerCase(texto.charAt(i));
			if(letra == 'a' || letra == 'e' || letra == 'i' || letra == 'o' || letra =='u') {
				contador ++;
			}
		}
		System.out.println("a quantidade de vogais é = " + contador);
	}

}
