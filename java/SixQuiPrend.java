

public class SixQuiPrend {

    private static final int NB_CARD_MAX = 104;

    public static int findNumberOfBullHeads(int value) {
        // TODO
        if (value == 55){ return 7;}
        else if (value%10==0){ return 3;}
        else if (value!=100 && value%10 == (value-value%10)/10 ){ return 5;}
        else if (value%5==0){ return 2;}
        else { return 1;}
    }

    public static void gameLoop() {
        for (int cardValue = 1 ; cardValue <= NB_CARD_MAX ; cardValue++) {
            System.out.println(cardValue + " -> " + findNumberOfBullHeads(cardValue));
        }
    }
}
