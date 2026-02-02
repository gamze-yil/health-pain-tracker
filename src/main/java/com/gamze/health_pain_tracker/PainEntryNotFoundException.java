package com.gamze.health_pain_tracker;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.NOT_FOUND)
public class PainEntryNotFoundException extends RuntimeException {

    public PainEntryNotFoundException(Long id) {
        super("Pain entry is not found with id " + id);
    }
}
