package pro.sky.cours2.exam;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import pro.sky.cours2.BadRequestException;
import pro.sky.cours2.question.Question;
import pro.sky.cours2.question.QuestionService;

import java.util.*;

@Service

public class ExaminerServiceImpl implements ExaminerService {

/*    private final QuestionService javaQuestionService;
    private final QuestionService mathQuestionService;
    public ExaminerServiceImpl( @Qualifier("java") QuestionService javaQuestionService,@Qualifier("math") QuestionService mathQuestionService) {
        this.javaQuestionService = javaQuestionService;
        this.mathQuestionService = mathQuestionService;
    }
  */
    private final QuestionService questionService;
    public ExaminerServiceImpl(QuestionService questionService) {
        this.questionService = questionService;
    }

    private Random random;
    public Set<Question> questions = new HashSet<>();

    @Override
    public Collection<Question> javaGetQuestion(int amount) {
        return null;
    }

    @Override
    public Collection<Question> mathGetQuestion(int amount) {
        return null;
    }

    @Override
    public Collection<Question> getQuestion(int amount) {
        if (amount > questionService.getAll().size()) throw new BadRequestException();
        while (questions.size() < amount) {
            questions.add(questionService.getRandomQuestion());
        }
        return questions;
    }

 /*   @Override
    public Collection<Question> javaGetQuestion(int amount) {
        if (amount > javaQuestionService.getAll().size()) throw new BadRequestException();
        while (questions.size() < amount) {
            questions.add(javaQuestionService.getRandomQuestion());
        }
        return questions;
    }
    @Override
    public Collection<Question> mathGetQuestion(int amount) {
        if (amount > mathQuestionService.getAll().size()) throw new BadRequestException();
        while (questions.size() < amount) {
            questions.add(mathQuestionService.getRandomQuestion());
        }
        return questions;
    }
*/
}
