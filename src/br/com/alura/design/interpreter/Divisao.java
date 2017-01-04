package br.com.alura.design.interpreter;

import br.com.alura.design.visitor.Visitor;

public class Divisao implements Expressao {
	
	private Expressao esquerda;
	private Expressao direita;

	public Divisao(Expressao esquerda, Expressao direita){
		this.esquerda = esquerda;
		this.direita = direita;
	}
	
	@Override
	public int avalia() {
		
		int valorEsquerda = esquerda.avalia();
		int valorDireita = direita.avalia();
		return valorEsquerda / valorDireita;
	}

	@Override
	public void aceita(Visitor visitor) {
		// TODO Auto-generated method stub
		
	}

}
