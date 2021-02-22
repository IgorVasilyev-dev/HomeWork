package HomeWork4;

import java.util.Arrays;
import java.util.Comparator;

public class DataContainerMain {

    public static void main(String[] args) {

        DataContainer<Integer> dataContainer = new DataContainer<>(new Integer[]{null,2,1,null,324,22,21});

        // 4
        System.out.println(dataContainer.add(777)); // индекс добавлненного элемента = 0

        // 5
        System.out.println(dataContainer.get(2));// значение элемента под индексом 2 = 1

        // 6
        System.out.print("поле  data = ");
        System.out.println(Arrays.toString(dataContainer.getItems()));

        // 7
        System.out.println(dataContainer.delete(4));// true - элемент с индексом 4 был успешно удален

        // 8
        System.out.println(dataContainer.deleteItem(324)); // false т.к. элемент [324] был под индексом 4, и был удален

        // 9
        dataContainer.sort(Comparator.nullsLast(Comparator.naturalOrder())); // вызвали метод сортировки реализуя Comparator
        System.out.println(Arrays.toString(dataContainer.getItems())); // [1, 2, 21, 22, 777, null] поле после сортировки

        // 10
        System.out.println(dataContainer.toString()); // [777, 2, 1, 21, 22] вывели содержимое поля без пустых значений

        //11
        DataContainer.sort(dataContainer);// вызвали метод сортировки sort, который принимает DataContainer с дженериком extends Comparable
        System.out.println(dataContainer.toString()); // [1, 2, 21, 22, 777]

        // 12
        DataContainer.sort(dataContainer,Comparator.reverseOrder()); // вызвали метод сортировки reverseOrder реализуя Comparator
        System.out.println(dataContainer.toString()); // [777, 22, 21, 2, 1] поле после сортировки

        // 13
        while (dataContainer.hasNext()) {
            System.out.print(dataContainer.next() + " ");
            System.out.println(dataContainer.hasNext());
        }
    }

}
