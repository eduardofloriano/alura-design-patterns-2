package br.com.alura.design.visitor;

import br.com.alura.design.interpreter.Numero;
import br.com.alura.design.interpreter.Soma;
import br.com.alura.design.interpreter.Subtracao;

public interface Visitor {

	public void visitaSoma(Soma soma);
	public void visitaSubtracao	(Subtracao soma);
	public void visitaNumero(Numero numero);
	
//	public void visita(Expressao expressao);
	
}
