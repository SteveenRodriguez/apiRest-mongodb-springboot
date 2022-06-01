package co.com.sofkau.apimongodb.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import co.com.sofkau.apimongodb.model.Persona;

@Repository
public interface PersonaRepository extends MongoRepository<Persona, String> {

}
