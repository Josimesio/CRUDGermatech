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
		openBrowser("http://localhost:8080/index.html");
	}

	private static void openBrowser(String url) {
		String os = System.getProperty("os.name").toLowerCase();
		Runtime runtime = Runtime.getRuntime();

		try {
			if (os.contains("win")) {
				runtime.exec("rundll32 url.dll,FileProtocolHandler " + url);
			} else if (os.contains("mac")) {
				runtime.exec("open " + url);
			} else if (os.contains("nix") || os.contains("nux")) {
				runtime.exec("xdg-open " + url);
			} else {
				System.out.println("Sistema operacional não suportado.");
			}
		} catch (IOException e) {
			e.printStackTrace();
		}

	}
}
