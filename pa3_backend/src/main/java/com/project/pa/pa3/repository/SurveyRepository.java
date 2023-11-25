package com.project.pa.pa3.repository;

import com.project.pa.pa3.model.Survey;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SurveyRepository extends JpaRepository<Survey, Long> {
    // You can add custom query methods if needed
}
