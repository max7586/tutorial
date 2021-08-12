package com.tr.tutorials.repository;


import com.tr.tutorials.model.Tutorial;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProjectRepository extends JpaRepository <Tutorial, Integer> {
    public List<Tutorial> findByName(String name);
    public List<Tutorial> findByNameAndLevel(String name, int level);
}
