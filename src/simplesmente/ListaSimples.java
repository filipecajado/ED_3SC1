package simplesmente;

import dados.Item;

public class ListaSimples {
	private No prim;
	private No ult;
	private int quantNos;

	//construtor da classe
	public ListaSimples(){
		this.prim = null;
		this.ult = null;
		this.quantNos = 0;
	}
	public int getQuantNos(){
		return this.quantNos;
	}
	public No getPrim(){
		return this.prim;
	}
	public No getUlt(){
		return this.ult;
	}
	public void setQuantNos(int novoValor){
		this.quantNos = novoValor;
	}
	public void setPrim(No novoNo){
		this.prim = novoNo;
	}
	public void setUlt(No novoNo){
		this.ult = novoNo;
	}
	public boolean eVazia (){
		return (this.prim == null);
	}
	//insere um novo n� no final da lista ou se a lista estiver vazia, insere o primeiro n� na lista
	public void inserirUltimo (Item elem){
		No novoNo = new No (elem);
		if (this.eVazia()){
			this.prim = novoNo;
		} else {
			this.ult.setProx(novoNo);
		}
		this.ult = novoNo;
		this.quantNos++;
	}
	//retorna o endere�o do n� que est� contendo o valor a ser procurado.
	public No pesquisarNo (int chave){
		No atual = this.prim;
		while ((atual != null) && (atual.getInfo().getChave() != chave)){
			atual = atual.getProx();
		}	
		return atual;
	}
	//remove um determinado n� em qualquer posi��o na lista.
	public boolean removerNó(int chave) {
		No atual = this.prim;
		No ant = null;
		if (eVazia()){
			return false;
		} else {
			while ((atual != null)&&(atual.getInfo().getChave()!= chave)){
				ant = atual;
				atual = atual.getProx();
			}
			if (atual == null){
				return false;
			}
			else{
				if (atual == this.prim){
					if (this.prim == this.ult){
						this.ult = null;
					}
					this.prim = this.prim.getProx();
				} else {
					if (atual == this.ult){
						this.ult = ant;
					}
					ant.setProx(atual.getProx());
				}
				this.quantNos--;
				return true;
			}
		}
	}
	//outra forma de escrever o m�todo para remover determinado N�
	public boolean removerNo(int x){
		if (this.eVazia()){
			return false;
		}else{
			if (this.prim.getInfo().getChave()==x){
				if (this.prim.getProx()==null){//se for �nico n� da lista
					this.ult = null;
				}
				//remover o primeiro n� da lista
				this.prim = this.prim.getProx();
			}else{
				No atual = this.prim;
				while ((atual.getProx()!=null)&&
						(atual.getProx().getInfo().getChave()!=x)){
					atual = atual.getProx();
				}
				if (atual.getProx()==null){//n�o achou o valor na lista
					return false;
				}else{
					if (atual.getProx()==this.ult){//se for o �ltimo n�
						atual.setProx(null);
						this.ult = atual;
					}else{	//remove o n� no meio da lista
						atual.setProx(atual.getProx().getProx());
					}
				}
			}
			this.quantNos--;
			return true;
		}
	}
	//mostra todo o conte�do da lista
	public String toString(){
		String msg = "";
		No atual = this.prim;
		while (atual != null){
			msg += atual.getInfo().getChave()+"\n";
			atual = atual.getProx();
		}
		return msg;
	}
	
	
	//alterar conte�do de um n�
	public boolean alterarNo(int x, int novo) {
		if (this.eVazia()) {
			return false;
		}else {
			No achou = this.pesquisarNo(x);
			if (achou == null) {
				return false;
			}else {
				achou.setInfo(new Item(novo));
				return true;
			}
		}
	}
	//Atividade 02 - quest�o 07
	public int somarNos() {
		int soma = 0;
		No atual = this.prim;
		for (int i = 1; i <= this.quantNos; i++) {
			soma += atual.getInfo().getChave();
			atual = atual.getProx();
		}
		return soma;
	}
	
	// Atividade 02 - questao 08
	public float mediaNos() {
		float media = 0;
		float soma =  0;
		No atual = this.prim;
		for (int i = 1; i <= this.quantNos; i++) {
			soma += atual.getInfo().getChave();
			atual = atual.getProx();
		}
		media = (soma/this.quantNos);
		return media;
	}
	
	// Atividade 02 - questao 09
	public String parNos() {
		String msg = "";
		No atual = this.prim;
		while (atual != null) {	
			if ( atual.getInfo().getChave()%2 == 0 ) {
				msg +=atual.getInfo().getChave()+"\n";
			} 
			atual = atual.getProx();
		}
		return msg;
	}
	
	// Atividade 02 - questao 10 
	
	public boolean verificarLista(ListaSimples lista2) {
		if(this.quantNos != lista2.quantNos) {
			return false;
		} else {
			No atual = this.prim;
			No atual2 = lista2.prim;
			while(atual != null) {
				if (atual.getInfo().getChave() == atual2.getInfo().getChave()) {
					atual = atual.getProx();
					atual2 = atual2.getProx();
				} else {
					return false;
				}
			}
		}return true;
	}
	

	// Atividade 02 - questao 11
	
	public String efetuarTroca(int num) {
		No atual = this.prim;
		while (atual != null) {
			if (atual.getInfo().getChave() == num) {
				atual.getInfo().setChave(50);
				return "alteracao realizada com sucesso";
			} 
			atual = atual.getProx();
		}
		return "Valor não encontrado";
	}
	// Atividade 03 - questao 12 
	
	public int contarValor(int num) {
		No atual = this.prim;
		int contNum = 0;
		while (atual != null) {
			if (atual.getInfo().getChave() == num) {
				contNum++;
			}
			atual = atual.getProx();
		}
		
		if (contNum == 0) {
			this.inserirUltimo(new Item(num));
			return 1;
		} else {
			return contNum;
		}	
		
	}
	
	
	
	
}//fecha classe
