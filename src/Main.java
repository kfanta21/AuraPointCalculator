// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Boolean liturgy = null;
        int prayers = 4;
        boolean bibleStudy = true;
        boolean reflection = true;
        boolean service = false;
        int midiaHourlyUsage = 1;

        boolean physicalActivity = true;
        int junkFood = 0, sleep = 9;

        double dailyIncome = 100;
        double dailyCost = 90;
        double wasted = 10;

        boolean isDailyGoalSet = true;
        boolean isPriorityGoalCompleted = true;
        boolean isSecondaryGoalCompleted = false;
        boolean isThirdPriorityGoalCompleted = true;
        boolean fullListComplete = false;
        int wastedHourse = 4;

        int timeSpent = 3;
        int affection = 5;
        boolean supportive = true;

        Spirituality spirituality = new Spirituality(liturgy,prayers, bibleStudy, reflection, service, midiaHourlyUsage);
        Health health = new Health(physicalActivity, junkFood, sleep);
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