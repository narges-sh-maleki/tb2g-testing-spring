package org.springframework.samples.petclinic.service;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.jmx.export.annotation.ManagedOperation;
import org.springframework.samples.petclinic.model.PetType;
import org.springframework.samples.petclinic.repository.OwnerRepository;
import org.springframework.samples.petclinic.repository.PetRepository;
import org.springframework.samples.petclinic.repository.VetRepository;
import org.springframework.samples.petclinic.repository.VisitRepository;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
class ClinicServiceImplTest {

    @InjectMocks
    ClinicServiceImpl clinicServiceImpl;

    @Mock
    private PetRepository petRepository;
    @Mock
    private VetRepository vetRepository;
    @Mock
    private OwnerRepository ownerRepository;
    @Mock
    private VisitRepository visitRepository;


    @Test
    void findPetTypes() {
        //given
        List<PetType> petTypeList = new ArrayList<>();
        petTypeList.add(new PetType());
        petTypeList.add(new PetType());
        when(petRepository.findPetTypes()).thenReturn(petTypeList);


        //when
        Collection<PetType> petTypes = clinicServiceImpl.findPetTypes();

        //then
        assertThat(petTypes).isNotNull();
        assertThat(petTypes).hasSize(2);
    }
}