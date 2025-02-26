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
        int junkFood = 1, sleep = 7;

        double dailyIncome = 0;
        double dailyCost = 74;
        double wasted = 0;

        boolean isPriorityGoalCompleted = false;
        boolean isSecondaryGoalCompleted = true;

        boolean isThirdPriorityGoalCompleted = false;
        boolean fullListComplete = false;

        Spirituality spirituality = new Spirituality(liturgy,prayers, bibleStudy, reflection, service, midiaHourlyUsage);
        Health health = new Health(physicalActivity, junkFood, sleep);
        Finance finance = new Finance(dailyIncome, dailyCost, wasted);
        Carrer carrer = new Carrer(isPriorityGoalCompleted, isSecondaryGoalCompleted, isThirdPriorityGoalCompleted,
        fullListComplete);
        Relationship relationship = new Relationship();

        DailyAura dailyAura = new DailyAura(spirituality, health, finance, carrer, relationship);
        TotalAura totalAura = new TotalAura();
        double todayAura = dailyAura.calculateAura();
        System.out.print("Total Aura Point: " + todayAura);
        //double aura = totalAura.getPoint() + todayAura;

        //System.out.println(aura);
    }
}