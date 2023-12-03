package com.example.Folklore.model;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
@Entity
public class FolkloreEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String title;
    private String originCountry;
    private String description;
    private String story;
    private String tags;

    public FolkloreEntity(Long id, String title, String originCountry, String description, String story, String tags) {
        this.id = id;
        this.title = title;
        this.originCountry = originCountry;
        this.description = description;
        this.story = story;
        this.tags = tags;
    }

}
