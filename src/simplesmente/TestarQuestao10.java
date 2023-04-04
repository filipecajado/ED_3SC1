package simplesmente;

import dados.Item;

public class TestarQuestao10 {

	public static void main(String[] args) {
		ListaSimples lista = new ListaSimples();
		ListaSimples lista2 = new ListaSimples();
		
		lista.inserirUltimo(new Item(2));
		lista.inserirUltimo(new Item(5));
		lista.inserirUltimo(new Item(4));
		lista.inserirUltimo(new Item(2));
		
		lista2.inserirUltimo(new Item(2));
		lista2.inserirUltimo(new Item(5));
		lista2.inserirUltimo(new Item(4));
		lista2.inserirUltimo(new Item(2));
		
		System.out.println("As listas são iguas?  "+lista.verificarLista(lista2));

	}

}
