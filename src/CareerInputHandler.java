import java.util.Scanner;

public class CareerInputHandler implements InputHandler<Career>{
    private final InputUtils inputUtils;

    public CareerInputHandler(Scanner scanner) {
        this.inputUtils = new InputUtils(scanner);
    }

    @Override
    public Career collectInput() {
        boolean isDailyGoalSet, isPriorityGoalCompleted, isSecondaryGoalCompleted,
                isThirdPriorityGoalCompleted, isFullListComplete;
        int wastedHourse;
        isDailyGoalSet = inputUtils.getYesNo("Did you set a daily goal today?");
        isPriorityGoalCompleted = inputUtils.getYesNo("Did you work on your first priority goal?");
        isSecondaryGoalCompleted = inputUtils.getYesNo("Did you work on your second priority goal?");
        isThirdPriorityGoalCompleted = inputUtils.getYesNo("How about the Third one?");
        if (!isPriorityGoalCompleted || !isSecondaryGoalCompleted || !isThirdPriorityGoalCompleted)
            isFullListComplete = false;
        else
            isFullListComplete = inputUtils.getYesNo("Did you complete the full list of the things you set out to do today?");
        wastedHourse = inputUtils.getNumber("How many hours of the day would you say was wasted", 0, 24);
        return new Career(
                isDailyGoalSet, isPriorityGoalCompleted, isSecondaryGoalCompleted,
                isThirdPriorityGoalCompleted, isFullListComplete, wastedHourse
                );
    }
}
