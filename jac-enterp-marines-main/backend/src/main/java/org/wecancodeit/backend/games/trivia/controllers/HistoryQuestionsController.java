package org.wecancodeit.backend.games.trivia.controllers;


import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.wecancodeit.backend.games.trivia.model.QuestionModel;
import org.wecancodeit.backend.games.trivia.services.HistoryQuestionsService;


@RestController
@CrossOrigin(origins = "http://localhost:3000")
@RequestMapping("/api/questions/history")
public class HistoryQuestionsController {

    private final HistoryQuestionsService historyQuestionsService;

   
    public HistoryQuestionsController(HistoryQuestionsService historyQuestionsService) {
        this.historyQuestionsService = historyQuestionsService;
    }

    @GetMapping("/random")
    public QuestionModel getRandomArtQuestion() {
        return historyQuestionsService.getRandomHistoryQuestion();
    }
    
}