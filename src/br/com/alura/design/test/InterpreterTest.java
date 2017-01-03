package br.com.alura.design.test;

import br.com.alura.design.interpreter.Numero;
import br.com.alura.design.interpreter.Soma;
import br.com.alura.design.interpreter.Subtracao;

public class InterpreterTest {

	public static void main(String[] args) {
		
		int resultado = new Soma(new Soma(new Numero(5),  new Numero(20)), new Subtracao(new Numero(4), new Numero(2))).avalia();
		
		System.out.println(resultado);
		
		
	}

}
