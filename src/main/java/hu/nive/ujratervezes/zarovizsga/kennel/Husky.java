package hu.nive.ujratervezes.zarovizsga.kennel;

public class Husky extends Dog {

    public Husky(String name) {
        super(name);
    }

    @Override
    public void feed() {
        riseHappinessLevel(4);
    }

    @Override
    public void play(int hours) {
        int multiplier = 3;
        riseHappinessLevel(hours * multiplier);
    }

}