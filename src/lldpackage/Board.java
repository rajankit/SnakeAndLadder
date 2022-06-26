package lldpackage;

import java.util.HashMap;
import java.util.List;

public class Board {
    private int dimension;
    private HashMap<Integer, SpecialEntities> specialEntitiesHashMap;

    public Board(int dimension) {
        this.dimension = dimension;
        this.specialEntitiesHashMap = new HashMap<Integer,SpecialEntities>();
    }

    public void printBoard() {
        int maxPos = this.dimension;
        for(int  i = 0; i < this.dimension; i++) {
            for(int j = 0; j < this.dimension; j++) {
                System.out.print(maxPos + " ");
                maxPos--;
            }

            System.out.println();
        }
    }

    public void addSpecialEntity(SpecialEntities specialEntity) {
        int actionPosition = specialEntity.getActionPos();
        specialEntitiesHashMap.put(actionPosition, specialEntity);
    }

    public int getTotalCells () {
        return (int)Math.pow(this.dimension, 2);
    }

    public boolean hasSpecialEntity(int targetPosition) {
        return specialEntitiesHashMap.containsKey(targetPosition);
    }

    public SpecialEntities getSpecialEntity(int targetPosition) {
        return specialEntitiesHashMap.get(targetPosition);
    }
}
