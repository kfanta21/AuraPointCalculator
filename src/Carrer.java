public class Carrer {
    boolean isDailyGoalSet;
    boolean isPriorityGoalCompleted;
    boolean isSecondaryGoalCompleted;

    boolean isThirdPriorityGoalCompleted;
    boolean fullListComplete;



    Carrer(boolean isPriorityGoalCompleted, boolean isSecondaryGoalCompleted,
    boolean isThirdPriorityGoalCompleted,
    boolean fullListComplete){
    }

    private double calcCarrerProgress(){
        double points = 0.0;
        if(isDailyGoalSet){ points += 100;} else {points -= 500;}
        if(isPriorityGoalCompleted){points += 1000;} else {points -= 1000;}
        if(isSecondaryGoalCompleted){points += 500;} else {points -= 500;}
        if(isThirdPriorityGoalCompleted){points += 300;} else {points -= 300;}
        if(fullListComplete){ points += 300;} else { points -= 100;}
        return points;
    }
    public double getPoints(){
        double points = calcCarrerProgress();
        System.out.println("Today's Carrer Points: " + points);
        return points;
    }
}
