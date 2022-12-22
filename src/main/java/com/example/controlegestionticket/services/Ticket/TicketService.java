package com.example.controlegestionticket.services.Ticket;

import com.example.controlegestionticket.dtos.TicketDTORequest;
import com.example.controlegestionticket.entities.Ticket;

public interface TicketService {
    Ticket achatTicket(TicketDTORequest ticketDTORequest);

    void modificationTicket(Long ticketId);
}
