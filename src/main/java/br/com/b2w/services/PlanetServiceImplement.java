package br.com.b2w.services;

import java.util.Objects;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.stereotype.Service;

import br.com.b2w.document.Planet;
import br.com.b2w.repository.PlanetRepository;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
public class PlanetServiceImplement implements PlanetService {

	@Autowired
	PlanetRepository planetRepository;

	@Override
	public Flux<Planet> findAll() {
		return planetRepository.findAll();
	}

	@Override
	public Mono<Planet> findById(String id) {
		return planetRepository.findById(id);
	}

	@Override
	public Mono<Planet> save(Planet planet) {
		return planetRepository.save(planet);
	}

	public Mono<Planet> delete(final String id) {
		final Mono<Planet> dbPlanet = findById(id);
		if (Objects.isNull(dbPlanet)) {
			return Mono.empty();
		}
		return findById(id).switchIfEmpty(Mono.empty()).filter(Objects::nonNull)
				.flatMap(planetToBeDeleted -> planetRepository.delete(planetToBeDeleted)
						.then(Mono.just(planetToBeDeleted)));
	}

	@Override
	public Mono<Planet> update(String id, Planet planet) {
		return planetRepository.save(planet);
	}

	@Override
	public Mono<Planet> findOne(Planet planet) {
		return planetRepository.findOne(Example.of(planet));
	}
	
}
