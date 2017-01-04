package br.com.alura.design.adapter;

import java.util.Calendar;

/**
 * às vezes o serviço que precisamos abstrair não é nem um serviço de terceiro,
 * mas sim algum código legado existente. É comum que, no processo de
 * refatoração de um sistema, jogamos fora as classes antigas aos poucos. É
 * comum também que algumas classes não possam ser descartadas, e essas classes
 * "feias" acabam por sujar o novo domínio que está sendo criado, de maneira
 * mais elegante.
 * 
 * @author Eduardo
 *
 */
public interface Relogio {

	public Calendar dataAtual();
}
