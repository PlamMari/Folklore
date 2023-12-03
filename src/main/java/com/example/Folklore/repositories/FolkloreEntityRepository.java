package com.example.Folklore.repositories;

import com.example.Folklore.model.FolkloreEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public class FolkloreEntityRepository implements IFolkloreEntityRepository {

    @Override
    public void flush() {
//        System.out.println("flushed");
    }
}
