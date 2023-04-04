package simplesmente;

import dados.Item;

public class TestarMetodos {

	public static void main(String[] args) {
		ListaSimples lista = new ListaSimples();

		lista.inserirUltimo(new Item(10));
		lista.inserirUltimo(new Item(20));
		lista.inserirUltimo(new Item(30));

		System.out.println("conteúdo da lista:\n"+lista.toString());

		if (lista.alterarNo(20, 50)) {
			System.out.println("alteração realizada com sucesso.");
			System.out.println("conteúdo da lista:\n"+lista.toString());
		}else {
			System.out.println("o valor "+20+ " não está na lista.");

		}
	}
}
