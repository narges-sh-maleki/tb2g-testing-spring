package org.springframework.samples.petclinic.sfg;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
public class HearingInterpreter {


    private final WordProducer wordProducer;

    public HearingInterpreter(@Qualifier("Laurel") WordProducer wordProducer) {
        this.wordProducer = wordProducer;
    }

    public String whatIheard(){
        System.out.println(wordProducer.getWord());
        return wordProducer.getWord();

    }
}
