package lldpackage;

public class Snake extends SpecialEntities {
    public Snake(int start, int end) {
        super(start, end);
    }

    @Override
    public String getId() {
        return "S_" + this.getEndPos();
    }
}
