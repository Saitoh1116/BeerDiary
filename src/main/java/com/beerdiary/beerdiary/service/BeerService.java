package com.beerdiary.beerdiary.service;

import com.beerdiary.beerdiary.entity.Beer;
import com.beerdiary.beerdiary.repository.BeerRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BeerService {

    private final BeerRepository beerRepository;

    public BeerService(BeerRepository beerRepository) {
        this.beerRepository = beerRepository;
    }

    public List<Beer> findAll() {
        return beerRepository.findAll();
    }

    public Beer findById(Long id) {
        return beerRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Beer not found"));
    }

    public Beer create(Beer beer) {
        return beerRepository.save(beer);
    }

    public Beer update(Long id, Beer updatedBeer) {
        Beer beer = findById(id);

        beer.setName(updatedBeer.getName());
        beer.setBrewery(updatedBeer.getBrewery());
        beer.setRating(updatedBeer.getRating());
        beer.setMemo(updatedBeer.getMemo());

        return beerRepository.save(beer);
    }

    public void delete(Long id) {
        beerRepository.deleteById(id);
    }
}
