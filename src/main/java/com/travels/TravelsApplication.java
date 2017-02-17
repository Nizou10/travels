package com.travels;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.travels.dao.ClientRepository;
import com.travels.entities.Client;

@SpringBootApplication
public class TravelsApplication {

    public static void main(final String[] args) {
        final ApplicationContext ctx = SpringApplication.run(TravelsApplication.class, args);
        final ClientRepository clientRepository = ctx.getBean(ClientRepository.class);

        final Client client = new Client();
        client.setEmail("mtiraoui.nizar@gmail.com");
        client.setName("mtiraoui nizar");
        clientRepository.save(client);

        final Client client2 = new Client();
        client2.setEmail("mtiraoui_nizar@hotmail.fr");
        client2.setName("mtiraoui nizar 2");
        clientRepository.save(client2);
    }
}
