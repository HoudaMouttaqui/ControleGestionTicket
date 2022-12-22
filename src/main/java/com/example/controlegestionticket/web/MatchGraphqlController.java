package com.example.controlegestionticket.web;

import com.example.controlegestionticket.dtos.MatchDTORequest;
import com.example.controlegestionticket.entities.Match;
import com.example.controlegestionticket.services.Match.MatchService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.MutationMapping;
import org.springframework.stereotype.Controller;

import java.util.List;

@Controller
public class MatchGraphqlController {
    @Autowired
    private MatchService matchService;
    @MutationMapping
    private Match ajoutMatch(@Argument MatchDTORequest matchDTORequest){
        return matchService.ajoutMatch(matchDTORequest);
    }

    private List<Match> listMatch(){
        return matchService.listMatch();
    }
}
