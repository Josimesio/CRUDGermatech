package com.rossini.people;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.awt.*;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;

@SpringBootApplication
public class PeopleApplication {

	public static void main(String[] args) {
		SpringApplication.run(PeopleApplication.class, args);
		openBrowser("http://localhost:8080/index.html"); // Ajuste a URL conforme necessário
	}

	private static void openBrowser(String url) {
		// Verifica se o Desktop é suportado
		if (Desktop.isDesktopSupported()) {
			try {
				// Tenta abrir a URL no navegador padrão
				Desktop.getDesktop().browse(new URI(url));
			} catch (IOException | URISyntaxException e) {
				e.printStackTrace(); // Trata a exceção conforme necessário
			}
		} else {
			System.out.println("Desktop não suportado. Não foi possível abrir o navegador.");
		}
	}
}