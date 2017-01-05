package br.com.alura.design.facade;

/**
 * Se temos muito sub-sistemas, e mais complexos, pode ser difícil para um
 * cliente fazer uso de todos esses objetos. Poderíamos então dar uma interface
 * única e mais amigável para esses objetos de domínio. Dessa forma, a classe
 * cliente consumiria apenas essa interface única, sem precisar conhecer cada
 * objeto: Esse padrão de projeto, que provê uma "fachada" para os serviços
 * disponibilizados pelos sub-sistemas, é conhecido pelo nome de Façade.
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
