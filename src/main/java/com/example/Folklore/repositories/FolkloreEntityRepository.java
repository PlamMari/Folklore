package com.example.Folklore.repositories;

import com.example.Folklore.model.FolkloreEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface FolkloreEntityRepository extends JpaRepository<FolkloreEntity, Long> {

    FolkloreEntity save(FolkloreEntity entity);

    void delete(FolkloreEntity entity);

    void deleteById(Long aLong);

    List<FolkloreEntity> findAll();

}
