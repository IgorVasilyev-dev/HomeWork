package HomeWork1;

public class DZ1_5_1 implements ICommunicationPrinter {

    @Override
    public String welcome(String name) {
        String welcome = "Я тебя так долго ждал";
        if (name.equals("Вася") || name.equals("Анастасия")) {
            if (name.equals("Вася")) {
                welcome = "Привет!\n" + welcome;
                return welcome;
            }
            return welcome;
        } else {
            return "Добрый день, а вы кто?";
        }
    }
}
