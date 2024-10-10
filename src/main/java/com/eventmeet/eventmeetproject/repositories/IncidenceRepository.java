package com.eventmeet.eventmeetproject.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.eventmeet.eventmeetproject.models.Incidence;

@Repository
public interface IncidenceRepository extends JpaRepository<Incidence, Long>{

}
