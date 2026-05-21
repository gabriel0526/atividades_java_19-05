package ex17;

public class main {

	public static void main(String[] args) {
		Pessoa p = new Pessoa("Gabriel", 20);
        System.out.println("Idade atual: " + p.idade);
        p.fazerAniversario();
        System.out.println("Nova idade: " + p.idade);

	}

}
