public class Casino {

    public Card aceOfHearts;
    public Player jai;
    public Player dealer;
    public Card[] deck;

    public static void main(String[] args) {
        Casino X = new Casino();
    }

    public Casino() {
        System.out.println("Welcome to Julia's Casino!");

        deck = new Card[52];


        int door = 0;
        for (int j = 0; j < 4; j++) {
            for (int i = 0; i < 13; i++) {
                aceOfHearts = new Card(i, j);
                //      aceOfHearts.print();
                deck[door] = aceOfHearts;
                door++;
            }
        }
        shuffle();
        printDeck();


        jai = new Player(false, 0, false);
        dealer = new Player(true, 0, false);

        deal();
        jai.print();
        dealer.print();
        checkWinner();
        hit();
    }

    public void deal() {
        //give the player the first and second cards in our deck
        jai.hand[0] = deck[0];
        jai.hand[1] = deck[1];
        jai.cardsSum = jai.hand[0].value + jai.hand[1].value;

        dealer.hand[0] = deck[2];
        dealer.hand[1] = deck[4];
        dealer.cardsSum = dealer.hand[0].value + dealer.hand[1].value;
    }

    public void printDeck() {
        for (int i = 0; i < deck.length; i++) {
            //  System.out.println(deck[i]);
            deck[i].print();
        }
    }

    public void shuffle() {
        //put cards random index
        for (int i = 0; i < 52; i++) {
            int esme = (int) (Math.random() * 52);


            Card temp = deck[i];
            deck[i] = deck[esme];
            deck[esme] = temp;
        }
    }

    public void checkWinner() {
        if (jai.cardsSum == 21) {
            System.out.println("Player has Blackjack!");
            System.out.println("Dealer loses :(");
        }
        if (dealer.cardsSum == 21) {
            System.out.println("Dealer has Blackjack!");
            System.out.println("Player loses :(");
        }
        }
        public void hit() {
            if(jai.cardsSum < 18 ) {
                dealer.hand[5];
            }
        }
    }



