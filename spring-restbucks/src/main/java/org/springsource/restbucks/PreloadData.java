package org.springsource.restbucks;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class PreloadData implements CommandLineRunner {

    @Value("${ARTIFACTORY_API_KEY}")
    private String name;
    public void run(String... args) {
        System.out.println(name);
        System.out.println("Hello");
    }
}
