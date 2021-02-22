package HomeWork5.core.random.api;

public interface IRandomTextSpliterator extends IRandom {
    /**
     * Метод разбивает строку на элементы
     * @param text строка
     * @return возвращает массив элементов
     */
    String[] split(String text);

}
