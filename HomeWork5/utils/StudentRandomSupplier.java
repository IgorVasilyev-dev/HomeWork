package HomeWork5.utils;

import HomeWork5.dto.Student;
import HomeWork5.utils.api.IRandom;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.function.Supplier;

public class StudentRandomSupplier implements Supplier<Student> {

    private final AtomicInteger counter;
    private final IRandom rnd;

    public StudentRandomSupplier(AtomicInteger counter, IRandom rnd) {
        this.rnd = rnd;
        this.counter = counter;
    }

    @Override
    public Student get() {
            Student student = new Student();
            student.setID(counter.incrementAndGet());
            student.setAge(rnd.randInt(7, 17));
            student.setName(rnd.randString(3, 10));
            student.setRate(rnd.randDouble(0, 10));
            student.setOlympic(rnd.randBoolean());
            return student;
        }

}
