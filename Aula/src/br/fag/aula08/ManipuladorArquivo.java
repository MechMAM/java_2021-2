package br.fag.aula08;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ManipuladorArquivo {

	private static Properties prop;

	private static String login;
	private static String host;
	private static String password;

	public static Properties getProp() throws IOException {
		Properties props = new Properties();
		FileInputStream file = new FileInputStream("./src/properties/dados.properties");
		props.load(file);
		return props;

	}

	public static void main(String args[]) {
		obterPropriedades();

		exibirPropriedades(login, host, password);
	}

	private static void obterPropriedades() {

		System.out.println("************Teste de leitura do arquivo de propriedades************");

		try {
			prop = getProp();
		} catch (Exception e) {
			System.out.println("Ocorreu um problema ao ler as propriedades: " + e.getMessage());
		} finally {

		}

		login = prop.getProperty("prop.server.login");
		host = prop.getProperty("prop.server.host");
		password = prop.getProperty("prop.server.password");
	}

	private static void exibirPropriedades(String login, String host, String password) {
		System.out.println("Login = " + login);
		System.out.println("Host = " + host);
		System.out.println("Password = " + password);
	}
}