package com.cesur.splinterio.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cesur.splinterio.models.Chat;
@Repository
public interface HistoricalRepository extends JpaRepository<Chat, Long>{

}