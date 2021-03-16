package hu.nive.ujratervezes.zarovizsga.workhours;

public class WorkDay {

    private String name;
    private int workHours;
    private String date;

    public WorkDay(String name, int workHours, String date) {
        this.name = name;
        this.workHours = workHours;
        this.date = date;
    }

    public String getName() {
        return name;
    }

    public int getWorkHours() {
        return workHours;
    }

    public String getDate() {
        return date;
    }

}