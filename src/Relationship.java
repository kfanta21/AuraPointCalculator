public class Relationship {
    private int timeSpent;
    private int affection; // {-5,5}
    private boolean supportive;

    Relationship(int timeSpent, int affection, boolean supportive){
        this.timeSpent = timeSpent;
        setAffection(affection);
        this.supportive = supportive;
    }

    private void setAffection(int affection) {
        if (affection < -5) {
            this.affection = -5;  // Cap the value at -5 if too low
        } else if (affection > 5) {
            this.affection = 5;    // Cap the value at 5 if too high
        } else {
            this.affection = affection; // Assign if within range
        }
    }

    public int getPoints(){
        int points = qualityTime() + affectionPoints() + supportivePoints();
        System.out.println("Today's Relationship Points: "+points);
        return points;
    }

    private int qualityTime(){
        if(timeSpent == 0){ return -500; }
        else if (timeSpent == 1){ return 0; }
        else if(timeSpent == 2 || timeSpent == 3){ return 400;}
        else { return 100; }
    }

    private int affectionPoints(){
        return affection * 100;
    }
    private int supportivePoints(){
        return supportive ? 200 : -200;
    }
}
