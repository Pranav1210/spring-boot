package org.springsource.restbucks;

import org.springframework.boot.Banner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.hateoas.UriTemplate;
import org.springframework.hateoas.hal.CurieProvider;
import org.springframework.hateoas.hal.DefaultCurieProvider;
import org.springframework.scheduling.annotation.EnableAsync;

@SpringBootApplication
@EnableAsync
public class Restbucks {
    public static String CURIE_NAMESPACE = "restbucks";
    public @Bean CurieProvider curieProvider() {
        return new DefaultCurieProvider(CURIE_NAMESPACE, new UriTemplate("/docs/{rel}.html"));
    }
    public static void main(String[] args) {
        SpringApplication app = new SpringApplication(Restbucks.class);
        app.setBannerMode(Banner.Mode.CONSOLE);
        app.setHeadless(false);
        app.setAdditionalProfiles("dev");
        app.run(args);
    }
}
