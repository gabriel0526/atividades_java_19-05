package ex13;

public class main {

	public static void main(String[] args) {
		ContaBancaria conta = new ContaBancaria("123456");
        conta.depositar(1000);
        conta.sacar(300);
        System.out.println("Saldo final: " + conta.saldo);
	}

}
