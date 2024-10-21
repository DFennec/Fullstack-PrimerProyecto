package com.eventmeet.eventmeetproject.models;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.ForeignKey;
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
@Table(name = "AttachedFIle")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class AttachedFIle {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name="name")
    private String name;

    @Column(name="mimeType")
    private String mimeType;

    @Column(name="route")
    private String route;

    @ManyToOne
    @JoinColumn(name="incidence", foreignKey = @ForeignKey(name = "FK_Incidence"))
    private Incidence incidence;
}
