package org.wecancodeit.backend.games.trivia.services;

import org.springframework.stereotype.Service;
import org.wecancodeit.backend.games.trivia.model.QuestionModel;

import java.util.Arrays;
import java.util.List;
import java.util.Random;

@Service
public class ArtQuestionsService {

        private final List<QuestionModel> artQuestions;

        public ArtQuestionsService() {

                this.artQuestions = Arrays.asList(
                                new QuestionModel("What is the primary color used to create the color green?",
                                                new String[] { "Red", "Blue", "Yellow", "Green" }, 2),
                                new QuestionModel("Which artist is famous for painting the 'Starry Night'?",
                                                new String[] { "Pablo Picasso", "Vincent van Gogh", "Leonardo da Vinci",
                                                                "Claude Monet" },
                                                1),
                                new QuestionModel(
                                                "What art technique involves cutting and pasting pieces of paper to create an image?",
                                                new String[] { "Collage", "Sculpture", "Watercolor", "Sketching" }, 0),
                                new QuestionModel("Which of the following is a primary color?",
                                                new String[] { "Orange", "Purple", "Green", "Blue" }, 3),
                                new QuestionModel(
                                                "What is a sculpture made of different materials combined to create a piece of art called?",
                                                new String[] { "Mosaic", "Canvas", "Collage", "Mixed Media" }, 3),
                                new QuestionModel("Who painted the 'Mona Lisa'?",
                                                new String[] { "Vincent van Gogh", "Leonardo da Vinci", "Claude Monet",
                                                                "Pablo Picasso" },
                                                1),
                                new QuestionModel(
                                                "What is a famous Japanese art of folding paper into decorative shapes and figures?",
                                                new String[] { "Origami", "Sculpture", "Collage", "Pottery" }, 0),
                                new QuestionModel(
                                                "Which art form involves creating images by arranging small pieces of colored glass or stone?",
                                                new String[] { "Mosaic", "Sculpture", "Watercolor", "Oil Painting" },
                                                0),
                                new QuestionModel(
                                                "What is a tool that artists use to mix and apply colors to a canvas?",
                                                new String[] { "Easel", "Palette", "Brush", "Canvas" }, 1),
                                new QuestionModel("Which famous artist is known for painting the 'Sunflowers'?",
                                                new String[] { "Claude Monet", "Vincent van Gogh", "Pablo Picasso",
                                                                "Leonardo da Vinci" },
                                                1));

        }

        public QuestionModel getRandomArtQuestion() {
                Random random = new Random();
                int randomIndex = random.nextInt(artQuestions.size());
                return artQuestions.get(randomIndex);
        }
}