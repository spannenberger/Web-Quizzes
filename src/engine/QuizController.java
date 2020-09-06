package engine;

import org.springframework.web.bind.annotation.*;

@RestController
public class QuizController {
    Quiz quiz;
    Answer attempt;

    public QuizController() {
        quiz = new Quiz();
        attempt = new Answer();
    }
    @GetMapping(path = "/api/quiz")
    public Quiz getQuiz() {
        return quiz;
    }
    @PostMapping(path = "/api/quiz")
    public Answer getAnswer(@RequestParam int answer) {
        if (answer == 2) {
            attempt.setSuccess(true);
            attempt.setFeedback("Congratulations, you're right!");
        } else {
            attempt.setSuccess(false);
            attempt.setFeedback("Wrong answer! Please, try again.");
        }
        return attempt;
    }
}