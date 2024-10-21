package com.eventmeet.eventmeetproject.models;

import java.time.LocalDateTime;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.ForeignKey;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "chat")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Chat {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name="message")
    private String message;

    @Column(name="createdAt")
    private LocalDateTime createdAt;


    @OneToOne
    @JoinColumn(name="autor", foreignKey = @ForeignKey(name = "FK_Autor"))
    private user autor;


    @ManyToOne
    @JoinColumn(name="incidence", foreignKey = @ForeignKey(name = "FK_Incidence"))
    private Incidence incidence;
}
