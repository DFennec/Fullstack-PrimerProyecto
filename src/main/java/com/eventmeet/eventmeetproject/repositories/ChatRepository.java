package com.eventmeet.eventmeetproject.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.eventmeet.eventmeetproject.models.Chat;

@Repository
public interface ChatRepository extends JpaRepository<Chat, Long>{

}
