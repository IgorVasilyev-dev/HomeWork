
/** 3. Отфильтровать студентов по нескольким признакам.
 * По возрасту (тем кому 12 и выше), по оценке (выше 8).
 * Отфильтрованных студентов поместить в отдельный список.
 * Старый список дожен остаться неизменным.
 */

package HomeWork5;

import HomeWork5.comparators.StringComparator;
import HomeWork5.comparators.StudentAgeComparator;
import HomeWork5.comparators.StudentNameComparator;
import HomeWork5.comparators.StudentScoreComparator;
import HomeWork5.core.GlobalCounter;
import HomeWork5.core.random.Rand;
import HomeWork5.dto.Student;
import HomeWork5.predicate.StudentAgeAndScorePredicate;
import HomeWork5.predicate.StudentAgePredicate;
import HomeWork5.predicate.StudentScorePredicate;
import HomeWork5.suppliers.RandomStudentSupplier;
import HomeWork5.utils.SortUtils;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class StudentMain {
    public static void main(String[] args) {


        Supplier<Student> supplier2 = new RandomStudentSupplier(new GlobalCounter(), new Rand(),
                3, 10);
                Predicate<Student> predicate2 = new StudentAgeAndScorePredicate(12, 8);
                StudentScoreComparator studentScoreComparator = new StudentScoreComparator();
                StudentNameComparator studentNameComparator = new StudentNameComparator();
                StudentAgeComparator  studentAgeComparator = new StudentAgeComparator();

                flow(supplier2, predicate2,studentNameComparator, studentScoreComparator, studentAgeComparator);
            }

            public static <T> void flow(Supplier<T> supplier, Predicate<T> predicate,
                                        Comparator<T> studentNameComparator,
                                        Comparator<T> comparatorScore,
                                        Comparator<T> comparatorAge){

                List<T> data = new ArrayList<>();

                do {
                    data.add(supplier.get());
                } while (data.size() < 50);

                List<T> filtered = new ArrayList<>();

                for (T value : data) {
                    if(predicate.test(value)){
                        filtered.add(value);
                    }
                }

               //System.out.println(filtered);

                /**
                 * 4. Отсортировать отфильтрованных студентов по имени, от меньшему к большему. Выести топ 10
                 */
                SortUtils.bubbleSort(filtered, studentNameComparator);
                System.out.println(filtered);
                /**
                 * 5. Отсортировать отфильтрованных студентов по оценке, от большего к меньшему. Выести топ 10
                 */
                SortUtils.shakerSort(filtered, comparatorScore.reversed());
                System.out.println(filtered);
                /**
                 * 6. Отсортировать отфильтрованных студентов по возрасту и оценке одновременно. Вывести топ 10 в каждом возрасте.
                 */

            }

    }

