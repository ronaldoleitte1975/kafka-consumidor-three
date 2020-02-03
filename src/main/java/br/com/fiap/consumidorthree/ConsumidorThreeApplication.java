package br.com.fiap.consumidorthree;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ConsumidorThreeApplication {

	public static void main(String[] args) {
		actualRecords = 0;
		SpringApplication.run(ConsumidorThreeApplication.class, args);
	}
	
	public static int actualRecords;

}
