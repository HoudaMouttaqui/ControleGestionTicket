package com.example.controlegestionticket.services.Ticket;

import com.example.controlegestionticket.dtos.TicketDTORequest;
import com.example.controlegestionticket.entities.Match;
import com.example.controlegestionticket.entities.Ticket;
import com.example.controlegestionticket.enums.Statut;
import com.example.controlegestionticket.repos.MatchRepo;
import com.example.controlegestionticket.repos.TicketRepo;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.UUID;
@Service
@Transactional
public class TicketServiceImpl implements  TicketService{
    MatchRepo matchRepo;
    TicketRepo ticketRepo;

    public TicketServiceImpl(MatchRepo matchRepo, TicketRepo ticketRepo){
        this.ticketRepo = ticketRepo;
        this.matchRepo = matchRepo;
    }
    @Override
    public Ticket achatTicket(TicketDTORequest ticketDTORequest) {
        Match m=matchRepo.findById(ticketDTORequest.getMatchId()).get();
        Ticket ticket=Ticket.builder()
                .ref_ticket(UUID.randomUUID().toString().substring(0,16))
                .prix(ticketDTORequest.getPrix())
                .statut(Statut.ACTIF)
                .match(m)
                .build();
        ticketRepo.save(ticket);
        return ticket;
    }

    @Override
    public void modificationTicket(Long ticketId) {
        Ticket ticket = ticketRepo.findById(ticketId).get();
        ticket.setStatut(Statut.INACTIF);

    }
}
