package HomeWork5.utils;
import HomeWork5.dto.Student;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.function.Supplier;

public class TestMain {
    public static void main(String[] args) {
        AtomicInteger counter = new AtomicInteger(0);
        Supplier<Student> supplier1 = new StudentRandomSupplier(counter, new FakeRandom());

        System.out.println(supplier1.get());
        System.out.println(supplier1.get());
        System.out.println(supplier1.get());
        System.out.println(supplier1.get());
        System.out.println(supplier1.get());
    }
}
