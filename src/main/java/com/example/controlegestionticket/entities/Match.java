package com.example.controlegestionticket.entities;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Entity
@Data @AllArgsConstructor @NoArgsConstructor @Builder
public class Match {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(length = 16,nullable = false,unique = true)
    private String refMatch;
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm")
    private Date date_heure;
    private String lieu;
    private String equipe1;
    private String equipe2;
    @OneToMany(mappedBy = "match")
    private List<Ticket> tickets;

}
