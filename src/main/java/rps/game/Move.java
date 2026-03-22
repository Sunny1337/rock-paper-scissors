package rps.game;

import java.util.EnumSet;
import java.util.HashSet;
import java.util.Set;

/**
 * Enum defining the available rock paper scissors moves. Each move maintains a set of other moves it defeats.
 */
public enum Move {
    ROCK,
    PAPER,
    SCISSORS;

    private Set<Move> beats = new HashSet<>();

    static {
        ROCK.beats = EnumSet.of(SCISSORS);
        PAPER.beats = EnumSet.of(ROCK);
        SCISSORS.beats = EnumSet.of(PAPER);
    }

    /**
     * Determines if this move defeats the provided opponent move
     *
     * @param other The opponents move
     * @return true if this move wins - false if it loses or results in a draw.
     */
    public boolean defeats(Move other) {
        return beats.contains(other);
    }

    }

