public class AtBat {
    public enum Result {
        OUT, SINGLE, DOUBLE, TRIPLE, HOMERUN
    }

    private int numBases;
    private Result theResult;

    public AtBat(Result input) {
        this.theResult = input;
    }

    public int basesEarned(Result input) {
        if (input == Result.SINGLE) {
            return 1;
        }
        else if (input == Result.DOUBLE) {
            return 2;
        }
        else if (input == Result.TRIPLE) {
            return 3;
        }
        else if (input == Result.HOMERUN) {
            return 4;
        }

        return 0;
    }



/*
    int hitCounter;
    int totalCounter;
    double battingAvg;
    double slugPc;
    
    public AtBat() {
        hitCounter = 0;
        totalCounter = 0;
        battingAvg = 0.0;
        slugPc = 0.0;
    }
*/





}
