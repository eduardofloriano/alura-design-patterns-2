package br.com.alura.design.flyweight;

import java.util.HashMap;
import java.util.Map;

public class NotasMusicais {

	private static Map<String, Nota> notas = new HashMap<String, Nota>();
	
	
	//COnstrutor est�tico � inicializado pela JVM no inicio da aplica��o
	static {
		
		notas.put("do", new Do());
		notas.put("re", new Re());
		notas.put("mi", new Mi());
		notas.put("fa", new Fa());
		notas.put("sol", new Sol());
		notas.put("la", new La());
		notas.put("si", new Si());
		
	}
	
	public Nota pegaNota (String nome){
		return notas.get(nome);
	}
			
}
