package rps.strategy;

import rps.game.Move;

import java.util.Random;

/**
 * This strategy always returns a random {@link Move}.
 */
public class RandomStrategy extends Strategy {
    private final Random rnd = new Random();

    @Override
    public Move getNextMove() {
        var values = Move.values();
        int rndNumber = rnd.nextInt(values.length);
        return values[rndNumber];
    }
}
