package HomeWork5.core.random;

import java.util.concurrent.ThreadLocalRandom;

//https://stackoverflow.com/questions/363681/how-do-i-generate-random-integers-within-a-specific-range-in-java
public class Java8Random extends FakeRandom{
    public int randInt(int min, int max) {
        return ThreadLocalRandom.current().nextInt(min, max + 1);
    }
}
