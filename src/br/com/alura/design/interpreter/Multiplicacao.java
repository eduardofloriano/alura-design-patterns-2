package br.com.alura.design.interpreter;

import br.com.alura.design.visitor.ImpressoraVisitor;

public class Multiplicacao implements Expressao {

	private Expressao esquerda;
	private Expressao direita;

	public Multiplicacao(Expressao esquerda, Expressao direita){
		this.esquerda = esquerda;
		this.direita = direita;
	}
	
	@Override
	public int avalia() {
		
		int valorEsquerda = esquerda.avalia();
		int valorDireita = direita.avalia();
		return valorEsquerda * valorDireita;
	}

	@Override
	public void aceita(ImpressoraVisitor visitor) {
		// TODO Auto-generated method stub
		
	}

}
