package com.example.Coursework2.controller;

import com.example.Coursework2.model.Question;
import com.example.Coursework2.servis.ExaminerService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collection;

@RestController
@RequestMapping("/exam")
public class ExamController {
    private final ExaminerService examinerService;

    public ExamController(ExaminerService examinerService) {
        this.examinerService = examinerService;
    }
    @GetMapping
    public Collection<Question> getQuestion(@RequestParam int amount) throws Exception {
        return examinerService.getQuestion(amount);
    }
}
