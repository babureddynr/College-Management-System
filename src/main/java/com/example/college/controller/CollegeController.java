package com.example.college.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.college.entity.College;
import com.example.college.repository.CollegeRepository;

@RestController
@RequestMapping("/api/colleges")
public class CollegeController {

    @Autowired
    private CollegeRepository collegeRepository;

    // Get all colleges
    @GetMapping
    public List<College> getAllColleges() {
        return collegeRepository.findAll();
    }

    // Get college by ID
    @GetMapping("/{id}")
    public College getCollegeById(@PathVariable Long id) {
        return collegeRepository.findById(id).orElse(null);
    }

    // Add a new college
    @PostMapping
    public College addCollege(@RequestBody College college) {
        return collegeRepository.save(college);
    }

    // Delete college by ID
    @DeleteMapping("/{id}")
    public void deleteCollege(@PathVariable Long id) {
        collegeRepository.deleteById(id);
    }
}
