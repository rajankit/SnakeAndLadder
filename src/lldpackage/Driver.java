package lldpackage;

public class Driver {

    public static void main(String[] args) {
        Dice dice = new Dice(6);
        Board board = new Board(10);

        SpecialEntities snake1 = new Snake(25, 10);
        SpecialEntities snake2 = new Snake(22, 16);
        SpecialEntities ladder1 = new Ladder(5, 12);
        SpecialEntities ladder2 = new Ladder(11, 80);

        board.addSpecialEntity(snake1);
        board.addSpecialEntity(snake2);
        board.addSpecialEntity(ladder1);
        board.addSpecialEntity(ladder2);

        Player player1 = new Player("Ankit");
        Player player2 = new Player("Komal");

        Game game = new Game(board, dice);

        game.addPlayer(player1);
        game.addPlayer(player2);

        game.launch();
    }
}