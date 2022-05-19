package pro.sky.cours2.exam;

import pro.sky.cours2.question.Question;

import java.util.Collection;

public interface ExaminerService {
    Collection<Question>javaGetQuestion(int amount);
    Collection<Question>mathGetQuestion(int amount);
    Collection<Question>getQuestion(int amount);

}
