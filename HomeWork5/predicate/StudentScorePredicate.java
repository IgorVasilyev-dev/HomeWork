package HomeWork5.predicate;

import HomeWork5.dto.Student;

import java.util.function.Predicate;

public class StudentScorePredicate implements Predicate<Student> {

    int score;

    public StudentScorePredicate(int score) {
        this.score = score;
    }

    @Override
    public boolean test(Student o) {
        return o.getScore() >= score;
    }

}

