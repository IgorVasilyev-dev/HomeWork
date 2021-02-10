package HomeWork5.utils;

import HomeWork5.utils.api.IRandom;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class RandomNameFromFile extends StudentRandomName implements IRandom {

    public RandomNameFromFile(Path path) throws IOException {
            String nameList = new String(Files.readAllBytes(path));
        }
    }
