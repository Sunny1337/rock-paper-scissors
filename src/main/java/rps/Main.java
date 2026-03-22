package rps;

import rps.game.Game;
import rps.game.Player;
import rps.strategy.RandomStrategy;
import rps.strategy.RockStrategy;

/**
 * The Main class
 */
public class Main {

    public static void main(String[] args) {
        int playCount = 100;
        var player1 = new Player("Player A", new RockStrategy());
        var player2 = new Player("Player B", new RandomStrategy());
        var game = new Game(player1, player2);
        for (int i = 0; i < playCount; i++) {
            game.playRound();
        }
        game.printStatisticOverview();
    }
}