package com.eventmeet.eventmeetproject.services;

import java.util.List;
import com.eventmeet.eventmeetproject.models.dtos.IncidenceDTO;

public interface IncidenceService {
    void storeIncidence(IncidenceDTO datos);//vale para guardar la incidencia o para actualizarla
    void deleteIncidence(Long id);
    IncidenceDTO getIncidencesById(Long id);
    List<IncidenceDTO> getIncidencesByUserName(String username);//en principio esto ya no funciona porque
    //hemos quitado el username de la incidencia
}
