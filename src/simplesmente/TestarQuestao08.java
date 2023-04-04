package simplesmente;

import dados.Item;

public class TestarQuestao08 {

	public static void main(String[] args) {
		ListaSimples lista = new ListaSimples();
	
		
		lista.inserirUltimo(new Item(9));
		lista.inserirUltimo(new Item(5));
		lista.inserirUltimo(new Item(15));
		lista.inserirUltimo(new Item(2));
		
		System.out.println("A média dos itens da lista é igual a: "+lista.mediaNos());

	}

}
