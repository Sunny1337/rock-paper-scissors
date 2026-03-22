package rps.game;

/**
 * Stores details of a single round.
 */
public record RoundRecord(int roundNumber, String playerName1, String playerName2, Move moveP1, Move moveP2, RoundResult result) {
}
