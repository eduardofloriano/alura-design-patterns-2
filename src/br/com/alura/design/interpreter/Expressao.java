package br.com.alura.design.interpreter;

import br.com.alura.design.visitor.ImpressoraVisitor;

public interface Expressao {

	public int avalia();
	void aceita(ImpressoraVisitor visitor);
	
}
