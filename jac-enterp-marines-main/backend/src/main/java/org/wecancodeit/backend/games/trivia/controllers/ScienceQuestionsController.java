package org.wecancodeit.backend.games.trivia.controllers;


import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.wecancodeit.backend.games.trivia.model.QuestionModel;
import org.wecancodeit.backend.games.trivia.services.ScienceQuestionsService;

@RestController
@CrossOrigin(origins = "http://localhost:3000")
@RequestMapping("/api/questions/science")
public class ScienceQuestionsController {

    private final ScienceQuestionsService scienceQuestionsService;

   
    public ScienceQuestionsController(ScienceQuestionsService scienceQuestionsService) {
        this.scienceQuestionsService = scienceQuestionsService;
    }

    @GetMapping("/random")
    public QuestionModel getRandomScienceQuestion() {
        return scienceQuestionsService.getRandomScienceQuestion();
    }
    
}