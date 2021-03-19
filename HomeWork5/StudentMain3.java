/*
1. Создать класс Student с полями
	1.1 Порядковый номер (int)
	1.2 Имя (Строка размером от 3 до 10 русских символов)
	1.3 возраст (7-17)
	1.4 оценка(0.0-10.0)
	1.5 признак участия в олимпиадах (bool).
2. Создать 10_000 объектов класс Student и поместить в коллекцию. Данные заполняются рандомно.
2.3** Заполнять имя рандомными понятными именами загруженными из файла.
 */

package HomeWork5;

import HomeWork5.comparators.StudentNameComparator;
import HomeWork5.comparators.StudentScoreAndAgeComparator;
import HomeWork5.comparators.StudentScoreComparator;
import HomeWork5.core.GlobalCounter;
import HomeWork5.core.random.RandStringName;
import HomeWork5.core.random.api.IRandomTextSpliterator;
import HomeWork5.core.random.split.TextSpliterator;
import HomeWork5.dto.Student;
import HomeWork5.predicate.StudentAgeAndScorePredicate;
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

public class StudentMain3 {
    public static void main(String[] args) throws IOException {

        String text = Files.readString(
                Path.of("C:\\Users\\user\\Desktop\\IDEprojects\\JD1\\HomeWork\\src\\HomeWork5\\RusNames.txt"),
                StandardCharsets.UTF_8
        );

        IRandomTextSpliterator spliterator = new TextSpliterator();
        String[] strings = spliterator.split(text);

        Supplier<Student> supplier2 = new RandomStudentSupplier(new GlobalCounter(), new RandStringName(strings),
                3, 10);
        Predicate<Student> predicate2 = new StudentAgeAndScorePredicate(12, 8);
        StudentScoreComparator comp1 = new StudentScoreComparator();
        StudentNameComparator comp2 = new StudentNameComparator();
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

        /*
        3. Отфильтровать студентов по нескольким признакам. По возрасту (тем кому 12 и выше), по оценке (выше 8).
         Отфильтрованных студентов поместить в отдельный список. Старый список дожен остаться неизменным.
         */
        List<T> filtered = new ArrayList<>();

        for (T value : data) {
            if (predicate.test(value)) {
                filtered.add(value);
            }
        }

        /*
         * 4. Отсортировать отфильтрованных студентов по имени, от меньшему к большему. Выести топ 10
         */
        System.out.println("Отсортировать отфильтрованных студентов по имени, от меньшему к большему. Выести топ 10");
        SortUtils.bubbleSort(filtered, comp2);
        printTop(filtered,10);
        /*
         * 5. Отсортировать отфильтрованных студентов по оценке, от большего к меньшему. Выести топ 10
         */
        System.out.println("Отсортировать отфильтрованных студентов по оценке, от большего к меньшему. Выести топ 10");
        SortUtils.shakerSort(filtered, comp1.reversed());
        printTop(filtered,10);
        /*
         * 6. Отсортировать отфильтрованных студентов по возрасту и оценке одновременно. Вывести топ 10 в каждом возрасте.
         */
        System.out.println("Отсортировать отфильтрованных студентов по возрасту и оценке одновременно. Выести топ 10");
        SortUtils.bubbleSort(filtered, comp4.reversed());
        printTop(filtered, 10);
    }

    /**
     * Метод выводить Tоп - количество элементов
     * @param list список элементов
     * @param top количество выводимых элементов
     * @param <T> дженерик обобщенного типа
     */
    public static <T> void  printTop(List<T> list, int top) {
        int end = list.size();
        top = Math.min(end, top);
        for (int i = 0; i < top; i++) {
            System.out.println(list.get(i).toString());
        }
        System.out.println();
    }

}

