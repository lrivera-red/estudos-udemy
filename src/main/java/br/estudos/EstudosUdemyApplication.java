package br.estudos;


import br.estudos.configuration.GeneralConfiguration;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class EstudosUdemyApplication {

    @Autowired
    GeneralConfiguration generalConfiguration;


    @GetMapping("/hello")
    public String helloWorld() {
        return "Hello world, current year is: " +generalConfiguration.currentYearConfig();
    }

    public static void main(String[] args) {
        SpringApplication.run(EstudosUdemyApplication.class, args);

    }
}