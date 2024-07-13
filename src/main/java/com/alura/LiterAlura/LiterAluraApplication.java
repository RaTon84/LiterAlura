package com.alura.LiterAlura;

import com.alura.LiterAlura.model.DatosLibro;
import com.alura.LiterAlura.service.ConsumoAPI;
import com.alura.LiterAlura.service.ConvertirJSON;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Scanner;

@SpringBootApplication
public class LiterAluraApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(LiterAluraApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		System.out.println("hola");
		String URL_BASE = "https://gutendex.com/books/?";
		ConsumoAPI consumoAPI = new ConsumoAPI();
		String json = consumoAPI.obtenerDatos(URL_BASE+"search=romeo");
		System.out.println(json);

		Scanner input = new Scanner(System.in);

		ConvertirJSON convertirJSON = new ConvertirJSON();
		var datos = convertirJSON.obtenerDatos(json, DatosLibro.class);
		System.out.println(datos);
	}
}
