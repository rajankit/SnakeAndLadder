package lldpackage;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Game {
    private Board board;
    private Dice dice;
    private GameStatus status;
    private Queue<Player> players;
    private int winnerCount;

    public Game(Board board, Dice dice) {
        this.board = board;
        this.dice = dice;
        this.status = GameStatus.NOT_STARTED;
        this.players = new LinkedList<Player>();
        this.winnerCount = 1;
    }

    public void addPlayer(Player player) {
        if (this.status == GameStatus.NOT_STARTED || this.status == GameStatus.FINISHED) {
            players.add(player);
        } else {
            System.out.println("Can't add player, game is in progress");
        }
    }

    public void launch() {
        this.status = GameStatus.PROGRESS;
        System.out.println("Starting the game");

        while(players.size() > 1) {
            Player player = players.poll();
            System.out.println("Your current position is: " + player.getPosition());
            System.out.println("Please enter roll the dice: " + player.getName());

            Scanner sc = new Scanner(System.in);
            char c = sc.next().charAt(0);

            int diceValue = makeMove();
            int targetPosition = player.getPosition() + diceValue;
            int totalCells = board.getTotalCells();

            if (totalCells == targetPosition) {
                System.out.println("Winner " + this.winnerCount + " is " + player.getName());
                this.winnerCount++;
            } else if (targetPosition > board.getTotalCells()) {
                System.out.println("No Possible moves");
                players.add(player);
            } else {
                if (board.hasSpecialEntity(targetPosition)) {
                    SpecialEntities entity = board.getSpecialEntity(targetPosition);
                    targetPosition = entity.getEndPos();
                }

                player.setPosition(targetPosition);
                players.add(player);
            }
        }

        this.status = GameStatus.FINISHED;
    }

    public int makeMove() {
        return dice.roll();
    }
}
