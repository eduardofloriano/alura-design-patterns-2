package br.com.alura.design.test;

import java.util.Calendar;

import br.com.alura.design.memento.Contrato;
import br.com.alura.design.memento.TipoContrato;

public class MementoTest {

	public static void main(String[] args) {
		
		Contrato contrato = new Contrato(Calendar.getInstance(), "Eduardo", TipoContrato.NOVO);
		
		System.out.println("Estado do contrato: " + contrato.getTipo().toString());
		
		contrato.avanca();
		
		System.out.println("Estado do contrato: " + contrato.getTipo().toString());
		
		contrato.avanca();
		
		System.out.println("Estado do contrato: " + contrato.getTipo().toString());
		
		contrato = contrato.retornaEstadoContrato(1);
		
		System.out.println("Estado do contrato: " + contrato.getTipo().toString());
		
		
	}
}
