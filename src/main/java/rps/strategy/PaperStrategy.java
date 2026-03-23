package rps.strategy;

import rps.game.Move;

/**
 * This strategy always returns {@link Move#PAPER}
 */
public class PaperStrategy extends Strategy {

    @Override
    public Move getNextMove() {
        return Move.PAPER;
    }
}
