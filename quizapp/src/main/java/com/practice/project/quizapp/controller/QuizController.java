package com.practice.project.quizapp.controller;

import com.practice.project.quizapp.Question;
import com.practice.project.quizapp.TestIntr;
import com.practice.project.quizapp.courses;
import com.practice.project.quizapp.dao.QuestionDAO;
import com.practice.project.quizapp.service.QuestionsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("questions")
public class QuizController {
    @Autowired
    QuestionsService questionService;


    @GetMapping("allQuestions")
    public List<Question> getAllQuestions(){
        return questionService.getAllQuestions();

        //return List.of("qdv", "ajdh");
    }

    @GetMapping("category/{category}")
    public List<Question> sortByCategory(@PathVariable String category){ // if in {} the name is different like cat we have to specify in @PathVariable("cat")
        return questionService.sortByCategory(category);
    }

    @PostMapping("add")
    public String addQuestion(@RequestBody Question question){
        return questionService.addQuestion(question);
    }


//    @GetMapping("test")
//    public List<Question> getCourses(){
//        return ques.findAll();
//    }


}
