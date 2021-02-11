package HomeWork5.core;

public class GlobalCounter {
    private int counter;

    public int get(){
        return this.counter;
    }

    public int getAndInc(){
        return this.counter++;
    }
}
