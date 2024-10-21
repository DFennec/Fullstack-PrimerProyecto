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
    }

    @Override
    public void deleteIncidence(Long id) {
        
    }

    @Override
    public List<Incidence> getAllIncidences(Long id) {
        return incidenceRepository.findAll();
    }
    @Override
    public List<Incidence> getIncidencesByUserName(String username) {
        List<Incidence> incidences = null;
        for (Incidence incidence : incidenceRepository.findAll()) {
            if (incidence.getUserCreated().getName() == username) {
                incidences.add(incidence);
            }
    }
    return incidences;
}
}