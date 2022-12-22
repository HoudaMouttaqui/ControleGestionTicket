package com.example.controlegestionticket.services.Match;

import com.example.controlegestionticket.dtos.MatchDTORequest;
import com.example.controlegestionticket.entities.Match;

import java.util.List;

public interface MatchService {
    Match ajoutMatch(MatchDTORequest matchInputDto);
    List<Match> listMatch();
}
