package br.com.alura.design.facade;

/**
 * Se temos muito sub-sistemas, e mais complexos, pode ser dif�cil para um
 * cliente fazer uso de todos esses objetos. Poder�amos ent�o dar uma interface
 * �nica e mais amig�vel para esses objetos de dom�nio. Dessa forma, a classe
 * cliente consumiria apenas essa interface �nica, sem precisar conhecer cada
 * objeto: Esse padr�o de projeto, que prov� uma "fachada" para os servi�os
 * disponibilizados pelos sub-sistemas, � conhecido pelo nome de Fa�ade.
 * 
 * @author Eduardo
 *
 */
public class EmpresaFacade {

	public Cliente buscaCliente(String cpf) {
		return new ClienteDAO().buscaPorCpf(cpf);
	}

	public Fatura criaFatura(Cliente cliente, double valor) {
		return new Fatura(cliente, valor);
	}

	public Cobranca geraCobranca(Fatura fatura) {
		Cobranca cobranca = new Cobranca(Tipo.BOLETO, fatura);
		cobranca.emite();

		return cobranca;
	}

	public ContatoCliente fazContato(Cliente cliente, Cobranca cobranca) {
		ContatoCliente contato = new ContatoCliente(cliente, cobranca);
		contato.dispara();

		return contato;
	}

}
