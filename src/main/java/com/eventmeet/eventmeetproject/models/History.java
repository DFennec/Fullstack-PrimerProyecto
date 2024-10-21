package com.eventmeet.eventmeetproject.models;

import java.time.LocalDateTime;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.ForeignKey;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "History")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class History {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name="autor")
    private user autor;

    @Column(name="createdAt")
    private LocalDateTime createdAt;
    
    @Column(name="endAt")
    private LocalDateTime endAt;


    @OneToMany
    @JoinColumn(name="incidence", foreignKey = @ForeignKey(name = "FK_Incidence"))
    private Incidence incidence;
}
