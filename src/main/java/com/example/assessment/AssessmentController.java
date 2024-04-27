package com.example.assessment;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class AssessmentController {

    private final AssessmentMapper assessmentMapper;

    public AssessmentController(AssessmentMapper assessmentMapper) {
        this.assessmentMapper = assessmentMapper;
    }


    @GetMapping("/assessments")
    public List<Assessment> findByAssessments(@RequestParam String startsWith) {
        return assessmentMapper.findByNameStartingWith(startsWith);
    }
}
