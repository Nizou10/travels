package com.travels;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.travels.dao.UserRepository;

@SpringBootApplication
public class TravelsApplication {

    public static void main(final String[] args) {
        final ApplicationContext ctx = SpringApplication.run(TravelsApplication.class, args);
        final UserRepository clientRepository = ctx.getBean(UserRepository.class);

        // final User client = new User();
        // client.setEmail("mtiraoui.nizar@gmail.com");
        // client.setName("mtiraoui nizar");
        // clientRepository.save(client);
        //
        // final User client2 = new User();
        // client2.setEmail("mtiraoui_nizar@hotmail.fr");
        // client2.setName("mtiraoui nizar 2");
        // clientRepository.save(client2);
        //
        // final User client3 = new User();
        // client3.setEmail("mtiraoui_nizar@hotmail.fr");
        // client3.setName("mtiraoui nizar 2");
        // clientRepository.save(client3);
        //
        // final User client4 = new User();
        // client4.setEmail("mtiraoui_nizar@hotmail.fr");
        // client4.setName("mtiraoui nizar 2");
        // clientRepository.save(client4);
        //
        // final User client5 = new User();
        // client5.setEmail("mtiraoui_nizar@hotmail.fr");
        // client5.setName("mtiraoui nizar 5");
        // clientRepository.save(client2);
    }
}
