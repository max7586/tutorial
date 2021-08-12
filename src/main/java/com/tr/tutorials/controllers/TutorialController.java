package com.tr.tutorials.controllers;


import com.tr.tutorials.model.Tutorial;
import com.tr.tutorials.service.ProjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class TutorialController {

    @Autowired
    ProjectService projectService;

    @GetMapping("/getTutorials")
    public List<Tutorial> getTutorials() {
        List<Tutorial> tutorialList = this.projectService.getAll();
        return tutorialList;
    }



    @GetMapping("/getTutorial/{id}")
    public String getTutorial(@PathVariable String id) {
        System.out.println("id: " + id);
        return "return single tutorial";
    }

    @GetMapping("/getTutorialName/{nm}")
    public List<Tutorial> getTutorialByName(@PathVariable String nm) {
    String name = nm;
    List<Tutorial> tutorialsName = this.projectService.getByName(name);
    return tutorialsName;
    }

    @GetMapping("/getTutorialNameAndLevel/{nm}/{lvl}")
    public List<Tutorial> getTutorialByName(@PathVariable String nm,@PathVariable int lvl) {
    String name = nm;
    int level = lvl;
    List<Tutorial> tutorialsName = this.projectService.getByNameAndLevel(name, level);
    return tutorialsName;
    }


    @PutMapping("/putTutorial/{id}")
    public Tutorial putTutorial(@PathVariable int id, @RequestBody Tutorial tut) {
        int Id = id;
        Tutorial tutorial = tut;
        tutorial.setId(id);
//        System.out.println("wanted to update with id: " + Id);
//        System.out.println("here is the new record: " + tutorial);
        Tutorial savedTutorial = this.projectService.putTutorial(tutorial);

        return savedTutorial;
    }

    @PostMapping("/postTutorial")
    public Tutorial postTutorial(@RequestBody Tutorial tut) {
        Tutorial tutorial = tut;
        System.out.println("tutorial received is: " + tutorial);
        Tutorial savedTutorial = this.projectService.postTutorial(tutorial);
        return savedTutorial;
    }

    @DeleteMapping("/deleteTutorial")
    public String deleteMapping() {
        return "tutorial deleted";
    }

}
