package com.techhipsters;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.modulith.core.ApplicationModules;

@SpringBootTest
public class SpringApplicationTest {

    @Test
    void onShouldCompile(){
        ApplicationModules  applicationModules = ApplicationModules.of(SpringApplication.class);
        applicationModules.verify();
    }

}
