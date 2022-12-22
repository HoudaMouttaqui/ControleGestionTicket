package com.example.controlegestionticket.entities;

import com.example.controlegestionticket.enums.Statut;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Ticket {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(unique = true)
    private String ref_ticket;
    private Double prix;
    @Column(nullable = false) @Enumerated(EnumType.STRING)
    private Statut statut;
    @ManyToOne
    private Match match;
}
