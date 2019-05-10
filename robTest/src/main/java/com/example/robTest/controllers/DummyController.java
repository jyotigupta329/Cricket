package com.example.robTest.controllers;

import com.example.robTest.entity.Score;
import com.example.robTest.repository.ScoreRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class DummyController {
    @Autowired
    ScoreRepository repo;

    @GetMapping("/")
    public List<Score> helloWorld(){
        return repo.findAll();
    }

    @PostMapping("/")
    public void postScore(@RequestBody Score score){
        repo.save(score);
    }

}
