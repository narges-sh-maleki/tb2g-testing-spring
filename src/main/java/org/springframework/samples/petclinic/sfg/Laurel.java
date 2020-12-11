package org.springframework.samples.petclinic.sfg;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Component("Laurel")
//@Profile("laurel")
public class Laurel implements WordProducer {


    private final String word;

    public Laurel(@Value("${word.say}") String word) {
        this.word = word;
    }

    @Override
    public String getWord() {
        return word;
    }
}
