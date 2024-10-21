package com.eventmeet.eventmeetproject.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.eventmeet.eventmeetproject.models.Comment;

@Repository
public interface CommentRepository extends JpaRepository<Comment, Long>{

}
