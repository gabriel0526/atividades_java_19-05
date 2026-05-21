package ex5;

public class main {

	public static void main(String[] args) {
		double peso = 71.7;
		double altura = 1.80;
		
		double IMC = peso / (altura * altura);
		System.out.printf("IMC = %.2f ", IMC);
	}

}
