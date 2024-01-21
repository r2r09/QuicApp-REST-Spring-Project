package com.practice.project.quizapp.service;

import com.practice.project.quizapp.Question;
//import com.practice.project.quizapp.QuestionDAO;
import com.practice.project.quizapp.dao.QuestionDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class QuestionsService {


    @Autowired
    QuestionDAO questionDAO;

    public List<Question> getAllQuestions(){

        return questionDAO.findAll();

    }

    public List<Question> sortByCategory(String category){
        return questionDAO.findByCategory(category);
    }

    public String addQuestion(Question question) {
        questionDAO.save(question);
        return "Success";
    }
}
