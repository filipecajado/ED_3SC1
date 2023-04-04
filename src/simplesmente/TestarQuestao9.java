package simplesmente;

import dados.Item;

public class TestarQuestao9 {

	public static void main(String[] args) {
		ListaSimples lista = new ListaSimples();
		
		lista.inserirUltimo(new Item(2));
		lista.inserirUltimo(new Item(5));
		lista.inserirUltimo(new Item(4));
		lista.inserirUltimo(new Item(2));
		
		System.out.println("Numero pares: "+lista.parNos());

	}

}
