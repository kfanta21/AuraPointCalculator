public class Career {

    boolean isDailyGoalSet;
    boolean isPriorityGoalCompleted;
    boolean isSecondaryGoalCompleted;

    boolean isThirdPriorityGoalCompleted;
    boolean fullListComplete;
    int wastedHourse;

    //This class seems to harsh for the penalty, but time is the most valuable thing in life, so westing it is indeed harsh
    //Yes some people may work on long term goals without setting a daily goal and setting them might not increase result
            //However not setting goals is indeed beneficial, and you should get rewarded if you do



    Career(boolean isDailyGoalSet, boolean isPriorityGoalCompleted, boolean isSecondaryGoalCompleted,
    boolean isThirdPriorityGoalCompleted,
    boolean fullListComplete, int wastedHourse){
        this.isDailyGoalSet = isDailyGoalSet;
        this.isPriorityGoalCompleted = isPriorityGoalCompleted;
        this.isSecondaryGoalCompleted = isSecondaryGoalCompleted;
        this.isThirdPriorityGoalCompleted = isThirdPriorityGoalCompleted;
        this.fullListComplete = fullListComplete;
        this.wastedHourse = wastedHourse;
    }


    private int calcCareerPoints(){
        int points = 0;
        points += isDailyGoalSet ? 250 : -100;
        points += isPriorityGoalCompleted ? 2000 : -1500;
        points += isSecondaryGoalCompleted ? 1000 : -700;
        points += isThirdPriorityGoalCompleted ? 500 : -300;
        points += fullListComplete ? 300 : -100;
        return points - (wastedHourse*500);
    }

    public void displayTotalPoints() {
        System.out.println("Today's Career Point: " + calcCareerPoints());
    }

    public int getPoints(){
        int points = calcCareerPoints();
        return points;
    }
}
