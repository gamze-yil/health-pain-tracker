package com.gamze.health_pain_tracker;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PainEntryService {

    private final PainEntryRepository painEntryRepository;

    public PainEntryService(PainEntryRepository painEntryRepository) {
        this.painEntryRepository = painEntryRepository;
    }

    public PainEntry create(PainEntry painEntry) {
        return painEntryRepository.save(painEntry);
    }

    public List<PainEntry> getAll() {
        return painEntryRepository.findAll();
    }

    public PainEntry getById(Long id) {
        return painEntryRepository.findById(id)
                .orElseThrow(() -> new PainEntryNotFoundException(id));
    }


    public PainEntry update(Long id, PainEntry updated) {
        PainEntry existing = getById(id); // Throws if not found

        existing.setPainLevel(updated.getPainLevel());
        existing.setBodyLocation(updated.getBodyLocation());
        existing.setDescription(updated.getDescription());
        existing.setEntryDate(updated.getEntryDate());

        return painEntryRepository.save(existing);
    }

    public void delete(Long id) {
        painEntryRepository.deleteById(id);
    }
}
