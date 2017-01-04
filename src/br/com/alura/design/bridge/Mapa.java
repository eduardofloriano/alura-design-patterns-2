package br.com.alura.design.bridge;


/**
 * Repare que essa interface é uma "ponte" para a implementação concreta. O nome desse padrão de projeto é justamente esse: bridge.
 * @author Eduardo
 *
 */
public interface Mapa {

	public String devolveMapa(String rua);
	
}
