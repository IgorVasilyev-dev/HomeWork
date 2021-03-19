/*
2.3* Выполнить задание 2.2 иным способом. Создать интерфейс IArraysOperation с методами из задания. Написать 4 отдельных класса и реализовать данный интерфейс:
		2.3.1. DoWhileOperation - во всех методах можно использовать только do....while
 */
package HomeWork2.arrays;

public  class ArraysDoWhileOperation implements IArraysOperation {

    @Override
    public String methodIterate(int[] container) {
        StringBuilder str = new StringBuilder();
        int i = 0;
        str.append("{");
        try {
            do {
                str.append(container[i]);
                if (i < container.length - 1) {
                    str.append(",");
                }
                i++;
            } while (i < container.length);
        } catch (ArrayIndexOutOfBoundsException ignored) {}
        str.append("}");
        return str.toString();
    }
}




