package HomeWork4;

import java.util.Arrays;
import java.util.Comparator;

public class DataContainerMain {

    public static void main(String[] args) {

        DataContainer<Integer> dataContainer = new DataContainer<>(new Integer[]{null, 2, 1, null,324, 21,22});

        System.out.println(dataContainer.add(777)); // индекс добавлненного элемента = 0
        System.out.println(dataContainer.get(2));// значение элемента под индексом 2 = 1
        System.out.println(dataContainer.delete(4));// true - элемент с индексом 4 был успешно удален
        System.out.println(dataContainer.deleteItem(324)); // false т.к. элемент [324] был под индексом 4, и был удален
        System.out.println(Arrays.toString(dataContainer.getItems()));// [777, 2, 1, null, 21, 22]
        System.out.println(dataContainer.toString()); // [777, 2, 1, 21, 22] вывели содержимое поля без пустых значений
        dataContainer.sort(Comparator.nullsLast(Comparator.naturalOrder())); // вызвали метод сортировки реализуя Comporator
        System.out.println(Arrays.toString(dataContainer.getItems())); // [1, 2, 21, 22, 777, null] поле после сортировки

    }

}
