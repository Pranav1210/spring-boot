package org.springsource.restbucks.model;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.context.annotation.Bean;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Meetings {
    private int start = (int)(Math.random()*1000);
    private int end = (int)(Math.random()*1000);
    private String title = "";
    private String owner = "";
    private String[] participants;

    @Bean
    public Meetings getMeetins() {
        return new Meetings();
    }

}
