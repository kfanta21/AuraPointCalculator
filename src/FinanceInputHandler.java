import java.util.Scanner;

public class FinanceInputHandler implements InputHandler<Finance> {
    private final InputUtils inputUtils;

    public FinanceInputHandler(Scanner scanner) { this.inputUtils = new InputUtils(scanner);  }
    @Override
    public Finance collectInput() {
        double daylyIncome, daylyCost, wasted;
        daylyIncome = (inputUtils.getNumber("What is your monthly income?",0,1000000000))/30;
        daylyCost = (inputUtils.getNumber("What is your monthly cost of living?",0,1000000000))/30;
        wasted = inputUtils.getNumber("How much money would you say you unecessarly wasted?",0,1000000000);
        return new Finance(daylyIncome,daylyCost,wasted);
    }
    // Similar pattern with finance-specific questions
}