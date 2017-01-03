package br.com.alura.design.memento;

import java.util.ArrayList;
import java.util.List;

public class Historico {
	
	private List<Contrato> contratosSalvos = new ArrayList<Contrato>();
	
	public Contrato getContrato(int index){
		return this.contratosSalvos.get(index);
	}

	public void adiciona(Contrato contrato){
		this.contratosSalvos.add(contrato);
	}
	
}
