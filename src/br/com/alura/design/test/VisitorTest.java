package br.com.alura.design.test;

import br.com.alura.design.interpreter.Numero;
import br.com.alura.design.interpreter.Soma;
import br.com.alura.design.interpreter.Subtracao;
import br.com.alura.design.visitor.ImpressoraVisitor;

public class VisitorTest {

	public static void main(String[] args) {

		Soma resultado = new Soma(new Soma(new Numero(5), new Numero(20)), new Subtracao(new Numero(4), new Numero(2)));

//		Soma resultado = new Soma( new Soma(new Numero(5), new Numero(1)), new Numero(10));
		
		new ImpressoraVisitor().visitaSoma(resultado);
		
		
//		System.out.println(resultado);

	}
}
