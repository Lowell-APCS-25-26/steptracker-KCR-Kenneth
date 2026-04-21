package org.APCSLowell;

public class StepTracker {
    private int min, days, aDays;
    private int steps;
    public StepTracker(int activityThreshold) {
        min = activityThreshold;
        days = 0;
        aDays = 0;
        steps = 0;
    }
    public void addDailySteps(int stepCount) {
        steps+=stepCount;
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
        return (double)steps/days;
    }
}
