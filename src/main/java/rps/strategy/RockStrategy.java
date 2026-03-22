package rps.strategy;

import rps.game.Move;

/**
 * This strategy always returns {@link Move#ROCK}
 */
public class RockStrategy extends Strategy {

    @Override
    public Move getNextMove() {
        return Move.ROCK;
    }
}
