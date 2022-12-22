package com.example.controlegestionticket.web;

import com.example.controlegestionticket.dtos.TicketDTORequest;
import com.example.controlegestionticket.entities.Ticket;
import com.example.controlegestionticket.services.Ticket.TicketService;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.MutationMapping;
import org.springframework.stereotype.Controller;

@Controller
@AllArgsConstructor
public class TicketGraphqlController {
    @Autowired
    private TicketService ticketService;

    @MutationMapping
    private Ticket achatTicket(@Argument TicketDTORequest ticketDTORequest){
        return ticketService.achatTicket(ticketDTORequest);
    }

    @MutationMapping
    private void modificationTicket(@Argument Long id){
        ticketService.modificationTicket(id);
    }

}
