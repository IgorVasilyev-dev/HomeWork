/*
2.3* Выполнить задание 2.2 иным способом. Создать интерфейс IArraysOperation с методами из задания. Написать 4 отдельных класса и реализовать данный интерфейс:
		2.3.3. ForOperation - во всех методах можно использовать только for
 */
package HomeWork2.arrays;

public  class ArraysForEachOperation implements IArraysOperation {

    @Override
    public String methodIterate(int[] container) {
        StringBuilder str = new StringBuilder();
        int i = 0;
        str.append("{");
        for (Integer e: container) {
            str.append(e);
            if (i < container.length - 1) {
                str.append(",");
            }
            i++;
        }
        str.append("}");
        return str.toString();
    }
}




