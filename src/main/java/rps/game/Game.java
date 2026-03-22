package rps.game;

/**
 * A game of rock paper scissors between two {@link Player}s.
 */
public class Game {

    private final Player player1;
    private final Player player2;
    private final GameStatistics gameStatistics;
    private final boolean debug;

    /**
     * Creates a new game instance
     *
     * @param p1 The first participant
     * @param p2 The second participant
     */
    public Game(Player p1, Player p2) {
        this(p1, p2, false);
    }

    /**
     * Creates a new game instance
     *
     * @param p1    The first participant
     * @param p2    The second participant
     * @param debug flag, for extended logging
     */
    public Game(Player p1, Player p2, boolean debug) {
        this.player1 = p1;
        this.player2 = p2;
        this.debug = debug;
        gameStatistics = new GameStatistics(p1.getName(), p2.getName());
    }

    /**
     * Executes a single round and determines the winner. The result of the round updated the {@link GameStatistics}.
     */
    public void playRound() {
        var moveP1 = player1.getNextMove();
        var moveP2 = player2.getNextMove();
        var roundResult = RoundResult.determine(moveP1, moveP2);
        this.gameStatistics.addRound(moveP1, moveP2, roundResult);
        if (debug) this.gameStatistics.printLastRound();
    }

    /**
     * @see GameStatistics#printOverview()
     */
    public void printStatisticOverview() {
        this.gameStatistics.printOverview();
    }
}
