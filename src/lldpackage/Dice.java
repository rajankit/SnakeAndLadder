package lldpackage;

import java.util.Random;

public class Dice {
    private int maxValue;

    public Dice(int maxValue) {
        this.maxValue = maxValue;
    }

    public int roll() {
        return (int)Math.floor(Math.random()*this.maxValue + 1);
    }
}
