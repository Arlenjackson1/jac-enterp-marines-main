package org.wecancodeit.backend.games.trivia.services;

import org.springframework.stereotype.Service;
import org.wecancodeit.backend.games.trivia.model.QuestionModel;

import java.util.Arrays;
import java.util.List;
import java.util.Random;

@Service
public class HistoryQuestionsService {

    private final List<QuestionModel> historyQuestions;

    public HistoryQuestionsService() {

        this.historyQuestions = Arrays.asList(
                new QuestionModel("Who was the first President of the United States?",
                        new String[] { "Thomas Jefferson", "John Adams", "George Washington", "James Madison" },
                        2),

                new QuestionModel(
                        "What famous document begins with the words 'We the People'?",
                        new String[] { "Declaration of Independence", "Bill of Rights", "Constitution",
                                "Emancipation Proclamation" },
                        2),

                new QuestionModel(
                        "Which famous civil rights leader had a dream of equality?",
                        new String[] { "Malcolm X", "Rosa Parks", "Martin Luther King Jr.", "Harriet Tubman" },
                        2),

                new QuestionModel(
                        "In what year did Christopher Columbus arrive in the Americas?",
                        new String[] { "1492", "1620", "1776", "1865" }, 0),

                new QuestionModel(
                        "Who wrote the 'Gettysburg Address' during the American Civil War?",
                        new String[] { "Abraham Lincoln", "Ulysses S. Grant", "Robert E. Lee",
                                "Jefferson Davis" },
                        0),

                new QuestionModel(
                        "What ancient Egyptian structure is known for its triangular shape?",
                        new String[] { "Pyramid of Giza", "Sphinx", "Obelisk", "Luxor Temple" }, 0),

                new QuestionModel(
                        "Who was the famous nurse during the Crimean War known as the 'Lady with the Lamp'?",
                        new String[] { "Clara Barton", "Florence Nightingale", "Mary Seacole", "Dorothea Dix" },
                        1),

                new QuestionModel(
                        "Which Native American woman helped Lewis and Clark on their expedition?",
                        new String[] { "Sacagawea", "Pocahontas", "Squanto", "Crazy Horse" }, 0),

                new QuestionModel(
                        "What event marks the beginning of the United States as an independent nation?",
                        new String[] { "Boston Tea Party", "Declaration of Independence",
                                "Battles of Lexington and Concord",
                                "Treaty of Paris (1783)" },
                        1),

                new QuestionModel(
                        "Who was the leader of the Underground Railroad, helping enslaved people escape to freedom?",
                        new String[] { "Harriet Tubman", "Frederick Douglass", "Sojourner Truth",
                                "John Brown" },
                        0));

    }

    public QuestionModel getRandomHistoryQuestion() {
        Random random = new Random();
        int randomIndex = random.nextInt(historyQuestions.size());
        return historyQuestions.get(randomIndex);
    }
}
