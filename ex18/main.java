package ex18;

public class main {

	public static void main(String[] args) {
			Produto p = new Produto("Notebook", 3000);
	        System.out.println("Preço original: " + p.preco);
	        p.aplicarDesconto(10);
	        System.out.println("preço com desconto: " + p.preco);
	}

}
