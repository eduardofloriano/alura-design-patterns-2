package br.com.alura.design.bridge;


/**
 * Repare que essa interface � uma "ponte" para a implementa��o concreta. O nome desse padr�o de projeto � justamente esse: bridge.
 * @author Eduardo
 *
 */
public interface Mapa {

	public String devolveMapa(String rua);
	
}
