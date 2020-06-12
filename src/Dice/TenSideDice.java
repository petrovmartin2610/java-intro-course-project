package Dice;
import java.util.concurrent.ThreadLocalRandom;

/**
 * клас, обработващ променлива randTenNumber, задава й random ст-ст от 1 до 10 чрез setRandomTenNumber
 * и връща тази ст-ст чрез getRandomNumber
 * @author Martin Petrov
 */
public class TenSideDice {

    private int randTenNumber;

    public void setRandomTenNumber() {
        randTenNumber = ThreadLocalRandom.current().nextInt(1, 10 + 1);

    }

    public int getRandomNumber() {
        return randTenNumber;
    }
}
