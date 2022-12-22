package com.example.controlegestionticket.repos;

import com.example.controlegestionticket.entities.Ticket;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TicketRepo extends JpaRepository<Ticket,Long> {
}
