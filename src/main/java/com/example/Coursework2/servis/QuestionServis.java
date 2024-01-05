package com.example.Coursework2.servis;

import com.example.Coursework2.model.Question;

import java.util.Collection;

public interface QuestionServis {
    Question add(String question,String answer);
//    Question add(Question question);
    Question remove(String question,String answer);
    Collection<Question> getAll();
    Question getRandomQuestion();

}
