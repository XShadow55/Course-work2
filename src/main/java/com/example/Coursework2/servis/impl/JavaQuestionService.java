package com.example.Coursework2.servis.impl;

import com.example.Coursework2.model.Question;
import com.example.Coursework2.servis.QuestionServis;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class JavaQuestionService implements QuestionServis {
    private final List<Question> questionList = new ArrayList<>();
    @Override
    public Question add(String question, String answer) {
        Question pair = new Question(question,answer);
        findQuestionInList(pair);
        questionList.add(pair);
        return pair;
    }

//    @Override
//    public Question add(Question question) {
//        questionList.add(question);
//        return question;
//    }

    @Override
    public Question remove(String question,String answer) {

        Question pair = new Question(question,answer);
        if (!questionList.contains(pair)){
            throw new RuntimeException();
        }
        questionList.remove(pair);
        return pair;
    }

    @Override
    public Collection<Question> getAll() {
        return questionList;
    }

    @Override
    public Question getRandomQuestion() {
        Random random = new Random();
        int index = random.nextInt(questionList.size());
        return questionList.get(index);
    }
    private void findQuestionInList(Question question){
        if (questionList.contains(question)){
            throw new RuntimeException();
        }
    }
}
