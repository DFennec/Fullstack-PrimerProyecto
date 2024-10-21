package com.eventmeet.eventmeetproject.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.eventmeet.eventmeetproject.models.History;

@Repository
public interface HistoryRepository extends JpaRepository<History, Long>{

}
