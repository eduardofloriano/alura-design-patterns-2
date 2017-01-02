package br.com.alura.design.test;

import java.sql.Connection;

import br.com.alura.design.factory.ConnectionFactory;

public class FactoryTest {

	public static void main(String[] args) {
		Connection c = new ConnectionFactory().getConnection();
	}

}
