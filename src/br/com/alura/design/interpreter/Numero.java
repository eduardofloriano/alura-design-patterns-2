package br.com.alura.design.interpreter;

import br.com.alura.design.visitor.ImpressoraVisitor;

public class Numero implements Expressao {

	
	private int numero;
	
	public Numero(int numero){
		this.numero = numero;
	}
	@Override
	public int avalia() {
		return numero;
	}
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	@Override
	public void aceita(ImpressoraVisitor visitor) {
		visitor.visitaNumero(this);
		
	}
	
	

}
