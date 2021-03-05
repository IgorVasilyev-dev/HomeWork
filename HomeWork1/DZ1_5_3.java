package HomeWork1;

public class DZ1_5_3 implements ICommunicationPrinter{

    @Override
    public String welcome(String name) {
        String welcome = "Добрый день, а вы кто?";
        switch (name) {
            case "Вася":
                welcome = "Привет!\n" + "Я тебя так долго ждал";
                break;
            case "Анастасия":
                welcome = "Я тебя так долго ждал";
                break;
        }
        return welcome;
    }
}