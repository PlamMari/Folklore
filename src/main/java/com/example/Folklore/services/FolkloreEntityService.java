package com.example.Folklore.services;

import com.example.Folklore.entities.FolkloreEntity;
import com.example.Folklore.repositories.FolkloreEntityRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import java.util.Optional;
import java.util.List;

@Service
public class FolkloreEntityService {
    private final FolkloreEntityRepository repository;
    @Autowired
    public FolkloreEntityService(FolkloreEntityRepository repository) {
        this.repository = repository;
    }
//    @GetMapping
    public List<FolkloreEntity> getAllFolkloreEntities() {
        return repository.findAll();
    }
    public Optional<FolkloreEntity> getFolkloreEntityById(Long id) {
        return repository.findById(id);
    }
    public FolkloreEntity createFolkloreEntity(FolkloreEntity folkloreEntity) {
        return repository.save(folkloreEntity);
    }
    public Optional<FolkloreEntity> updateFolkloreEntity(Long id, FolkloreEntity folkloreEntity) {
        if(repository.existsById(id)){
            folkloreEntity.setId(id);
            return Optional.of(repository.save(folkloreEntity));
        }
        return Optional.empty();
    }

    public boolean deleteFolkloreEntity(Long id) {
        if(repository.existsById(id)){
            repository.deleteById(id);
            return true;
        }
        return false;
    }



}
