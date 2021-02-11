package HomeWork5.core.random;

import HomeWork5.core.random.api.IRandom;

//TODO Надо реализовать нормальные рандом
public class FakeRandom implements IRandom {
    @Override
    public int randInt(int min, int max) {
        return 13;
    }

    @Override
    public double randDouble(double min, double max) {
        return 9;
    }

    @Override
    public String randString(int min, int max) {
        return "Привет";
    }

    @Override
    public boolean randBoolean() {
        return false;
    }
}
