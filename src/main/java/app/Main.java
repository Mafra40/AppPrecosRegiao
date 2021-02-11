package app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
//deve ser criada dentro de um pacote.
public class Main {

    public static void main(String[] args) {

        //método que inicializa a aplicação
        SpringApplication.run(Main.class, args);
        }

    }
