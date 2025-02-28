import java.util.Scanner;

public class HealthInputHandler implements InputHandler<Health> {
    private final InputUtils inputUtils;

    public HealthInputHandler(Scanner scanner) {
        this.inputUtils = new InputUtils(scanner);
    }

    @Override
    public Health collectInput() {
        int activity = inputUtils.getNumber("Activity level (0-3):\n 0 = No Activity," +
                " 1 = Light Activity, 2 = Moderate Workout, 3 = Intense Workout", 0, 3);

        int junkFood = inputUtils.getNumber("Junk food servings: ", 0, 10);
        int sleep = inputUtils.getNumber("Hours slept: ", 0, 24);

        return new Health(activity, junkFood, sleep);
    }
}