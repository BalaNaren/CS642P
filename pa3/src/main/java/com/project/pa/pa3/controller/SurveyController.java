package com.project.pa.pa3.controller;

import com.project.pa.pa3.model.Survey;
import com.project.pa.pa3.repository.SurveyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/surveys")
public class SurveyController {

    @Autowired
    private SurveyRepository surveyRepository;

    // POST endpoint to submit a new survey
    @PostMapping("/")
    public Survey createSurvey(@RequestBody Survey survey) {
        return surveyRepository.save(survey);
    }

    // GET endpoint to list all surveys
    @GetMapping("/")
    public List<Survey> getAllSurveys() {
        return surveyRepository.findAll();
    }
}
