package br.com.alura.design.command;

import java.util.ArrayList;
import java.util.List;

public class ListaDeComandos {

	List<Comando> comandos;

	public ListaDeComandos() {
		this.comandos = new ArrayList<Comando>();
	}

	public void adicionaComando(Comando comando) {
		this.comandos.add(comando);
	}

	public void processa() {
		for (Comando comando : comandos) {
			comando.executa();
		}

	}

}
