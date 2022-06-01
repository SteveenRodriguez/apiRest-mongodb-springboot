package co.com.sofkau.apimongodb.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import co.com.sofkau.apimongodb.model.Persona;
import co.com.sofkau.apimongodb.service.PersonaService;
import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/api/mongodb")
@RequiredArgsConstructor
public class PersonaController {

    @Autowired
    private PersonaService personaService;

    @PostMapping("/persona")
    public Persona save(@RequestBody Persona persona) {
        personaService.save(persona);
        return persona;
    }

    @GetMapping("/personas")
    public List<Persona> findAll() {
        return personaService.findAll();
    }

    @GetMapping("/persona/{id}")
    public Optional<Persona> findById(@PathVariable String id) {
        return personaService.findById(id);
    }

    @DeleteMapping("/persona/{id}")
    public String deleteById(@PathVariable String id) {
        personaService.deleteById(id);
        return "Persona eliminada con Id: " + id;
    }

    @PutMapping("/persona")
    public void update(Persona persona) {
        personaService.save(persona);
    }
}
