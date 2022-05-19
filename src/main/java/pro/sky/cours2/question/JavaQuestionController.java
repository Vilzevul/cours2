package pro.sky.cours2.question;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collection;
import java.util.List;

@RequestMapping("/exam/java")
@RestController
public class JavaQuestionController {
    private final QuestionService questionService;

    public JavaQuestionController( @Qualifier("java")QuestionService questionService) {
        this.questionService = questionService;

    }


    @GetMapping(path = "/add")
    public Question addQuestion(@RequestParam(value = "question") String question, @RequestParam(value = "answer") String answer) {
        return questionService.add(question,answer);
    }


    @GetMapping(path = "/remove")
    public Question removeQuestion(@RequestParam(value = "question") String question, @RequestParam(value = "answer") String answer) {
        List<Question> q = (List<Question>) questionService.getAll();
        int index = q.indexOf(new Question(question, answer));
        if (!(index == -1)) return questionService.remove(q.get(index));
        return null;

    }


    @GetMapping()
    public Collection<Question> getQuestion() {
        return questionService.getAll();
    }


}
