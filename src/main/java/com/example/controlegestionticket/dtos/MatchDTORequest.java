package com.example.controlegestionticket.dtos;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class MatchDTORequest {
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm")
    private Date date_heure;
    private String lieu;
    private String equipe1;
    private String equipe2;
    private String ticketsDispo;
}
