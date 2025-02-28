import java.util.Scanner;

public class SpiritualityInputHandler {

    private final Scanner scanner;
    private final InputUtils inputUtils;

    public SpiritualityInputHandler(Scanner scanner) {
        this.inputUtils = new InputUtils(scanner);
        this.scanner = scanner;
    }

    public Spirituality collectInput() {
        return new Spirituality(
                determineLiturgyStatus(getDayOfWeek()),
                inputUtils.getNumber("How many times did you pray today?", 0, 7),
                inputUtils.getYesNo("Did you read your bible? (Yes/No)"),
                inputUtils.getYesNo("Did you reflect on your day? (Yes/No)"),
                inputUtils.getYesNo("Did you do any service today? (Yes/No)"),
                inputUtils.getNumber("How many hours did you spend on entertainment?", 0, 24)
        );
    }

    private int getDayOfWeek() {
        while (true) {
            System.out.println("Enter day (1-7):\n1. Monday ... 7. Sunday");
            String input = scanner.nextLine();
            try {
                int day = Integer.parseInt(input);
                if (day >= 1 && day <= 7) return day;
            } catch (NumberFormatException ignored) {}
            System.out.println("Invalid input. Please enter 1-7.");
        }
    }

    private LiturgyStatus determineLiturgyStatus(int day) {
        if (day != 7) return LiturgyStatus.NOT_APPLICABLE;

        while (true) {
            System.out.println("Did you attend church? (Yes/No)");
            String response = scanner.nextLine().trim().toLowerCase();
            if (response.equals("yes")) return LiturgyStatus.ATTENDED;
            if (response.equals("no")) return LiturgyStatus.NOT_ATTENDED;
            System.out.println("Please answer Yes or No.");
        }
    }
}