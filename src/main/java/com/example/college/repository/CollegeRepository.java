package com.example.college.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.college.entity.College;

public interface CollegeRepository extends JpaRepository<College, Long> {
}