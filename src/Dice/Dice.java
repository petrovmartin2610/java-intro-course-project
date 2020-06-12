package Dice;
import java.util.concurrent.ThreadLocalRandom;

/**
 * клас, обработващ променлива randNumber, задава й random ст-ст от 1 до 2 чрез setRandomNumber
 * и връща тази ст-ст чрез getRandomNumber
 * @author Martin Petrov
 */
public class Dice {
    private int randNumber;


    public void setRandomNumber() {
        randNumber = ThreadLocalRandom.current().nextInt(1, 2 + 1);
    }

    public int getRandomNumber() {
        return randNumber;
    }

}
