package br.com.fiap.consumidorthree.services;

import org.springframework.stereotype.Service;

import br.com.fiap.consumidorthree.ConsumidorThreeApplication;
import br.com.fiap.consumidorthree.domain.BolsaFamiliaModel;

@Service
public class ConsumerService {

	public void consume(BolsaFamiliaModel model) {

		try {

			ConsumidorThreeApplication.actualRecords = ConsumidorThreeApplication.actualRecords + 1;

			System.out.println("");
			System.out.println(
					"<<===================================Consumer 3============================================>>");

			System.out.println("	Qtde ATUAL de registros consumidos no topico: " + ConsumidorThreeApplication.actualRecords);

			System.out.println(
					"<<========================================================================================>>");
			System.out.println("");

		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("Erro ao consumir mensagem no topico!");
		}

	}

}
