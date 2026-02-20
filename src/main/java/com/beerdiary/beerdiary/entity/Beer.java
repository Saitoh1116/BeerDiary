package com.beerdiary.beerdiary.entity;

import jakarta.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "beers")
public class Beer {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    private String brewery;

    private Integer rating;

    private String memo;

    private LocalDateTime createdAt;

    public Beer() {}

    @PrePersist
    public void prePersist() {
        this.createdAt = LocalDateTime.now();
    }

    // --- getter & setter ---

    public Long getId() { return id; }
    public String getName() { return name; }
    public String getBrewery() { return brewery; }
    public Integer getRating() { return rating; }
    public String getMemo() { return memo; }
    public LocalDateTime getCreatedAt() { return createdAt; }

    public void setName(String name) { this.name = name; }
    public void setBrewery(String brewery) { this.brewery = brewery; }
    public void setRating(Integer rating) { this.rating = rating; }
    public void setMemo(String memo) { this.memo = memo; }
}
