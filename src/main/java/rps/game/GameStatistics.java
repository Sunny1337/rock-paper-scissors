package rps.game;

import java.util.ArrayList;
import java.util.List;

import static rps.game.RoundResult.*;

/**
 * Statistic object, containing information about a game of rock paper scissors.
 */
public class GameStatistics {

    private final String playerName1;
    private final String playerName2;
    private final List<RoundRecord> rounds = new ArrayList<>();

    public GameStatistics(String playerName1, String playerName2) {
        this.playerName1 = playerName1;
        this.playerName2 = playerName2;
    }

    /**
     * Records a completed round.
     */
    public void addRound(Move p1Move, Move p2Move, RoundResult result) {
        rounds.add(new RoundRecord(rounds.size() + 1, playerName1, playerName2, p1Move, p2Move, result));
    }

    /**
     * Prints information about the last round
     */
    public void printLastRound() {
        if (!rounds.isEmpty()) {
            String headerFormat = "%4s. %8s (%s)\t|\t%8s (%s)\n";
            RoundRecord round = rounds.getLast();
            System.out.printf(headerFormat, round.roundNumber(), round.moveP1(), round.playerName1(), round.moveP2(), round.playerName2());
        }
    }

    /**
     * Prints out a formatted table containing the current win/loss/draw records.
     */
    public void printOverview() {
        int rounds = this.rounds.size();
        long winsPlayerA = getPlayer1Wins();
        long winsPlayerB = getPlayer2Wins();
        long draws = getDraws();
        String headerFormat = "| %-7s | %-10s | %-10s | %-10s |%n";
        String rowFormat = "| %-7d | %-10d | %-10d | %-10d |%n";
        String separator = "+---------+------------+------------+------------+";
        System.out.println(separator);
        System.out.printf(headerFormat, "Rounds", playerName1, playerName2, "Draws");
        System.out.println(separator);
        System.out.printf(rowFormat, rounds, winsPlayerA, winsPlayerB, draws);
        System.out.println(separator);
    }

    public long getPlayer1Wins() {
        return rounds.stream().filter(r -> r.result() == PLAYER_1_WIN).count();
    }

    public long getPlayer2Wins() {
        return rounds.stream().filter(r -> r.result() == PLAYER_2_WIN).count();
    }

    public long getDraws() {
        return rounds.stream().filter(r -> r.result() == DRAW).count();
    }

}
