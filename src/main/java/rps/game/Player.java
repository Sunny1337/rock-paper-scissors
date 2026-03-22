package rps.game;

import rps.strategy.Strategy;

/**
 * A rock paper scissors player, containing a specific {@link Strategy}, which defines his moves.
 */
public class Player {
    private final String name;
    private Strategy strategy;

    /**
     * Creates a new player instance
     *
     * @param name     of the player
     * @param strategy used to determine which {@link Move}s are played
     */
    public Player(String name, Strategy strategy) {
        this.name = name;
        this.strategy = strategy;
    }

    public Move getNextMove() {
        return this.strategy.getNextMove();
    }

    public String getName() {
        return name;
    }

    public void setStrategy(Strategy strategy) {
        this.strategy = strategy;
    }

    @Override
    public String toString() {
        return name;
    }
}


