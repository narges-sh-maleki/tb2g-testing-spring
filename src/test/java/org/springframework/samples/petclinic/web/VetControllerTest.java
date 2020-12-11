package org.springframework.samples.petclinic.web;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.samples.petclinic.model.Vet;
import org.springframework.samples.petclinic.model.Vets;
import org.springframework.samples.petclinic.service.ClinicService;

import java.util.*;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;
import static  org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
class VetControllerTest {

    @Mock
    ClinicService clinicService;

    @InjectMocks
    VetController vetController;

    @Test
    void showVetList_Mock() {
        //given
        Map<String,Object> model = new HashMap<>();
        List<Vet> vetList = new ArrayList<>();
        vetList.add(new Vet());
        vetList.add(new Vet());
        when(clinicService.findVets()).thenReturn(vetList);

        //when
        String result = vetController.showVetList(model);

        //then
        assertThat(result).isEqualToIgnoringCase("vets/vetList");
        assertThat(model.size()).isEqualTo(1);
        Vets vets = (Vets) model.get("vets");
        assertThat( vets.getVetList().size()).isEqualTo(2);

    }



    @Test
    void showResourcesVetList() {
        //given
        List<Vet> vetList = new ArrayList<>();
        vetList.add(new Vet());
        vetList.add(new Vet());
        when(clinicService.findVets()).thenReturn(vetList);

        //when
        Vets vets = vetController.showResourcesVetList();

        //then
        assertThat(vets.getVetList()).isNotNull();
        assertThat(vets.getVetList().size()).isEqualTo(2);

    }
}