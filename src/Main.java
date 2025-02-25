// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Boolean liturgy = true;
        int prayers = 3;
        boolean bibleStudy = true;
        boolean reflection = true;
        boolean service = true;
        int midiaHourlyUsage = 0;

        boolean physicalActivity = true;
        int junkFood = 0, sleep = 8;

        Spirituality spirituality = new Spirituality(liturgy,prayers, bibleStudy, reflection, service, midiaHourlyUsage);
        Health health = new Health(physicalActivity, junkFood, sleep);
        Finance finance = new Finance();
        Carrer carrer = new Carrer();
        Relationship relationship = new Relationship();

        DailyAura dailyAura = new DailyAura(spirituality, health, finance, carrer, relationship);
        TotalAura totalAura = new TotalAura();
        double todayAura = dailyAura.calculateAura();
        System.out.print("Total Aura Point: " + todayAura);
        //double aura = totalAura.getPoint() + todayAura;

        //System.out.println(aura);
    }
}