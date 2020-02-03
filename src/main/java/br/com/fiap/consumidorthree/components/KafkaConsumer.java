package br.com.fiap.consumidorthree.components;

import br.com.fiap.consumidorthree.domain.BolsaFamiliaModel;
import br.com.fiap.consumidorthree.services.ConsumerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Profile;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component(value = "kafkaConsumer")
@Profile(value = "default")
public class KafkaConsumer implements Consumer{

    @Autowired
    private ConsumerService service;

    @KafkaListener(topics = "${consumerthree.topic}", groupId = "${consumerthree.group-id}")
    public void consume(final BolsaFamiliaModel consumerRecord) {
            service.consume(consumerRecord);
    }
}