package HomeWork6.task;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class ReadBook {
    private String bookText;
    private String bookName;
    public ReadBook(String dir) {
        try {
            this.bookText = new String(Files.readAllBytes(Path.of(dir)));
            this.bookName = new File(dir).getName();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public String getNameBook() {
        return bookName;
    }
    public String getTextBook() {
        return bookText;
    }

}