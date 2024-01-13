package com.example.Folklore.entities;
import jakarta.persistence.*;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@Builder
@NoArgsConstructor
public class FolkloreEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    private String title;
    private String originCountry;
    private String description;
    private String story;
    private String tags;

    public FolkloreEntity(Integer id, String title, String originCountry, String description, String story, String tags) {
        this.id = id;
        this.title = title;
        this.originCountry = originCountry;
        this.description = description;
        this.story = story;
        this.tags = tags;
    }
}
