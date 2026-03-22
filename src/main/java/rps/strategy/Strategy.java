package rps.strategy;

import rps.game.Move;

/**
 * An abstract strategy for defining the next {@link Move}.
 */
public abstract class Strategy {
    public abstract Move getNextMove();
}
