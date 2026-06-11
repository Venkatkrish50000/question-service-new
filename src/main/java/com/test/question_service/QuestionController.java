package com.test.question_service;

import org.apache.coyote.Response;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api")
public class QuestionController {

    @GetMapping("getAllQuestions")
    public String getAllQuestions(){

        return "This is for Docker test! updated WOW";
    }
}
