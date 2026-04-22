package org.APCSLowell;
import java.util.ArrayList;

public class StepTracker {
    private int min, days, aDays;
    private ArrayList <Integer> steps;
    public StepTracker(int activityThreshold) {
        min = activityThreshold;
        days = 0;
        aDays = 0;
        steps = new ArrayList<Integer>();
    }
    public void addDailySteps(int stepCount) {
        steps.add(stepCount);
        if (stepCount >= min) {
            aDays++;
        }
        days++;
    }
    public int activeDays() {
        return aDays;
    }
    public double averageSteps() {
        if (days == 0) {
            return 0.0;
        }
        int tot = 0;
        for (int count:steps) {
            tot+=count;
        }
        return (double)tot/days;
    }
}
