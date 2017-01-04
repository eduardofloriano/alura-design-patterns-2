package br.com.alura.design.interpreter;

import br.com.alura.design.visitor.Visitor;

public class Subtracao implements Expressao{
	
	public Expressao esquerda;
	public Expressao direita;

	public Subtracao(Expressao esquerda, Expressao direita){
		this.esquerda = esquerda;
		this.direita = direita;
	}
	
	@Override
	public int avalia() {
		
		int valorEsquerda = esquerda.avalia();
		int valorDireita = direita.avalia();
		return valorEsquerda - valorDireita;
	}

	@Override
	public void aceita(Visitor visitor) {
		visitor.visitaSubtracao(this);
		
	}

	
}
