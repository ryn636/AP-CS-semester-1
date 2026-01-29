public class StepTracker {
    int activeSteps;
    int totalSteps;
    int daysTracked;
    int daysActive; 
public StepTracker(int minSteps){
    activeSteps = minSteps;
}
public int activeDays() {  
    return daysActive;
}
public double averageSteps(){
    return (totalSteps/daysTracked);
}
public void addDailySteps(int stepsDaily) {
    daysTracked++;
    if (stepsDaily < activeSteps){
        totalSteps = totalSteps + stepsDaily;
    } else {
        totalSteps = totalSteps + stepsDaily;
        daysActive++;
    }
}
}
