//A simple cards class to initialize card object
public class Cards {

    //Need two variables to initialize ranks and suits, example
    //There are 4 suits - diamond, heart, spade and club
    //Rank being 2-10 numbers and then Jack, Queen, King and Ace
    //Assuming Ace is the highest

    private String suit;
    private String rank;

    //constructor to initialize variables
    public Cards(String suit, String rank){
        this.suit = suit;
        this.rank = rank;

    }

    //getter methods for suits and ranks
    public String getSuit(){
        return suit;
    }

    public String getRank(){
        return rank;
    }

    //setter methods for suits and ranks
    public void setSuit(String suit){
        this.suit = suit;
    }

    public void setRank(String rank){
        this.rank = rank;
    }


    //Method to print the card's attributes like "Ace of spades"
    public String toString(){
        return rank +"" + "of" + " " + suit;
    }
}
