package br.com.alura.design.adapter;

import java.util.Calendar;

/**
 * �s vezes o servi�o que precisamos abstrair n�o � nem um servi�o de terceiro,
 * mas sim algum c�digo legado existente. � comum que, no processo de
 * refatora��o de um sistema, jogamos fora as classes antigas aos poucos. �
 * comum tamb�m que algumas classes n�o possam ser descartadas, e essas classes
 * "feias" acabam por sujar o novo dom�nio que est� sendo criado, de maneira
 * mais elegante.
 * 
 * @author Eduardo
 *
 */
public interface Relogio {

	public Calendar dataAtual();
}
