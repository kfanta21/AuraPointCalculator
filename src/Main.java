// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        int timeSpent = 2;
        int affection = 5;
        boolean supportive = true;

        Scanner scanner = new Scanner(System.in);

        SpiritualityInputHandler handler = new SpiritualityInputHandler(scanner);
        Spirituality spirituality = handler.collectInput();
        spirituality.displayTotalPoints();

        HealthInputHandler healthInputHandler = new HealthInputHandler(scanner);
        Health health = healthInputHandler.collectInput();
        health.displayTotalPoints();

        CareerInputHandler careerInputHandler = new CareerInputHandler(scanner);
        Career career = careerInputHandler.collectInput();
        career.displayTotalPoints();

        FinanceInputHandler financeInputHandler = new FinanceInputHandler(scanner);
        Finance finance = financeInputHandler.collectInput();
        finance.displayTotalPoints();

        scanner.close();

        Relationship relationship = new Relationship(timeSpent, affection, supportive);

        DailyAura dailyAura = new DailyAura(spirituality, health, finance, career, relationship);
        TotalAura totalAura = new TotalAura();
        double todayAura = dailyAura.calculateAura();
        System.out.print("Total Aura Point: " + todayAura);
        //double aura = totalAura.getPoint() + todayAura;

        //System.out.println(aura);
    }


}