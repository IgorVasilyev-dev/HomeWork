/*
2.3* Выполнить задание 2.2 иным способом. Создать интерфейс IArraysOperation с методами из задания. Написать 4 отдельных класса и реализовать данный интерфейс:
		2.3.2. WhileOperation - во всех методах можно использовать только while
 */
package HomeWork2.arrays;

public  class ArraysWhileOperation implements IArraysOperation {

    @Override
    public String methodIterate(int[] container) {
        int i = 0;
        StringBuilder str = new StringBuilder();
        str.append("{");
        while (i < container.length) {
            str.append(container[i]);
            if ( i < container.length - 1) {
                str.append(",");
            }
            i++;
        }
        str.append("}");
        return str.toString();
    }

}




