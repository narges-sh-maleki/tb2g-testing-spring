package org.springframework.samples.petclinic.sfg;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("org.springframework.samples.petclinic.sfg")
public class SpringTestConfiguration {

  /*  @Bean
    HearingInterpreter hearingInterpreter(){
        return new HearingInterpreter(new Yanny());
    }*/
}
