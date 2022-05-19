package pro.sky.cours2.question;

import org.springframework.stereotype.Repository;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
@Repository
public class JavaQuestionRepository implements QuestionRepository{
    public List<Question> questions = new ArrayList<>();

    @PostConstruct
    public void init(){
        add(new Question("Question1","Answer1") );
        add(new Question("Question2","Answer2") );
        add(new Question("Question3","Answer3") );
        add(new Question("Question4","Answer4") );
        add(new Question("Question5","Answer5") );

    }

    @Override
    public Question add(Question question) {
        return null;
    }

    @Override
    public Question remove(Question question) {
        return null;
    }

    @Override
    public Collection<Question> getAll() {
        return null;
    }
}
