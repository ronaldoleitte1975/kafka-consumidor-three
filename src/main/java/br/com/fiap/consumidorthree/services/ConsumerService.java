package br.com.fiap.consumidorthree.services;

import br.com.fiap.consumidorthree.domain.BolsaFamiliaModel;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;

@Service
public class ConsumerService {

  Map<String, SomaBolsaFamilia> valueMapByUF = new HashMap();

  public void consume(BolsaFamiliaModel model) {
    String uf = model.getUf();

    System.out.println("");
    System.out.println("<<========================================================================================>>");

    System.out.println("Qtde de registros consumidos: " + valueMapByUF.size());

    System.out.println("<<========================================================================================>>");
    System.out.println("");
  }

}
