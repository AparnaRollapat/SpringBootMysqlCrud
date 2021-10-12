package com.denizturkmen.crudexample.Controller;

import com.denizturkmen.crudexample.Exception.ResourceNotFoundException;
import com.denizturkmen.crudexample.Model.Person;
import com.denizturkmen.crudexample.Repository.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class PersonController {

    @Autowired
    private PersonRepository personRepository;

    @GetMapping(value = "/personlist")
    public List<Person> getAllPerson(){
        return personRepository.findAll();
    }
    @PostMapping(value = "/createPerson")
    public Person createPerson(@Validated @RequestBody Person person){
        return personRepository.save(person);
    }

    @GetMapping("/person/{id}")
    public Person getPersonById(@PathVariable(value = "id") Long personId){
        return personRepository.findById(personId)
                .orElseThrow(()-> new ResourceNotFoundException("Person","id",personId));
    }

    @PutMapping("/person/{id}")
    public Person updateNote(@PathVariable(value = "id") Long personId,
                           @Validated @RequestBody Person personDetails) {

        Person person = personRepository.findById(personId)
                .orElseThrow(() -> new ResourceNotFoundException("Note", "id", personId));

        person.setAd(personDetails.getAd());
        person.setSoyad(personDetails.getSoyad());

        Person updatedPerson = personRepository.save(person);
        return updatedPerson;
    }


    @DeleteMapping("/person/{id}")
    public ResponseEntity<?> deleteNote(@PathVariable(value = "id") Long personId) {
        Person note = personRepository.findById(personId)
                .orElseThrow(() -> new ResourceNotFoundException("Person", "id", personId));

        personRepository.delete(note);

        return ResponseEntity.ok().build();
    }

}
