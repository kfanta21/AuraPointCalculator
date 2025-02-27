// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        int activityLevel = 7;
        int junkFood = 0, sleep = 8;

        double dailyIncome = 0;
        double dailyCost = 0;
        double wasted = 0;

        boolean isDailyGoalSet = true;
        boolean isPriorityGoalCompleted = true;
        boolean isSecondaryGoalCompleted = true;
        boolean isThirdPriorityGoalCompleted = true;
        boolean fullListComplete = true;
        int wastedHourse = 10;

        int timeSpent = 2;
        int affection = 5;
        boolean supportive = true;

        Scanner scanner = new Scanner(System.in);
        SpiritualityInputHandler handler = new SpiritualityInputHandler(scanner);

        Spirituality spirituality = handler.collectInput();
        spirituality.displayTotalPoints();

        scanner.close();

        Health health = new Health(activityLevel, junkFood, sleep);
        Finance finance = new Finance(dailyIncome, dailyCost, wasted);
        Carrer carrer = new Carrer(isDailyGoalSet, isPriorityGoalCompleted, isSecondaryGoalCompleted, isThirdPriorityGoalCompleted,
        fullListComplete, wastedHourse);
        Relationship relationship = new Relationship(timeSpent, affection, supportive);

        DailyAura dailyAura = new DailyAura(spirituality, health, finance, carrer, relationship);
        TotalAura totalAura = new TotalAura();
        double todayAura = dailyAura.calculateAura();
        System.out.print("Total Aura Point: " + todayAura);
        //double aura = totalAura.getPoint() + todayAura;

        //System.out.println(aura);
    }


}