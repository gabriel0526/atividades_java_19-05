package ex7;

public class main {

	public static void main(String[] args) {
		int n1 = 1;
		int n2 = 1;
		int n3 = 9;
		
		if(n1 > n2 && n1 > n3) {
			System.out.println("o maior numero é = " + n1);
		}
		else if(n2 > n1 && n2 > n3) {
			System.out.println("o maior numero é = " + n2);
		}
		else {
			System.out.println("o maior numero é = " + n3);
		}

	}

}
