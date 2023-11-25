package com.project.pa.pa3.model;

import javax.persistence.*;
import java.util.Date;

@Entity
public class Survey {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String firstName;
    private String lastName;
    private String streetAddress;
    private String city;
    private String state;
    private String zip;
    private String telephone;
    private String email;
    private Date surveyDate;
    // Checkbox fields as boolean or String depending on your design
    private boolean likeStudents;
    private boolean likeLocation;
    // ... other checkbox fields
    // Radio buttons and dropdown fields
    private String interestSource;
    private String recommendationLikelihood;
    private String additionalComments;

    // Getters and setters
}
