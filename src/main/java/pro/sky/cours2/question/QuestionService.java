package pro.sky.cours2.question;

import pro.sky.cours2.question.Question;

import java.util.Collection;
import java.util.List;

public interface QuestionService {

    Question add(String question, String answer);
    Question add(Question question);

    Question remove(Question question);
    Collection<Question> getAll();
    Question getRandomQuestion();


}
