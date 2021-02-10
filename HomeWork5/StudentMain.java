package HomeWork5;

import HomeWork5.comparator.StudentNameComparator;
import HomeWork5.utils.RandomRand;
import HomeWork5.utils.StudentRandomName;
import HomeWork5.utils.StudentRandomSupplier;
import HomeWork5.utils.api.IRandom;
import HomeWork5.dto.Student;
import HomeWork5.utils.predicate.PredicateAge;
import HomeWork5.utils.predicate.PredicateScore;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class StudentMain {

    public static void main(String[] args) throws IOException {

        AtomicInteger counter = new AtomicInteger(0);

        List<Student> data = new ArrayList<>();

        IRandom rnd = new RandomRand();
        Supplier<Student> studentRandomSupplier = new StudentRandomSupplier(counter, rnd);

        IRandom rndName = new StudentRandomName();
        Supplier<Student> studentRandomSupplier1 = new StudentRandomSupplier(counter,rndName);

        do {
            data.add(studentRandomSupplier.get());
           //data.add(studentRandomSupplier1.get());
        } while (data.size() < 10_000);
        System.out.println(data);
        /** 3. Отфильтровать студентов по нескольким признакам.
         * По возрасту (тем кому 12 и выше), по оценке (выше 8).
         * Отфильтрованных студентов поместить в отдельный список.
         * Старый список дожен остаться неизменным.
         */


    }

}
