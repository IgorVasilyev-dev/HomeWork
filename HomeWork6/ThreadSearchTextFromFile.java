package HomeWork6;

import HomeWork6.task.LogFile;
import HomeWork6.task.ReadBook;
import HomeWork6.task.Task;
import HomeWork6.text.SearchEngineIgnoreRegistry;

import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ThreadSearchTextFromFile {
    public static void main(String[] args) {
        ExecutorService executorService = Executors.newCachedThreadPool();
        LogFile logFile = new LogFile("result.txt");

        Scanner scanner = new Scanner(System.in);
        String dir = "";
        try {
            do {
                System.out.println("Введите адрес считываемой папки");
                dir = scanner.nextLine();

            } while (dir.equals(""));
            File dirPath = new File(dir);
            if (!dirPath.isDirectory()) {
                throw new IllegalArgumentException();
            }
        } catch (IllegalArgumentException argumentException) {
            System.out.println("не верный путь");
        }

        List<ReadBook> readBook = new ArrayList<>();
        for (File file : new File(dir).listFiles()) {
            if (!file.isDirectory()) {
                readBook.add(new ReadBook(file.getAbsolutePath()));
                System.out.println(file.getAbsolutePath());
            }
        }

        boolean flag = false;
        do {
            System.out.print("Введите слово для поиска или exit: ");
            String searchWord = scanner.nextLine();

            if (!searchWord.equals("exit")) {
                for (ReadBook book : readBook) {
                    executorService.submit(new Task(book, searchWord, logFile, new SearchEngineIgnoreRegistry()));
                }
            } else {
                flag = true;
            }
        } while (!flag);
        logFile.kill();

        executorService.shutdown();

    }

}
