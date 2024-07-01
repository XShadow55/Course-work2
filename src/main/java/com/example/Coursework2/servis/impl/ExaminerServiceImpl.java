package com.example.Coursework2.servis.impl;

import com.example.Coursework2.exception.thereAreSoManyQuestionsMissing;
import com.example.Coursework2.model.Question;
import com.example.Coursework2.servis.ExaminerService;
import com.example.Coursework2.servis.QuestionServis;
import org.springframework.stereotype.Service;

import java.util.*;

import java.util.Collection;
@Service
public class ExaminerServiceImpl implements ExaminerService {
    private  QuestionServis questionServis;
    private final Set<Question> questionSet = new HashSet<>();

    public ExaminerServiceImpl(QuestionServis questionServis) {
        this.questionServis = questionServis;
    }

    @Override
    public Collection<Question> getQuestion(int amount) throws thereAreSoManyQuestionsMissing {
        questionSet.clear();
        if (amount > questionServis.getAll().size()){
            throw new thereAreSoManyQuestionsMissing();
        }
        int numberOfQuestions = 0;
        while (numberOfQuestions < amount){
            questionSet.add(questionServis.getRandomQuestion());
            numberOfQuestions = questionSet.size();
        }

        return questionSet;
    }
}
