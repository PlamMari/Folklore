package com.example.Folklore.controllers;

import com.example.Folklore.entities.FolkloreEntity;
import com.example.Folklore.services.FolkloreEntityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/folklore-entities")
public class FolkloreEntityController {
    private final FolkloreEntityService service;
    @Autowired
    public FolkloreEntityController(FolkloreEntityService service){
        this.service = service;
    }

    @GetMapping
    public ResponseEntity<List<FolkloreEntity>> getAllFolkloreEntities() {

        return ResponseEntity.ok(service.getAllFolkloreEntities());
    }

    @GetMapping("/{id}")
    public ResponseEntity<?> getFolkloreEntityById(@PathVariable Integer id) {
        Optional<FolkloreEntity> folkloreEntityOptional = service.getFolkloreEntityById(id);
        if (folkloreEntityOptional.isEmpty()){
            return ResponseEntity.status(404).body("Folklore not found with id " +id);
        }
        return ResponseEntity.ok(folkloreEntityOptional.get());
    }

    @PostMapping("/save")
    public ResponseEntity<FolkloreEntity> createFolkloreEntity(@RequestBody FolkloreEntity folkloreEntity){
        return ResponseEntity.status(201).body(service.createFolkloreEntity(folkloreEntity));
    }

    @PutMapping("/{id}")
    public ResponseEntity<FolkloreEntity> updateFolkloreEntityById(@PathVariable Integer id, @RequestBody FolkloreEntity folkloreEntity) {
        Optional<FolkloreEntity> updatedFolkloreEntity = service.updateFolkloreEntity(id, folkloreEntity);
        return updatedFolkloreEntity.map(entity -> ResponseEntity.ok(entity)).orElseGet(() -> ResponseEntity.status(404).build());
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<String> deleteFolkloreEntityById(@PathVariable Integer id) {
        // Assuming your service has a method to delete by ID
        boolean deleted = service.deleteFolkloreEntity(id);

        if (deleted) {
            return ResponseEntity.ok("Folklore entity with ID " + id + " deleted successfully.");
        } else {
            return ResponseEntity.status(404).body("Folklore entity not found with ID " + id);
        }
    }
}
