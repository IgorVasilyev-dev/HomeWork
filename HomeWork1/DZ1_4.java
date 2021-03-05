package HomeWork1;


public class DZ1_4 {
    public static void main(String[] args) {
        boolean weekday = true ;
        boolean vacation = false ;
        if (sleepIn(weekday, vacation)) {
            System.out.println("можем спать дальше");
        } else
            System.out.println("Пора идти на работу");
    }
    public static boolean sleepIn(boolean weekday, boolean vacation) {
        return !weekday || vacation;
    }
}
