package com.example.Folklore.repositories;

import com.example.Folklore.model.FolkloreEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IFolkloreEntityRepository extends JpaRepository<FolkloreEntity, Long>{

}
