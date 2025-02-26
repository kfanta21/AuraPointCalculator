public class Finance {

    private double daylyIncome;
    private double daylyCost; //for expenses that are monthly, divide it by 30 days to determine the daily cost of living
    private double wasted;

    Finance(double dailyIncome, double dailyCost, double wasted){
        this.daylyIncome = dailyIncome;
        this.daylyCost = dailyCost;
        this.wasted = wasted;
    }
    private double netIncome(){
        return daylyIncome - daylyCost;
    }

    //Wastfull money will punish points 10-fold
    private double totalPoints(){
        return netIncome() - (wasted*10);
    }

    public double getPoints(){
        double points = totalPoints() * 10;
        System.out.println("Today's Finance Point: " + points);
        return points;
    }
}
