package br.com.alura.design.interpreter;

import br.com.alura.design.visitor.Visitor;

public class RaizQuadrada implements Expressao {

	
	
	private Expressao numero;
	

	public RaizQuadrada(Expressao numero){
		this.numero = numero;
		
	}
	
	@Override
	public int avalia() {
		
		int valor = numero.avalia();
		Double resultado = Math.sqrt(valor); 
		return resultado.intValue();
	}

	@Override
	public void aceita(Visitor visitor) {
		// TODO Auto-generated method stub
		
	}

}
