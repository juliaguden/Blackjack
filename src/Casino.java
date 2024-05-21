public class Casino {

    public Card aceOfHearts;
    public Card[] deck;

    public static void main(String[] args) {
        Casino X = new Casino();
    }
    public Casino(){
        System.out.println("Welcome to Julia's Casino!");

        deck  = new Card [52];


    for(int j = 0; j <= 4; j++) {
        for (int i = 0; i < 13; i++) {
            aceOfHearts = new Card(i, j);
      //      aceOfHearts.print();
            deck[door] = aceOfHearts;
        }
    }
    printDeck();
}
public void printDeck(){
        for(int i = 0; i< deck.length; i++){
            System.out.println(deck[i]);
        }
}

}

