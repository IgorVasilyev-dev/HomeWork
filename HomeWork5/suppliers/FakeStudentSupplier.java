package HomeWork5.suppliers;

import HomeWork5.core.GlobalCounter;
import HomeWork5.core.random.api.IRandom;
import HomeWork5.dto.Student;

import java.util.function.Supplier;

public class FakeStudentSupplier implements Supplier<Student> {

    public FakeStudentSupplier() {
    }

    @Override
    public Student get() {
        return new Student(
                1,
                "sdasd",
                56,
                6,
                true
        );
    }
}
