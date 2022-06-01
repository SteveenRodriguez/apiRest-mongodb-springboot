package co.com.sofkau.apimongodb.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import co.com.sofkau.apimongodb.model.Persona;
import co.com.sofkau.apimongodb.repository.PersonaRepository;
import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class PersonaService {

    @Autowired
    private PersonaRepository personaRepository;

    public String save(Persona persona) {
        personaRepository.save(persona);
        return "Persona guardada ";
    }

    public List<Persona> findAll() {
        return personaRepository.findAll();
    }

    public Optional<Persona> findById(String id) {
        return personaRepository.findById(id);
    }

    public String deleteById(String id) {
        personaRepository.deleteById(id);
        return "Persona eliminada con Id: " + id;
    }

}
