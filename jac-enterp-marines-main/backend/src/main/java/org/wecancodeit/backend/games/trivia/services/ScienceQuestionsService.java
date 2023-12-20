package org.wecancodeit.backend.games.trivia.services;

import org.springframework.stereotype.Service;
import org.wecancodeit.backend.games.trivia.model.QuestionModel;

import java.util.Arrays;
import java.util.List;
import java.util.Random;

@Service
public class ScienceQuestionsService {

    private final List<QuestionModel> scienceQuestions;

    public ScienceQuestionsService() {

        this.scienceQuestions = Arrays.asList(
                new QuestionModel("What is the process by which plants make their own food?",
                        new String[] { "Respiration", "Photosynthesis", "Digestion", "Transpiration" }, 1),
                new QuestionModel("Which one of the following is a mammal?",
                        new String[] { "Lizard", "Frog", "Dolphin", "Turtle" }, 2),
                new QuestionModel(
                        "What is the force that pulls objects towards the center of the Earth?",
                        new String[] { "Magnetism", "Gravity", "Friction", "Tension" }, 1),
                new QuestionModel("What is the largest planet in our solar system?",
                        new String[] { "Earth", "Jupiter", "Mars", "Venus" }, 1),
                new QuestionModel(
                        "What is the process of a liquid turning into a gas called?",
                        new String[] { "Condensation", "Evaporation", "Sublimation", "Precipitation" }, 1),
                new QuestionModel("Which of the following is a source of renewable energy?",
                        new String[] { "Coal", "Solar", "Oil", "Natural Gas" }, 1),
                new QuestionModel("What is the outer layer of the Earth called?",
                        new String[] { "Crust", "Core", "Mantle", "Atmosphere" }, 0),
                new QuestionModel(
                        "What is the process of a solid turning directly into a gas called?",
                        new String[] { "Melting", "Freezing", "Sublimation", "Condensation" }, 2),
                new QuestionModel("Which planet is known as the \"Red Planet\"?",
                        new String[] { "Mars", "Venus", "Jupiter", "Saturn" }, 0),
                new QuestionModel("What is the primary purpose of the roots of a plant?",
                        new String[] { "Photosynthesis", "Absorption of water and nutrients", "Reproduction",
                                "Support" },
                        1));
    }

    public QuestionModel getRandomScienceQuestion() {
        Random random = new Random();
        int randomIndex = random.nextInt(scienceQuestions.size());
        return scienceQuestions.get(randomIndex);
    }
}
