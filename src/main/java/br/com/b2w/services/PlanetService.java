package br.com.b2w.services;

import br.com.b2w.document.Planet;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface PlanetService {
	Flux<Planet> findAll();
	Mono<Planet> findById(String id);
	Mono<Planet> save(Planet planet);
	Mono<Planet> delete(String id);
	Mono<Planet> update(String id, Planet planet);
	Mono<Planet> findOne(Planet planet);
}
