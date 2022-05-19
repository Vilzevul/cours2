package pro.sky.cours2.exam;

import org.springframework.web.bind.annotation.*;
import pro.sky.cours2.question.Question;

import java.util.Collection;
@RequestMapping("/exam/get/{amount}")
@RestController
public class ExamController {
    private final ExaminerService examinerService;

    public ExamController(ExaminerService examinerService) {
        this.examinerService = examinerService;
    }

    @GetMapping
    public Collection<Question> getQuestions(@PathVariable int amount){
        return examinerService.javaGetQuestion(amount);
    }
}
