package com.eventmeet.eventmeetproject.services.impl;

import java.time.LocalDateTime;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.eventmeet.eventmeetproject.models.Incidence;
import com.eventmeet.eventmeetproject.models.dtos.IncidenceDTO;
import com.eventmeet.eventmeetproject.repositories.IncidenceRepository;
import com.eventmeet.eventmeetproject.services.IncidenceService;
@Service
public class IncidenceServiceImpl implements IncidenceService {

    @Autowired
    IncidenceRepository incidenceRepository;
    @Override
    public void storeIncidence(IncidenceDTO datos) {
        Incidence incidence = new Incidence();
        incidence.setDescription(datos.getDescription());
        //incidence.setPriority(datos.getPriority());
        incidence.setCreatedAt(LocalDateTime.now());
        incidence.setPriority(datos.getPriority());
        incidence.setScope(datos.getScope());
        incidence.setUserCreated(null);
        incidenceRepository.save(incidence);

        Incidence response = incidenceRepository.save(incidence);
        throw new UnsupportedOperationException("Unimplemented method 'storeIncidence'");
    }

    @Override
    public void deleteIncidence(Long id) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'deleteIncidence'");
    }

    @Override
    public IncidenceDTO getIncidencesById(Long id) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getIncidencesById'");
    }

    @Override
    public List<IncidenceDTO> getIncidencesByUserName(String username) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getIncidencesByUserName'");
    }

}