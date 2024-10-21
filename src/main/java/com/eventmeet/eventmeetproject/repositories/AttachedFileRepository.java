package com.eventmeet.eventmeetproject.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.eventmeet.eventmeetproject.models.AttachedFIle;

@Repository
public interface AttachedFileRepository extends JpaRepository<AttachedFIle, Long>{

}
