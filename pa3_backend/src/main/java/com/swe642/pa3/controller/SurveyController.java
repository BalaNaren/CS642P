package com.swe642.pa3.controller;

import com.swe642.pa3.entity.Survey;
import com.swe642.pa3.service.SurveyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class SurveyController {
    @Autowired
    private SurveyService service;

    @PostMapping("/addSurvey")
    public Survey addSurvey(@RequestBody Survey survey) {
        return service.saveSurvey(survey);
    }

    @PostMapping("/addSurveys")
    public List<Survey> addSurveys(@RequestBody List<Survey> surveys) {
        return service.saveSurveys(surveys);
    }

    @GetMapping("/surveys")
    public List<Survey> findAllSurveys() {
        return service.getSurveys();
    }

    @GetMapping("/surveyById/{id}")
    public Survey findSurveyById(@PathVariable int id) {
        return service.getSurveyById(id);
    }
}
