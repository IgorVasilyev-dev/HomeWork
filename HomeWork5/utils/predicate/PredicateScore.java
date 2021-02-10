package HomeWork5.utils.predicate;

import HomeWork5.dto.Student;

import java.util.function.Predicate;

public class PredicateScore implements Predicate<Student> {

    int score;

    public PredicateScore(int score) {
        this.score = score;
    }

    @Override
    public boolean test(Student o) {
        return o.getScore() >= score;
    }
}
