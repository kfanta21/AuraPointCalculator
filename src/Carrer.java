public class Carrer {

    boolean isDailyGoalSet;
    boolean isPriorityGoalCompleted;
    boolean isSecondaryGoalCompleted;

    boolean isThirdPriorityGoalCompleted;
    boolean fullListComplete;
    int wastedHourse;

    //This class seems to harsh for the penalty, but time is the most valuable thing in life, so westing it is indeed harsh
    //Yes some people may work on long term goals without setting a daily goal and setting them might not increase result
            //However not setting goals is indeed beneficial, and you should get rewarded if you do



    Carrer(boolean isDailyGoalSet, boolean isPriorityGoalCompleted, boolean isSecondaryGoalCompleted,
    boolean isThirdPriorityGoalCompleted,
    boolean fullListComplete, int wastedHourse){
        this.isDailyGoalSet = isDailyGoalSet;
        this.isPriorityGoalCompleted = isPriorityGoalCompleted;
        this.isSecondaryGoalCompleted = isSecondaryGoalCompleted;
        this.isThirdPriorityGoalCompleted = isThirdPriorityGoalCompleted;
        this.fullListComplete = fullListComplete;
        setWastedHourse(wastedHourse);
    }

    private void setWastedHourse(int wastedHourse){
        if(wastedHourse > 24) {this.wastedHourse = 24;}
        else if (wastedHourse < 0) {this.wastedHourse = 0;}
        else this.wastedHourse = wastedHourse;
    }

    private double calcCarrerProgress(){
        double points = 0.0;
        if(isDailyGoalSet){ points += 250;} else {points -= 100;}
        if(isPriorityGoalCompleted){points += 2000;} else {points -= 1500;}
        if(isSecondaryGoalCompleted){points += 1000;} else {points -= 700;}
        if(isThirdPriorityGoalCompleted){points += 500;} else {points -= 300;}
        if(fullListComplete){ points += 300;} else { points -= 100;}
        return points - (wastedHourse*500);
    }

    public double getPoints(){
        double points = calcCarrerProgress();
        System.out.println("Today's Carrer Points: " + points);
        return points;
    }
}
