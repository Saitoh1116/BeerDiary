package com.beerdiary.beerdiary.repository;

import com.beerdiary.beerdiary.entity.Beer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BeerRepository extends JpaRepository<Beer, Long> {
}
