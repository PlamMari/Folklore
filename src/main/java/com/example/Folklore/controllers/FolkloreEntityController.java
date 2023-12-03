package com.example.Folklore.controllers;

import com.example.Folklore.model.FolkloreEntity;
import com.example.Folklore.services.FolkloreEntityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/folklore-entities")
public class FolkloreEntityController {
    private final FolkloreEntityService service;

    @Autowired
    public FolkloreEntityController(FolkloreEntityService service){
        this.service = service;
    }

    @GetMapping
    public List<FolkloreEntity> getAllFolkloreEntities() {
        return service.getAllFolkloreEntities();
    }
}
