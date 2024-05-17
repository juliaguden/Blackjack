public class Card {

    //suit -> spade, hearts, diamond,
    public String suit;

    //value -> 1-11
    public int value;

    //name -> ace, 2, 3...jack, queen, king
    public String name;

    public Card(){


    }

    public void printCard(){

        System.out.println( "the"+ name +" of "+ suit +"  is worth "+ value +" points");
    }

}
