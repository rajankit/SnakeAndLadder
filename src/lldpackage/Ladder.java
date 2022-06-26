package lldpackage;

public class Ladder extends SpecialEntities {
    public Ladder(int start, int end) {
        super(start, end);
    }

    @Override
    public String getId() {
        return "L_" + this.getEndPos();
    }
}
