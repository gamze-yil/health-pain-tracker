package com.gamze.health_pain_tracker;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/pain-entries")
public class PainEntryController {

    private final PainEntryService painEntryService;

    public PainEntryController(PainEntryService painEntryService) {
        this.painEntryService = painEntryService;
    }

    @PostMapping
    public ResponseEntity<PainEntry> create(@RequestBody PainEntry painEntry) {
        PainEntry created = painEntryService.create(painEntry);
        return ResponseEntity.ok(created);
    }

    @GetMapping
    public List<PainEntry> getAll() {
        return painEntryService.getAll();
    }

    @GetMapping("/{id}")
    public PainEntry getById(@PathVariable Long id) {
        return painEntryService.getById(id);
    }

    @PutMapping("/{id}")
    public PainEntry update(@PathVariable Long id, @RequestBody PainEntry updated) {
        return painEntryService.update(id, updated);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id) {
        painEntryService.delete(id);
        return ResponseEntity.noContent().build();
    }
}
