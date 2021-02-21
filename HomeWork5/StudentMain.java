
/** 3. Отфильтровать студентов по нескольким признакам.
 * По возрасту (тем кому 12 и выше), по оценке (выше 8).
 * Отфильтрованных студентов поместить в отдельный список.
 * Старый список дожен остаться неизменным.
 */

package HomeWork5;

import HomeWork5.comparators.*;
import HomeWork5.core.GlobalCounter;
import HomeWork5.core.random.Rand;
import HomeWork5.core.random.RandStringName;
import HomeWork5.dto.Student;
import HomeWork5.predicate.StudentAgeAndScorePredicate;
import HomeWork5.predicate.StudentAgePredicate;
import HomeWork5.predicate.StudentScorePredicate;
import HomeWork5.suppliers.RandomStudentSupplier;
import HomeWork5.utils.SortUtils;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class StudentMain {
    public static void main(String[] args) throws IOException {

        String text = Files.readString(
                Path.of("C:\\Users\\user\\Desktop\\IDEprojects\\JD1\\HomeWork\\src\\HomeWork5\\RusNames.txt"),
                StandardCharsets.UTF_8
        );

        Supplier<Student> supplier2 = new RandomStudentSupplier(new GlobalCounter(), new Rand(),
                3, 10);
        Predicate<Student> predicate2 = new StudentAgeAndScorePredicate(12, 8);
        StudentScoreComparator comp1 = new StudentScoreComparator();
        StudentNameComparator comp2 = new StudentNameComparator();
        StudentAgeComparator comp3 = new StudentAgeComparator();
        StudentScoreAndAgeComparator comp4 = new StudentScoreAndAgeComparator();

        flow(supplier2, predicate2, comp1, comp2, comp4);
    }

    public static <T> void flow(Supplier<T> supplier, Predicate<T> predicate,
                                Comparator<T> comp1,
                                Comparator<T> comp2,
                                Comparator<T> comp4) {

        List<T> data = new ArrayList<>();

        do {
            data.add(supplier.get());
        } while (data.size() < 10_000);

        List<T> filtered = new ArrayList<>();

        for (T value : data) {
            if (predicate.test(value)) {
                filtered.add(value);
            }
        }

        //System.out.println(filtered);

        /**
         * 4. Отсортировать отфильтрованных студентов по имени, от меньшему к большему. Выести топ 10
         */
        System.out.println("Отсортировать отфильтрованных студентов по имени, от меньшему к большему. Выести топ 10");
        SortUtils.bubbleSort(filtered, comp2);
        printTop(filtered,10);
        /**
         * 5. Отсортировать отфильтрованных студентов по оценке, от большего к меньшему. Выести топ 10
         */
        System.out.println("Отсортировать отфильтрованных студентов по оценке, от большего к меньшему. Выести топ 10");
        SortUtils.shakerSort(filtered, comp1.reversed());
        printTop(filtered,10);
        /**
         * 6. Отсортировать отфильтрованных студентов по возрасту и оценке одновременно. Вывести топ 10 в каждом возрасте.
         */
        System.out.println("Отсортировать отфильтрованных студентов по возрасту и оценке одновременно. Выести топ 10");
        SortUtils.bubbleSort(filtered, comp4.reversed());
        printTop(filtered, 10);
    }

    public static void  printTop(List list, int top) {
        for (int i = 0; i < top; i++) {
            System.out.println(list.get(i).toString());
        }
        System.out.println();
    }

}

