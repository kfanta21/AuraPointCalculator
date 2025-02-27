public class Health {
    private int activityLevel; // 0 = No Activity, 1 = Light, 2 = Moderate, 3 = Intense
    private int junkFood;
    private int sleep;

    Health(int activityLevel, int junkFood, int sleep){
        setActivityLevel(activityLevel);
        this.junkFood = junkFood;
        this.sleep = sleep;
    }

    private void setActivityLevel(int activityLevel) {
        if (activityLevel < 0) this.activityLevel = 0;
        else if (activityLevel > 3) this.activityLevel = 3;
        else this.activityLevel = activityLevel;
    }

    public double getPoints(){
        int points = 0;

        // Physical Activity Scoring
        if (activityLevel == 0) {
            points -= 500; // No Activity
        } else if (activityLevel == 1) {
            points += 250; // Light Activity
        } else if (activityLevel == 2) {
            points += 500; // Moderate Activity
        } else {
            points += 750; // Intense Activity
        }

        //Junk Food
        if(junkFood <= 3){
            points += (junkFood * -250);
        } else points += (junkFood * -400);

        if (sleep >= 6 && sleep <= 9) {
            points += (sleep * 50);
        } else if(sleep <= 5) {
            points += (-200) + (sleep * 50);
        } else{
            points += 400;
        }
        System.out.println("Today's Health Points: " + points);
        return points;
    }
}
