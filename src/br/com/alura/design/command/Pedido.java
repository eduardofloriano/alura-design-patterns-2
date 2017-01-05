package br.com.alura.design.command;

public class Pedido {

	public Cliente cliente;
	public Double valor;
	public Status status;
	
	public Pedido(String cliente, Double valor) {
		this.cliente = new Cliente(cliente);
		this.valor = valor;
		this.status = Status.NOVO;
	}
	
	public Cliente getCliente() {
		return cliente;
	}
	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
	public Double getValor() {
		return valor;
	}
	public void setValor(Double valor) {
		this.valor = valor;
	}
	public Status getStatus() {
		return status;
	}
	public void setStatus(Status status) {
		this.status = status;
	}
	
	
	
	
}
