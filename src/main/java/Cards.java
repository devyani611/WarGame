//A simple cards class to initialize card object
public class Cards {

    //Need two variables to initialize ranks and suits, example
    //There are 4 suits - diamond, heart, spade and club
    //Rank being 2-10 numbers and then Jack, Queen, King and Ace
    //Assuming Ace is the highest
    private String suit;
    private String rank;

    //variable to get the value of the card that will be used to compare the cards of the two players
    private int value;

    //constructor to initialize variables
    public Cards(String suit, String rank){
        this.suit = suit;
        this.rank = rank;


        if(rank.equals("Jack")){
            value = 11;
        }
        else if(rank.equals("Queen")){
            value = 12;
        }
        else if(rank.equals("King")){
            value = 13;
        }
        else if(rank.equals("Ace")){
            value = 14;
        }
        else{
            value = Integer.valueOf(rank);
        }

    }

    //getter methods
    public String getSuit(){
        return suit;
    }

    public String getRank(){
        return rank;
    }

    public int getValue(){
        return value;
    }


    //setter methods
    public void setSuit(String suit){
        this.suit = suit;
    }

    public void setRank(String rank){
        this.rank = rank;
    }

   public void setValue(int value){
        this.value = value;
    }


    //Method to print the card's attributes like "Ace of spades"
    public String toString(){
        return rank + " " + "of" + " " + suit;
    }
}
