package br.com.b2w.repository;

import org.springframework.data.mongodb.repository.ReactiveMongoRepository;

import br.com.b2w.document.Planet;

public interface PlanetRepository extends ReactiveMongoRepository<Planet, String> {
	
}
