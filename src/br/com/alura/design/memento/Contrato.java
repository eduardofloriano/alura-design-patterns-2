package br.com.alura.design.memento;

import java.util.Calendar;

public class Contrato {
	
	private Calendar data;
	private String cliente;
	private TipoContrato  tipo;
		
	private Historico historico = new Historico(); 
	
	public Contrato(Calendar data, String cliente, TipoContrato tipo) {
		super();
		this.data = data;
		this.cliente = cliente;
		this.tipo = tipo;
	}
	
	public Calendar getData() {
		return data;
	}
	public void setData(Calendar data) {
		this.data = data;
	}
	public String getCliente() {
		return cliente;
	}
	public void setCliente(String cliente) {
		this.cliente = cliente;
	}
	public TipoContrato getTipo() {
		return tipo;
	}
	public void setTipo(TipoContrato tipo) {
		this.tipo = tipo;
	}
	
	
	public void avanca(){
		
		if(tipo == TipoContrato.NOVO){
			adicionaHistorico();
			tipo = TipoContrato.EM_ANDAMENTO;
		}else if (tipo == TipoContrato.EM_ANDAMENTO){
			adicionaHistorico();
			tipo = TipoContrato.ACERTADO;
		}else if (tipo == TipoContrato.ACERTADO){
			adicionaHistorico();
			tipo = TipoContrato.CONCLUIDO;
		}
		
	}
	
	private void adicionaHistorico(){
		this.historico.adiciona(new Contrato(this.data, this.cliente, this.tipo));
	}

	public Contrato retornaEstadoContrato(int index){
		return this.historico.getContrato(index);
	}
	
}
