package br.com.alura.design.bridge;

public class GoogleMaps implements Mapa{

	@Override
	public String devolveMapa(String rua) {
		//Codigo que consome API do Google para devolver o mapa da rua
		return "Resposta do Google";
	}

	
	
	
}
