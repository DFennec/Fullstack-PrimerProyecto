package com.eventmeet.eventmeetproject.services;

import java.util.List;
import com.eventmeet.eventmeetproject.models.dtos.IncidenceDTO;

public interface IncidenceService {
    void storeIncidence(IncidenceDTO datos);//vale para guardar la incidencia o para actualizarla
    void deleteIncidence(Long id);
    List<IncidenceDTO> getIncidencesById(Long id);
    List<IncidenceDTO> getIncidencesByUserName(String username);
}
