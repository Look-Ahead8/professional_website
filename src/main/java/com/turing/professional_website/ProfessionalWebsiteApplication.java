package com.turing.professional_website;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication
@EnableSwagger2
public class ProfessionalWebsiteApplication {

    public static void main(String[] args) {
        SpringApplication.run(ProfessionalWebsiteApplication.class, args);
    }

}
