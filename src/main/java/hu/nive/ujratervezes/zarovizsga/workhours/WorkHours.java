package hu.nive.ujratervezes.zarovizsga.workhours;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

public class WorkHours {

    public List<WorkDay> workDays = new ArrayList<>();

    public static final String SEPARATOR = ",";

    public String minWork(String file) {
        try (BufferedReader bufferedReader = Files.newBufferedReader(Path.of(file))) {
            String line;
            while((line = bufferedReader.readLine()) != null) {
                splitTheLines(line);
            }
        }
        catch (IOException ioe) {
            throw new IllegalStateException("Can not read the file!", ioe);
        }

        return lookUpTheLowestWorkHour();
    }

    private void splitTheLines(String line) {
        String[] split = line.split(SEPARATOR);
        workDays.add(new WorkDay(split[0], Integer.parseInt(split[1]), split[2]));
    }

    private String lookUpTheLowestWorkHour() {
        List<WorkDay> result = new ArrayList<>();
        result.add(workDays.get(0));
        for (WorkDay e: workDays) {
            if ( e.getWorkHours() < result.get(0).getWorkHours()) {
                result.remove(0);
                result.add(e);
            }
        }
        return createsTheReturnValue(result);
    }

    private String createsTheReturnValue(List<WorkDay> input) {
        StringBuilder sb = new StringBuilder();
        sb.append(input.get(0).getName());
        sb.append(": ");
        sb.append(input.get(0).getDate());
        return sb.toString();
    }

}