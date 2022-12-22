package com.example.controlegestionticket.repos;

import com.example.controlegestionticket.entities.Match;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MatchRepo extends JpaRepository<Match,Long> {
}
