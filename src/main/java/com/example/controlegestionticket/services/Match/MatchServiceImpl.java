package com.example.controlegestionticket.services.Match;

import com.example.controlegestionticket.dtos.MatchDTORequest;
import com.example.controlegestionticket.entities.Match;
import com.example.controlegestionticket.repos.MatchRepo;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.Date;
import java.util.List;
import java.util.UUID;

@Service
@Transactional
public class MatchServiceImpl implements  MatchService{
    MatchRepo matchRepo;
    public MatchServiceImpl(MatchRepo matchRepo){
        this.matchRepo = matchRepo;
    }

    @Override
    public Match ajoutMatch(MatchDTORequest matchDTORequest) {
        Match match = Match.builder()
                .date_heure(new Date())
                .refMatch(UUID.randomUUID().toString())
                .lieu(matchDTORequest.getLieu())
                .equipe1(matchDTORequest.getEquipe1())
                .equipe2(matchDTORequest.getEquipe2())
                .build();
        matchRepo.save(match);
        return match;
    }

    @Override
    public List<Match> listMatch() {
        return matchRepo.findAll();
    }
}
