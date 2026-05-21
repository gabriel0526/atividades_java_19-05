package ex8;

import java.util.Locale;
import java.util.Scanner;

public class program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		
		Double celsius = sc.nextDouble();
		double F = (celsius * 9/5) + 32;
		
		System.out.printf("o valor em fahrenheit = %.2f ", F);
	}

}
