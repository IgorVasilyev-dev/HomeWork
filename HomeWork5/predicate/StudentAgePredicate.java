package HomeWork5.predicate;

import HomeWork5.dto.Student;

import java.util.function.Predicate;

public class StudentAgePredicate implements Predicate <Student> {
        int age;

        public StudentAgePredicate(int age) {
            this.age = age;
        }

        @Override
        public boolean test(Student o) {
            return o.getAge() >= age;
        }
}
