package com.example.Coursework2.controller;

import com.example.Coursework2.model.Question;
import com.example.Coursework2.servis.impl.JavaQuestionService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collection;

@RestController
@RequestMapping("/exam/java")
public class JavaQuestionController {
    private final JavaQuestionService javaQuestionService;

    public JavaQuestionController(JavaQuestionService javaQuestionService) {
        this.javaQuestionService = javaQuestionService;
    }
    @GetMapping("/add")
    public Question add(@RequestParam String question,@RequestParam String answer) {
        return javaQuestionService.add(question, answer);
    }
    @GetMapping("/remove")
    public Question remove(@RequestParam String question,@RequestParam String answer) {
        return javaQuestionService.remove(question, answer);
    }
    @GetMapping
    public Collection<Question> getAll() {
        return javaQuestionService.getAll();
    }


}
