package com.eventmeet.eventmeetproject.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.Table;
import java.time.LocalDateTime;

import org.hibernate.annotations.ManyToAny;

@Entity
@Table(name = "incidence")
public class Incidence {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column
    private String category;//CategoryClass

    @Column
    private String description;

    @Column
    private String priority;//PriorityClass

    @Column(nullable = true)
    private LocalDateTime createdAt;

    @Column(nullable = true)
    private LocalDateTime updatedAt;

    @Column(nullable = true)
    private LocalDateTime deletedAt;

    @ManyToAny//porque un usuario puede tener múltiples incidencias por lo tanto: many incidencias to one usuario
    @JoinColumn(name="user_id")
    private user usuario;
    public Incidence(){}    
    public Incidence(Long id,
    String category,
    String description,
    String priority,
    LocalDateTime createdAt,
    LocalDateTime updatedAt,
    LocalDateTime deletedAt,
    user usuario){
        //The constructor's name must be the same as the class name, with the same capital letter.
        this.id=id;
        this.category=category;
        this.description=description;
        this.priority=priority;
        this.createdAt=createdAt;
        this.updatedAt=updatedAt;
        this.deletedAt=deletedAt;
        this.usuario=usuario;
    }
    public String getCategory() {
        return category;
    }
    public String getDescription() {
        return description;
    }
    public String getPriority() {
        return priority;
    }
    public Long getId() {
        return id;
    }
    public void setCategory(String category) {
        this.category = category;
    }
    public void setDescription(String description) {
        this.description = description;
    }
    public void setPriority(String priority) {
        this.priority = priority;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public void getCreatedAt(LocalDateTime createdAt) {
        this.createdAt = createdAt;
    }
    public void setCreatedAt(LocalDateTime createdAt) {
        this.createdAt = createdAt;
    }
    public void setUserCreated(user userCreated) {
        this.usuario = userCreated;
    }
}
