public class Player {
    //isdealer
    public boolean isDealer;

    //sum of cards
    public int cardsSum;

    //is bust
    public boolean isBust;

    //players cards
    public Card[] hand;


    public Player(boolean pisDealer, int pcardsSum, boolean pisBust) {
        isDealer = pisDealer;
        cardsSum = pcardsSum;
        isBust = pisBust;
        hand = new Card[2];

    }

    public void print() {
        if (isDealer == true) {
            System.out.println("The dealer has " + cardsSum + " points.");
        } else {
            System.out.println("The player has " + cardsSum + " points.");
        }
        //TODO: print the hand
        for (int i = 0; i < hand.length; i++) {
            hand[i].print();
        }
        }
    }
