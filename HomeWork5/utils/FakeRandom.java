package HomeWork5.utils;

import HomeWork5.utils.api.IRandom;

public class FakeRandom implements IRandom {

    @Override
    public int randInt(int min, int max) {
        return 0;
    }

    @Override
    public double randDouble(double min, double max) {
        return 0;
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
