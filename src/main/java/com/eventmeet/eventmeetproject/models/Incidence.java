package com.eventmeet.eventmeetproject.models;

import java.time.LocalDateTime;

import com.eventmeet.eventmeetproject.models.utils.Priorities;
import com.eventmeet.eventmeetproject.models.utils.Scopes;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "incidence")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Incidence {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name="description")
    private String description;

    @Column(name="priorities")
    @Enumerated(EnumType.STRING)
    private Priorities priority;//PriorityClass

    @Column(name="scopes")
    @Enumerated(EnumType.STRING)
    private Scopes scope;
    @Column(name="createdAt", nullable = true)
    private LocalDateTime createdAt;

    @Column(name="updatedAt", nullable = true)
    private LocalDateTime updatedAt;

    @Column(name="deletedAt", nullable = true)
    private LocalDateTime deletedAt;

    @ManyToOne//porque un usuario puede tener múltiples incidencias por lo tanto: many incidencias to one usuario
    @JoinColumn(name="user_id")
    private user userCreated;

}
