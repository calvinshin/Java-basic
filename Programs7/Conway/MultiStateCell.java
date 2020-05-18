import java.util.Random;

public class MultiStateCell extends AbstractCell {

    public MultiStateCell(int r, int c, ConwayWorld w) {
        super(r, c, w);
    }

    public boolean willBeAliveInNextGeneration() {
        int nc = neighborCount();
// if the cell is currently alive...
        if (getIsAlive()) {
//            It will persist if it has 1-3 neighbors.
            return nc == 1 || nc == 2 || nc == 3;
        } else {
//  a cell will propogate if it has exactly 3 live neighbors.
            return nc == 3;
        }
    }

    public AbstractCell cellForNextGeneration() {
//      If a cell is alive and dying next generation
        if(!willBeAliveInNextGeneration() && getIsAlive()) {
            //      replace it with a sleepercell
            AbstractCell next = new SleeperCell(getRow(), getColumn(), world);
            return next;
        }
//      else normal rules apply
        else {
            AbstractCell next = new MultiStateCell(getRow(), getColumn(), world);
            next.setIsAlive(willBeAliveInNextGeneration());
            return next;
        }
    }
//used from conway world
    public int neighborCount() {
        int count = 0;

        int row = getRow();
        int column = getColumn();

        for (int dr = -1; dr <= 1; dr++) {
            for (int dc = -1; dc <= 1; dc++) {
                if (world.isAlive(row + dr, column + dc) && !(dr == 0 && dc == 0)) {
                    count++;
                }
            }
        }

        return count;
    }
//   displays the alive/dead states
    public char displayCharacter() {
        if(getIsAlive()) {
            return 'x';
        }
        else {
            return '.';
        }
    }
}

class SleeperCell extends AbstractCell {
    public SleeperCell (int r, int c, ConwayWorld w) {
        super(r, c, w);
    }

//    Always return the next generation as false;
    public boolean willBeAliveInNextGeneration() {
        return false;
    }

//  the cell is returned to its normal multi-state state.
//  All cells returned are in a isAlive = false state
    public AbstractCell cellForNextGeneration() {

//      potentially could insert random here to see if the coordinate is released from the sleeperCell class.
        MultiStateCell next = new MultiStateCell(getRow(), getColumn(), world);
        return next;
    }

//  because the sleeperCell is always in a false state, z should never be returned.
    public char displayCharacter() {
        if(getIsAlive()) {
            return 'z';
        }
        else {
            return ',';
        }
    }

}