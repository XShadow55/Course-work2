package com.example.Coursework2;

import com.example.Coursework2.exception.thereAreSoManyQuestionsMissing;
import com.example.Coursework2.model.Question;
import com.example.Coursework2.servis.impl.ExaminerServiceImpl;
import com.example.Coursework2.servis.impl.JavaQuestionService;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.stereotype.Service;
import java.util.*;
@ExtendWith(MockitoExtension.class)
class ExaminerServiceImplTest {
    @Mock
    private JavaQuestionService javaQuestionService;

    @InjectMocks
    private ExaminerServiceImpl service;

    private final Set<Question> set = new HashSet<>();


    @Test
    void getQuestion() {
        Assertions.assertThrows(thereAreSoManyQuestionsMissing.class,() -> service.getQuestion(1));
    }
}