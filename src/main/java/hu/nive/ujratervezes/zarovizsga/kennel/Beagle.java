package hu.nive.ujratervezes.zarovizsga.kennel;

public class Beagle extends Dog {

    public Beagle(String name) {
        super(name);
    }

    @Override
    public void feed() {
        riseHappinessLevel(2);
    }

    @Override
    public void play(int hours) {
        int multiplier = 2;
        riseHappinessLevel(hours * multiplier);
    }

}