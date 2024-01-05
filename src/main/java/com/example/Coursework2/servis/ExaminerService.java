package com.example.Coursework2.servis;

import com.example.Coursework2.model.Question;

import java.util.Collection;

public interface ExaminerService {
    Collection<Question> getQuestion(int amount) throws Exception;
}
