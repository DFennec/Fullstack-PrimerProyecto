package com.eventmeet.eventmeetproject.models.dtos;
import com.eventmeet.eventmeetproject.models.utils.Priorities;
import com.eventmeet.eventmeetproject.models.utils.Scopes;

import lombok.AllArgsConstructor;
import lombok.Data;
@Data
@AllArgsConstructor//el dto no tendrá constructor vacío porque el DTO siempre debe estar lleno
//las peticiones del DTO vienen siempre de fuera con objetos Incidencia ya creados que, por ende deben estar ya completos
public class IncidenceDTO {
    private String description;
    private Priorities priority;
    private Scopes scope;
    private String userCreated;
}
