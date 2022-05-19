package pro.sky.cours2.question;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.util.*;
@Qualifier("java")

@Service
@Primary
public class JavaQuestionService implements QuestionService {

    public List<Question> questions = new ArrayList<>();

 @PostConstruct
    public void init(){
    add("Question1","Answer1" );
    add("Question2","Answer2" );
    add("Question3","Answer3" );
    add("Question4","Answer4" );
    add("Question5","Answer5" );

    }

    @Override
    public Question add(String question, String answer) {
        Question q = new Question(question, answer);
        questions.add(q);
        return q;
    }

    @Override
    public Question add(Question question) {
        questions.add(question);
        return question;
    }

    @Override
    public Question remove(Question question) {
        questions.remove(question);
        return question;
    }

    @Override
    public Collection<Question> getAll() {

     return questions;
    }

    @Override
    public Question getRandomQuestion() {
        Random rnd = new Random();
        int size = questions.size();
        int index = rnd.nextInt(size) ;
      return questions.get(index);
    }


}
