package HomeWork6;


import HomeWork6.text.api.ITextSpliterator;
import HomeWork6.text.TextSpliterator;

public class TestSplitTextMain1 {
    public static void main(String[] args) {
        String text = "привет, как дела! привет, какдела! привет; какдела! как дела! Что делаешь? " +
                "Привет-привет. Привет -привет. 4-х один и 1 бабушка бабушке бабушку";

        ITextSpliterator spliterator = new TextSpliterator();
        String[] strings = spliterator.split(text);
        System.out.println(text);
        System.out.println("количество слов = " + strings.length);
        for (String string: strings) {
            System.out.println(string);
        }

    }
}
