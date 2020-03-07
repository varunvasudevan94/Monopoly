import java.util.Random;

final public class Dice {
    private int currentValue = 0;
    private Random rand = new Random();
    private int generateDiceValue() {
        // Generate number between 1 - 6
        return 1 + rand.nextInt(6);
    }

    public void rollDice() {
        int nextDiceValue = generateDiceValue();
        setCurrentValue(nextDiceValue);
    }

    private void setCurrentValue(int currentValue) {
        this.currentValue = currentValue;
    }

    public int getCurrentValue() {
        if (currentValue == 0){
            System.out.println("Dice not rolled even once, rolling it now");
            rollDice();
        }
        return currentValue;
    }
}
