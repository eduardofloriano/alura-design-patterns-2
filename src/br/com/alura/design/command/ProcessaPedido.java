package br.com.alura.design.command;

public class ProcessaPedido implements Comando {

	Pedido pedido;

	public ProcessaPedido(Pedido pedido) {
		super();
		this.pedido = pedido;
	}

	@Override
	public void executa() {
		System.out.println("Executando comando " + this.getClass().getSimpleName() + ": " + pedido.getCliente().getNome());
		pedido.status = Status.PROCESSANDO;
	}

}
