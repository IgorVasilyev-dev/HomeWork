package HomeWork5.utils.predicate;

import HomeWork5.dto.Student;

import java.util.function.Predicate;

public class PredicateAge implements Predicate <Student> {
        int age;

        public PredicateAge(int age) {
            this.age = age;
        }

        @Override
        public boolean test(Student o) {
            return o.getAge() >= age;
        }
    }
