package br.com.alura.design.command;

public class PagaPedido implements Comando{

	private Pedido pedido;
	
	public PagaPedido(Pedido pedido) {
		this.pedido = pedido;
	}

	@Override
	public void executa() {
		System.out.println("Executando comando " + this.getClass().getSimpleName() + ": " + pedido.getCliente().getNome());
		this.pedido.status = Status.PAGO;
	}

}
