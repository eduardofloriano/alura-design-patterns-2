package br.com.alura.design.interpreter;

import br.com.alura.design.visitor.Visitor;

public interface Expressao {

	public int avalia();
	void aceita(Visitor visitor);
	
}
