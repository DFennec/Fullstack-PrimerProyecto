package com.eventmeet.eventmeetproject.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.eventmeet.eventmeetproject.models.dtos.IncidenceDTO;
import com.eventmeet.eventmeetproject.services.IncidenceService;

import jakarta.websocket.server.PathParam;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;


@RestController
@RequestMapping("/api")
public class IncidenceController {

    @Autowired
    IncidenceService incidenceService;

    @PostMapping("incidence")
    public ResponseEntity<Integer> addIncidence(@RequestBody IncidenceDTO entity){
        incidenceService.storeIncidence(entity);
        return new ResponseEntity<Integer>(1, HttpStatus.ACCEPTED);
    }//falta control de errores
    @PostMapping("/incidence/:id")
    public ResponseEntity<Integer> addIncidenceDetail(@PathParam(value="id") IncidenceDTO entity) {
        try {
            incidenceService.storeIncidence(entity);
            return new ResponseEntity<Integer>(1, HttpStatus.ACCEPTED);
        } catch (Exception e) {
            return new ResponseEntity<Integer>(0, HttpStatus.BAD_REQUEST);
        }
    }
    
}
