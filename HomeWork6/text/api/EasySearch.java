package HomeWork6.text.api;

public class EasySearch implements ISearchEngine{

    @Override
    public long search(String text, String word) {
        int count = 0, fromIndex = 0;

        while ((fromIndex = text.indexOf(word, fromIndex)) != -1 ){

            count++;
            fromIndex++;

        }

        return count;
    }
}
