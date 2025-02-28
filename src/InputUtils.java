import java.util.Scanner;

public class InputUtils {
    private final Scanner scanner;

    public InputUtils(Scanner scanner) {
        this.scanner = scanner;
    }

    public int getNumber(String prompt, int min, int max) {
        while (true) {
            System.out.println(prompt);
            try {
                int value = Integer.parseInt(scanner.nextLine());
                if (value >= min && value <= max) return value;
            } catch (NumberFormatException e) {
                System.out.printf("Please enter a valid number between %d and %d", min, max);
            }
        }
    }

    public boolean getYesNo(String prompt) {
        while (true) {
            System.out.println(prompt);
            String response = scanner.nextLine().trim().toLowerCase();
            if (response.equals("yes")) return true;
            if (response.equals("no")) return false;
            System.out.println("Please answer 'yes' or 'no'");
        }
    }
}