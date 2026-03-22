package rps.game;

/**
 * Possible results of a round.
 */
public enum RoundResult {
    PLAYER_1_WIN,
    PLAYER_2_WIN,
    DRAW;

    public static RoundResult determine(Move move1, Move move2) {
        if (move1 == move2) return DRAW;
        return move1.defeats(move2) ? PLAYER_1_WIN : PLAYER_2_WIN;
    }
}
