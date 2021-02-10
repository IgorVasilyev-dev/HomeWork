package HomeWork5;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;

public class test1 {
    public static final String FILE_NAME = "names.txt";

    public static void main(String[] args) {
        try  {
            String[] movies = Files.newBufferedReader(Paths.get(FILE_NAME), StandardCharsets.UTF_8).lines().toArray(String[]::new);
            for (String movie : movies) System.out.println(movie);
        }
        catch ( IOException e ) {
            e.printStackTrace();
        }
    }
}
