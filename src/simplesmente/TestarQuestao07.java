package simplesmente;

import dados.Item;

public class TestarQuestao07 {

	public static void main(String[] args) {
		ListaSimples lista = new ListaSimples();
		
		lista.inserirUltimo(new Item(1));
		lista.inserirUltimo(new Item(10));
		lista.inserirUltimo(new Item(1));
		lista.inserirUltimo(new Item(1));
		
		System.out.println("a soma é "+lista.somarNos());
		
		
	}

}
