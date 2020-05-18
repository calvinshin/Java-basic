public class BlinkerCell extends AbstractCell {

    public BlinkerCell (int r, int c, ConwayWorld w) {
        super(r, c, w);
        blinker = true;
    }

    public  AbstractCell cellForNextGeneration() {
        return this;
    }

    public boolean willBeAliveInNextGeneration() {
        if (blinker) {
            return false;
        } else {
            return true;
        }
    }

    public boolean getIsAlive() {
        if(blinker) {
            blinker = !blinker;
            return true;
        }
        else {
            blinker = !blinker;
            return false;
        }    }

    private boolean blinker;

    public char displayCharacter() {
        if(getIsAlive()) {
            return 'b';
        }
        else {
            return '.';
        }
    }
}