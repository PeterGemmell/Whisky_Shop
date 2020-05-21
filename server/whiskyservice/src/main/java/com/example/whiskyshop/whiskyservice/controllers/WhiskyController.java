package com.example.whiskyshop.whiskyservice.controllers;

import com.example.whiskyshop.whiskyservice.models.Whisky;
import com.example.whiskyshop.whiskyservice.repositories.WhiskyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class WhiskyController {

    @Autowired
    WhiskyRepository whiskyRepository;

    @GetMapping(value = "/whiskies")
    public ResponseEntity<List<Whisky>> getAllWhisky(){
        return new ResponseEntity<>(whiskyRepository.findAll(), HttpStatus.OK);
    }

    @GetMapping(value = "/whiskies/{id}")
    public ResponseEntity getWhisky(@PathVariable Long id){
        return new ResponseEntity<>(whiskyRepository.findById(id), HttpStatus.OK);
    }

    @PostMapping(value = "/whiskies")
    public ResponseEntity<Whisky> postWhisky(@RequestBody Whisky whisky){
        whiskyRepository.save(whisky);
        return new ResponseEntity<>(whisky, HttpStatus.CREATED);
    }

    @PatchMapping(value = "/whiskies/{id}")
    public ResponseEntity<Whisky> updateWhisky(@RequestBody Whisky whisky){
        whiskyRepository.save(whisky);
        return new ResponseEntity<>(whisky, HttpStatus.OK);
    }

    @DeleteMapping(value = "/whiskies/{id}")
    public ResponseEntity<Whisky> deleteWhisky(@PathVariable Long id){
        Whisky found = whiskyRepository.getOne(id);
        whiskyRepository.delete(found);
        return new ResponseEntity<>(null, HttpStatus.OK);
    }
}
