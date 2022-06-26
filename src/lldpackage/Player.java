package lldpackage;

public class Player {
    private String name;
    private int position = 1;

    public Player(String playerName) {
        this.name = playerName;
    }

    public String getName() {
        return name;
    }

    public int getPosition() {
        return position;
    }

    public void setPosition(int newPos) {
        this.position = newPos;
    }
}
