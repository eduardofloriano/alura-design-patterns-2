package br.com.alura.design.adapter;

import java.util.Calendar;

public class RelogioDoSistema  implements Relogio{

	@Override
	public Calendar dataAtual() {
		return Calendar.getInstance();
	}

}
