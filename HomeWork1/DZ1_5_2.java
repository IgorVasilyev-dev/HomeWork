package HomeWork1;

public class DZ1_5_2 implements ICommunicationPrinter {

    @Override
    public String welcome(String name) {
        String welcome = "Я тебя так долго ждал";
        if (name.equals("Вася")) {
            welcome = "Привет!\n" + welcome;
            return welcome;
        } else if (name.equals("Анастасия")) {
            return welcome;
        } else
            return "Добрый день, а вы кто?";
    }
}