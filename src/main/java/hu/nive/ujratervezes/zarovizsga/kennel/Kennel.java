package hu.nive.ujratervezes.zarovizsga.kennel;

import java.util.ArrayList;
import java.util.List;

public class Kennel {

    List<Dog> dogs = new ArrayList<>();

    public void addDog(Dog dog) {
        dogs.add(dog);
    }

    public void feedAll() {
        for (Dog e: dogs) {
            e.feed();
        }
    }

    public Dog findByName(String name) {
        for (Dog e: dogs) {
            if (e.getName().equals(name)) {
                return e;
            }
        }
        throw new IllegalArgumentException("No dog can be fount with this name --> " + name);
    }

    public void playWith(String name, int hours) {
        findByName(name).play(hours);
    }

    public List<String> getHappyDogNames(int minHappiness) {
        List<String> result = new ArrayList<>();
        for (Dog e: dogs) {
            if (e.getHappiness() > minHappiness) {
                result.add(e.getName());
            }
        }
        return result;
    }

    public List<Dog> getDogs() {
        return dogs;
    }

}