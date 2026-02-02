package com.gamze.health_pain_tracker;

import org.springframework.data.jpa.repository.JpaRepository;

public interface PainEntryRepository extends JpaRepository<PainEntry, Long> {

}
