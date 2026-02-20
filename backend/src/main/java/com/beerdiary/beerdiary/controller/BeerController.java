package com.beerdiary.beerdiary.controller;

import com.beerdiary.beerdiary.entity.Beer;
import com.beerdiary.beerdiary.service.BeerService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/beers")
public class BeerController {

    private final BeerService beerService;

    public BeerController(BeerService beerService) {
        this.beerService = beerService;
    }

    @GetMapping
    public List<Beer> getAll() {
        return beerService.findAll();
    }

    @GetMapping("/{id}")
    public Beer getById(@PathVariable Long id) {
        return beerService.findById(id);
    }

    @PostMapping
    public Beer create(@RequestBody Beer beer) {
        return beerService.create(beer);
    }

    @PutMapping("/{id}")
    public Beer update(@PathVariable Long id, @RequestBody Beer beer) {
        return beerService.update(id, beer);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        beerService.delete(id);
    }
}
