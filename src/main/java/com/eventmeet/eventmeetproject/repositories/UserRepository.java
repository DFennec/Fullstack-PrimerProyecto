package com.eventmeet.eventmeetproject.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.eventmeet.eventmeetproject.models.user;

@Repository
public interface UserRepository extends JpaRepository<user, Long>{

}
