package com.example.assessment;

import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class AssessmentService {
    private final AssessmentMapper assessmentMapper;

    public AssessmentService(AssessmentMapper assessmentMapper) {
        this.assessmentMapper = assessmentMapper;
    }

    public List<Assessment> findByStartingWith(String startsWith) {
        return assessmentMapper.findByNameStartingWith(startsWith);
    }

    public Assessment findById(int id) {
        Optional<Assessment> user = assessmentMapper.findById(id);
        if (user.isPresent()) {
            return user.get();
        } else {
            throw new AssessmentNotFoundException("Client with id " + id + " not found");
        }
    }
}
