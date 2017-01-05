package br.com.alura.design.test;

import br.com.alura.design.command.ListaDeComandos;
import br.com.alura.design.command.PagaPedido;
import br.com.alura.design.command.Pedido;
import br.com.alura.design.command.ProcessaPedido;

public class CommandTest {

	public static void main(String[] args) {
		
		Pedido p1 = new Pedido("Eduardo", 150.0);
		Pedido p2 = new Pedido("Floriano", 350.0);
		
		ListaDeComandos listaDeComandos = new ListaDeComandos();
		listaDeComandos.adicionaComando(new ProcessaPedido(p1));
		listaDeComandos.adicionaComando(new ProcessaPedido(p2));
		listaDeComandos.adicionaComando(new PagaPedido(p1));
		listaDeComandos.adicionaComando(new PagaPedido(p2));
		
		
		listaDeComandos.processa();
		
	}
	
	
}
