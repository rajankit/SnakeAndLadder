package lldpackage;

public abstract class SpecialEntities {
    private int start;
    private int end;

    public abstract String getId();

    public SpecialEntities(int start, int end) {
        this.start = start;
        this.end = end;
    }

    public int getActionPos() {
        return this.start;
    }

    public int getEndPos() {
        return this.end;
    }
}
