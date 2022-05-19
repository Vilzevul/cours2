package pro.sky.cours2.question;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Random;
@Qualifier("math")
@Service
public class MathQuestionService implements QuestionService{

    public List<Question> questions = new ArrayList<>();

    @PostConstruct
    public void init(){
        add("MathQuestion1","MathAnswer1" );
        add("MathQuestion2","MathAnswer2" );
        add("MathQuestion3","MathAnswer3" );
        add("MathQuestion4","MathAnswer4" );
        add("MathQuestion5","MathAnswer5" );

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
