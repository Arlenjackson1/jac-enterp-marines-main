package org.wecancodeit.backend.games.trivia.controllers;



import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.wecancodeit.backend.games.trivia.model.QuestionModel;
import org.wecancodeit.backend.games.trivia.services.ArtQuestionsService;

@RestController
@CrossOrigin(origins = "http://localhost:3000")
@RequestMapping("/api/questions/art")
public class ArtQuestionsController {

    private final ArtQuestionsService artQuestionsService;

   
    public ArtQuestionsController(ArtQuestionsService artQuestionsService) {
        this.artQuestionsService = artQuestionsService;
    }

    @GetMapping("/random")
    public QuestionModel getRandomArtQuestion() {
        return artQuestionsService.getRandomArtQuestion();
    }
    
}