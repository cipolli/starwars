//package br.com.b2w;
//
//import java.util.UUID;
//
//import org.springframework.boot.CommandLineRunner;
//import org.springframework.stereotype.Component;
//
//import br.com.b2w.document.Planet;
//import br.com.b2w.repository.PlanetRepository;
//import reactor.core.publisher.Flux;
//
//@Component
//public class DummyData implements CommandLineRunner {
//
//	private final PlanetRepository planetRepository;
//
//	DummyData(PlanetRepository planetRepository) {
//		this.plnetRepository = planetRepository;
//	}
//
//	@Override
//	public void run(String... args) throws Exception {
//
//		planetRepository.deleteAll().thenMany(Flux
//				.just("")
//				.map(nome -> new Planet(UUID.randomUUID().toString(), name))
//				.flatMap(planetRepository::save))
//				.subscribe(System.out::println);
//	}
//}
