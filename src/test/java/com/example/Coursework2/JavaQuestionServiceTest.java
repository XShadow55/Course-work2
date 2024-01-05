package com.example.Coursework2;

import com.example.Coursework2.model.Question;
import com.example.Coursework2.servis.impl.JavaQuestionService;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class JavaQuestionServiceTest {
    private final JavaQuestionService service = new JavaQuestionService();

    @Test
    void add() {
        Question question = new Question("QuestionText","QuestionAnswer");
        Assertions.assertEquals(question,service.add("QuestionText","QuestionAnswer"));
        Assertions.assertThrows(RuntimeException.class,() -> service.add("QuestionText","QuestionAnswer"));
    }

    @Test
    void remove() {
        Question question = new Question("QuestionText","QuestionAnswer");
        service.add("QuestionText","QuestionAnswer");
        Assertions.assertEquals(question,service.remove("QuestionText","QuestionAnswer"));
        Assertions.assertThrows(RuntimeException.class,() -> service.remove("QuestionText","QuestionAnswer"));
    }

}