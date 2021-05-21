package br.com.b2w.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import br.com.b2w.document.Planet;
import br.com.b2w.services.PlanetService;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
public class PlanetController {
	@Autowired
	PlanetService planetService;

	@GetMapping("/planets")
	public Flux<Planet> getAllPlanets() {
		return planetService.findAll();
	}
	
	@GetMapping("/planet/{id}")
	public Mono<Planet>getPlanetById(@PathVariable String id){
		return planetService.findById(id);
	}
	
	@GetMapping("/planet/name")
	public Mono<Planet>getPlanetByName(@RequestBody Planet planet){
		return planetService.findOne(planet);
	}
	
	@PostMapping("/planet") 
	public Mono<Planet> saveMono(@RequestBody Planet planet){
		return planetService.save(planet);
	}
	
	@PutMapping("/planet/{id}")
	public Mono<Planet> updateById(@PathVariable("id") final String id, @RequestBody final Planet planet) {
	System.out.println("::Update the Planet record::");
	return planetService.update(id, planet);
	}
	
	@DeleteMapping("/planet/{id}")
	public Mono<Planet> delete(@PathVariable final String id) {
	System.out.println("::Will delete a Planet::");
	return planetService.delete(id);
	}
	
}
