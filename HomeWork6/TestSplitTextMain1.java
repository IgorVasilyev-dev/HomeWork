/*
На основании вопросов от студентов рассмотрим некоторые варианты текстов с вариантами разбиения на слова:
	1. "привет, как дела!" - тут три слова "привет", "как", "дела";
	2. "привет,какдела!" - тут два слова "привет", "какдела";
	3. "привет;какдела!" - тут два слова "привет", "какдела";
	4. "как дела!.Что делаешь?"- тут четыре слова "как", "дела", "Что", "делаешь";
	5. "Привет-привет" - тут одно слово "Привет-привет";
	6. "Привет -привет" - тут два слова "Привет", "привет";
	7. "4-х" - тут одно слово "4-х";
	8. "один и 1" - тут три слова "один", "и", "1"
	9. "бабушка бабушке бабушку" - тут три слова "бабушка", "бабушке", "бабушку"
 */
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
