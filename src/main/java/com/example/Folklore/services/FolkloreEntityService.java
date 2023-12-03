package com.example.Folklore.services;

import com.example.Folklore.model.FolkloreEntity;
import com.example.Folklore.repositories.FolkloreEntityRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FolkloreEntityService {
    private final FolkloreEntityRepository repository;

    @Autowired
    public FolkloreEntityService(FolkloreEntityRepository repository) {
        this.repository = repository;
    }

    public List<FolkloreEntity> getAllFolkloreEntities() {
        return repository.findAll();
    }

}
