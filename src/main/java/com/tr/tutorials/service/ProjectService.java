package com.tr.tutorials.service;

import com.tr.tutorials.model.Tutorial;
import com.tr.tutorials.repository.ProjectRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ProjectService {


    @Autowired
    ProjectRepository projectRepository;

    public List<Tutorial> getAll() {
        List<Tutorial> tutorialList = this.projectRepository.findAll();
        return tutorialList;
    }

    public Tutorial postTutorial(Tutorial tut){
        Tutorial tutorial = tut;
        Tutorial savedTutorial = this.projectRepository.save(tutorial);
        return savedTutorial;
    }

    public Tutorial putTutorial(Tutorial tut){
        Tutorial tutorial = tut;
        Tutorial savedTutorial = this.projectRepository.save(tutorial);
        return savedTutorial;
    }

    public List<Tutorial> getByName(String nm) {
        String name = nm;
        List<Tutorial> tutorialsName = new ArrayList<>();
        tutorialsName = this.projectRepository.findByName(name);
        return tutorialsName;
    }

    public List<Tutorial> getByNameAndLevel(String nm, int lvl) {
        String name = nm;
        int level = lvl;
        List<Tutorial> tutorialsName = new ArrayList<>();
        tutorialsName = this.projectRepository.findByNameAndLevel(name, level);
        return tutorialsName;
    }
}
