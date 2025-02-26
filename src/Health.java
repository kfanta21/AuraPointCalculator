public class Health {
    private boolean physicalActivity;
    private int junkFood;
    private int sleep;

    Health(boolean physicalActivity, int junkFood, int sleep){
        this.physicalActivity = physicalActivity;
        this.junkFood = junkFood;
        this.sleep = sleep;
    }

    public double getPoints(){
        int points = 0;
        if (physicalActivity){
            points += 750;
        } else { points -= 250;}

        points += (junkFood * -400);
        if (sleep >= 6 && sleep <= 9) {
            points += (sleep * 100);
        } else if(sleep <= 5) {
            points += (-400) + (sleep * 100);
        } else{
            points += 600;
        }
        System.out.println("Today's Health Points: " + points);
        return points;
    }
}
