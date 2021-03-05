package HomeWork4;

import org.jetbrains.annotations.NotNull;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Iterator;

public class DataContainer<T> implements Iterable<T> {

    private T[] data;
    private int currentIndexData = 0;

    /**
     * Конструктор создает объект DataContainer
     * @param data объект DataContainer
     */
    public DataContainer(T[] data) {
        this.data = data;
    }

    /**
     * Метод возвращает элемент из списка
     * @param index индекс элемента
     * @return возвращает элемент
     * если индекс введен неверно - возвращает false
     */
    public T get(int index) {
        if (checkIndex(index)) {
            return data[index];
        } else {
            return null;
        }
    }

    /**
     * Метод добавляет данные во внутреннее поле data
     * если поле data переполнено, расширяем его
     * @param item значение которое передаем в поле data, может быть null
     * @return возвращает номер позиции в которую были вставлены данные
     * если значение не вставлено, вернеться -1
     */
    public int add(T item) {
        if (item != null) {
            for (int i = 0; i < data.length; i++) {
                if (data[i] == null) {
                    data[i] = item;
                    return i;
                } else if (i == data.length - 1) {
                    data = Arrays.copyOf(data, i + 2);
                }
            }
        }
        return -1;
    }

    /**
     * Метод возвращает поле data
     * @return data
     */
    public T[] getItems() {
        return data;
    }

    /**
     * Метод сжимает поле data
     * @param index индес элемента, который будет удален
     */
    private void arrayDell(int index) {
        T[] arr = Arrays.copyOf(data, data.length - 1);
        for (int i = 0, j = 0; i < data.length; i++) {
            if (i != index) {
                arr[j++] = data[i];
            }
        }
        this.data = arr;
    }

    /**
     * Метод удаления элемента из нашего поля data по индексу
     * @param index индекс элемента
     * @return вернет true, если элемент будет удален
     *                false - если введен не корректный индекс
     */
    public boolean delete(int index) {
        if (!checkIndex(index)) {
            return false;
        }
        arrayDell(index);
        return true;
    }

    /**
     * Метод удаляет элемент из нашего поля data.
     * @param item элемент, который нужно удалить из поля data
     * @return true - если элемент удален из списка
     *         false - если элемен не удален из поля data
     */
    public boolean deleteItem(T item) {
        for (int i = 0; i < data.length; i++) {
            if (item == null) {
                if (data[i] == null) {
                    arrayDell(i);
                    return true;
                }
            } else if (item.equals(data[i])) {
                arrayDell(i);
                return true;
            }
        }
        return false;
    }

    /**
     * Проверка индекса на корректность
     * @param index индекс элемента
     * @return возвращает true если индекс верный
     */
    private boolean checkIndex(int index) {
        return index < data.length && index >= 0;
    }

    /**
     * Метод сортировки
     * Использовать только с методом Comparator.nullsLast
     * @param comparator компоратор
     */
    public void sort(Comparator<T> comparator) {
        for (int i = 1; i < data.length; i++) {
            for (int j = 0; j < data.length - i; j++) {
                if (comparator.compare(data[j], data[j + 1]) >= 0) {
                   T buff = data[j];
                    data[j] = data[j + 1];
                    data[j + 1] = buff;
                }
            }
        }
    }

    /**
     * Метод сортировки коллекции
     * @param dataContainer коллекция для сортировки
     * @param <T> дженерик обощенного типа
     */
    public static <T extends Comparable> void sort(DataContainer <T> dataContainer) {
        int a;
        for (int i = 1; i < dataContainer.data.length; i++) {
            for (int j = 0; j < dataContainer.data.length - i; j++) {
                 if (dataContainer.data[j] == null) {
                   a = dataContainer.data[j + 1] == null ? 0 : -1;
                } else if (dataContainer.data[j + 1] == null) {
                    a =  dataContainer.data[j] == null ? -1: 1;
                } else {
                    a = dataContainer.data[j].compareTo(dataContainer.data[j + 1]);
                }
                if (a > 0) {
                    T buff = dataContainer.data[j];
                    dataContainer.data[j] = dataContainer.data[j + 1];
                    dataContainer.data[j + 1] = buff;
                }
            }
        }

    }

    /**
     * метод сортировки, который принимает объект DataContainer и реализацию интерфейса Comparator
     * @param dataContainer коллекция для сортировки
     * @param comparator компаратор
     * @param <T> дженерик обобщенного типа
     */
    public static <T> void sort(DataContainer <T> dataContainer, Comparator <T> comparator) {
        int a;
        for (int i = 1; i < dataContainer.data.length; i++) {
            for (int j = 0; j < dataContainer.data.length - i; j++) {
                if (dataContainer.data[j] == null) {
                    a = dataContainer.data[j + 1] == null ? 0 : -1;
                } else if (dataContainer.data[j + 1] == null) {
                    a =  dataContainer.data[j] == null ? -1: 1;
                } else {
                    a = comparator.compare(dataContainer.data[j], dataContainer.data[j + 1]);
                }
                if (a > 0) {
                    T buff = dataContainer.data[j];
                    dataContainer.data[j] = dataContainer.data[j + 1];
                    dataContainer.data[j + 1] = buff;
                }
            }
        }

    }

    /**
     * метод выводит содержимое поля data, без ячеек в которых храниться значение null
     * @return возвращает строку поля data
     */
    public String toString() {
        StringBuilder str = new StringBuilder();
        str.append('[');
        boolean comma = false;
        for (T datum : data) {
            if (datum != null) {
                if (comma) {
                    str.append(", ");
                } else {
                    comma = true;
                }
                str.append(datum);
            }
        }
        str.append(']');
        return str.toString();
    }

    @Override
    public @NotNull Iterator<T> iterator() {
        return new ContainerIterator();
    }
    private class ContainerIterator implements Iterator<T> {

        /**
         * метод проверяет существование следуйщего элемента в колекции
         * @return возвращает true если элемент существуею
         */
        @Override
        public boolean hasNext() {
            return currentIndexData < data.length;
        }

        /**
         * метод next() возвращает следующий элемент коллекции
         * Реализация интерфейса Iterator
         * @return возвращает следуйщий элемент поля, если список закончен возвращаем null
         * если дотигнут конец колекции возвращаем null и обнуляем счетчик currentIndexData
         */
        @Override
        public T next() {
            if (!hasNext()) {
                currentIndexData = 0;
                return null;
            } else {
                return data[currentIndexData++];
            }
        }
    }
}

