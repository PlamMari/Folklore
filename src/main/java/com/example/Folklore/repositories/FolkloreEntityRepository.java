package com.example.Folklore.repositories;

import com.example.Folklore.entities.FolkloreEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface FolkloreEntityRepository extends JpaRepository<FolkloreEntity, Integer> {

    Optional<FolkloreEntity> findByOriginCountry(String country);

/*
    FolkloreEntity save(FolkloreEntity entity);

    void delete(FolkloreEntity entity);

    void deleteById(Integer anInt);

    List<FolkloreEntity> findAll();
*/

}
