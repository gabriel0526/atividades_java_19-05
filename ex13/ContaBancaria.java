package ex13;

public class ContaBancaria {
	String numeroConta;
    double saldo;

    public ContaBancaria(String numeroConta) {
        this.numeroConta = numeroConta;
        this.saldo = 0;
    }

    public void depositar(double valor) {
        saldo += valor;
    }

    public void sacar(double valor) {
        if (valor <= saldo) {
            saldo -= valor;
        } 
        else {
            System.out.println("Saldo insuficiente!");
        }
    }
}
