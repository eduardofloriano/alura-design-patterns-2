package br.com.alura.design.visitor;

import br.com.alura.design.interpreter.Numero;
import br.com.alura.design.interpreter.Soma;
import br.com.alura.design.interpreter.Subtracao;

public class ImpressoraVisitor {

	
	public void visitaSoma( Soma soma ){
		
		System.out.print("(");

		//Esquerda
		soma.esquerda.aceita(this);
		
		System.out.print(" + ");
		
		//Direita
		soma.direita.aceita(this);
		
		System.out.print(")");
		
	}
	
	public void visitaSubtracao( Subtracao subtracao ){
		
		System.out.print("(");
		
		//Esquerda
		subtracao.esquerda.aceita(this);
		
		System.out.print(" - ");
		
		//Direita
		subtracao.esquerda.aceita(this);
		
		System.out.print(")");
		
	}
	
	public void visitaNumero(Numero numero){
		System.out.print(numero.getNumero());
	}
	
	
}
