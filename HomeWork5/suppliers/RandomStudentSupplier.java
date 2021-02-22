package HomeWork5.suppliers;

import HomeWork5.core.GlobalCounter;
import HomeWork5.dto.Student;
import HomeWork5.core.random.api.IRandom;
import java.util.function.Supplier;

public class RandomStudentSupplier implements Supplier<Student> {

    private final IRandom rnd;
    private final GlobalCounter counter;
    private final int nameLengthFrom;
    private final int nameLengthTo;

    public RandomStudentSupplier(GlobalCounter counter, IRandom rnd,
    int nameLengthFrom, int nameLengthTo) {
        this.rnd = rnd;
        this.counter = counter;
        this.nameLengthFrom = nameLengthFrom;
        this.nameLengthTo = nameLengthTo;
    }

    @Override
    public Student get() {
        return new Student(
                this.counter.getAndInc(),
                this.rnd.randString(this.nameLengthFrom, this.nameLengthTo),
                this.rnd.randInt(7, 17),
                this.rnd.randDouble(0, 10),
                this.rnd.randBoolean()
        );
    }
}
