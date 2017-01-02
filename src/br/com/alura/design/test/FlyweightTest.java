package br.com.alura.design.test;

import java.util.Arrays;
import java.util.List;

import br.com.alura.design.flyweight.Nota;
import br.com.alura.design.flyweight.NotasMusicais;
import br.com.alura.design.flyweight.Piano;

public class FlyweightTest {

	public static void main(String[] args) {

		NotasMusicais notas = new NotasMusicais();

		List<Nota> musica = Arrays.asList(
				notas.pegaNota("do"),
				notas.pegaNota("re"),
				notas.pegaNota("mi"),
				notas.pegaNota("fa"),
				notas.pegaNota("fa"),
				notas.pegaNota("fa")
		);

		System.out.println(musica.toString());
		Piano piano = new Piano();
		piano.toca(musica);
	}

}
