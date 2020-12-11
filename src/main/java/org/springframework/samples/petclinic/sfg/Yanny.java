package org.springframework.samples.petclinic.sfg;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Component("Yanny")
//@Profile("yanny")
public class Yanny implements WordProducer {
    @Override
    public String getWord() {
        return "Yanny";
    }
}
