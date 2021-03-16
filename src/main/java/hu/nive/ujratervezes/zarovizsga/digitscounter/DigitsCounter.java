package hu.nive.ujratervezes.zarovizsga.digitscounter;

import java.util.ArrayList;
import java.util.List;

public class DigitsCounter {

    public int getCountOfDigits(String s) {
        if (s == null) {
            return 0;
        }
        List<String> result = new ArrayList<>();
        String[] splitS = s.split("");
        for (int i = 0; i< splitS.length; i++) {
            if (!result.contains(splitS[i]) && splitS[i].matches("[0-9]+")) {
                result.add(splitS[i]);
            }
        }
        return result.size();
    }

}