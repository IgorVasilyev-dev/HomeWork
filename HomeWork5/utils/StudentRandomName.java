package HomeWork5.utils;

import HomeWork5.utils.api.IRandom;

public class StudentRandomName extends RandomRand implements IRandom {

    public String[] namesList = { "Анна", "Борис", "Валя", "Вася", "Витя", "Ксения", "Инга",
            "Яна", "Леша", "Вова", "Игрорь", "Андрей"} ;

    @Override
    public String randString(int min, int max) {
       String result;
        int length = randInt(min, max);
        do {
            result = namesList[randInt(0, namesList.length - 1)];
        } while (result.length() != length);
        return result;
    }
}
