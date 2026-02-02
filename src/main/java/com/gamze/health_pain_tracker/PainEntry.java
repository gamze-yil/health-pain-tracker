package com.gamze.health_pain_tracker;

import jakarta.persistence.*;
import java.time.LocalDate;
import java.time.LocalDateTime;

@Entity
public class PainEntry {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private int painLevel;          // Pain level between the 0-10
    private String bodyLocation;
    private String description;
    private LocalDate entryDate;    // Date of the pain entry by the user

    private LocalDateTime createdAt;

    public PainEntry() {

    }

    @PrePersist
    public void onCreate() {
        if (entryDate == null) {
            entryDate = LocalDate.now();
        }
        createdAt = LocalDateTime.now();
    }

    //Getters and Setters

    public Long getId() {
        return id;
    }

    public int getPainLevel() {
        return painLevel;
    }

    public void setPainLevel(int painLevel) {
        this.painLevel = painLevel;
    }

    public String getBodyLocation() {
        return bodyLocation;
    }

    public void setBodyLocation(String bodyLocation) {
        this.bodyLocation = bodyLocation;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public LocalDate getEntryDate() {
        return entryDate;
    }

    public void setEntryDate(LocalDate entryDate) {
        this.entryDate = entryDate;
    }

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(LocalDateTime createdAt) {
        this.createdAt = createdAt;
    }
}
