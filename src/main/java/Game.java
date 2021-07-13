import java.util.*;

//class containing main method
public class Game {
    public static void main(String[] args) {

        //total number of rounds to be played
        int MAX_ROUNDS = 25;

        //list to store the cards
        List<Cards> Deck = new ArrayList<Cards>();

        //Initialize the strings for suits and ranks
        String suit = "";
        String rank = "";

        //loop for assigning the suits to the cards
        // 0 - 3 for 4 suits
        for(int x = 0; x <= 3; x++){
            if(x == 0){
                suit = "Clubs";
            }
            else if(x == 1){
                suit = "Hearts";
            }
            else if(x == 2){
                suit = "Spades";
            }
            else if(x == 3){
                suit = "Diamonds";
            }

            //loop for assigning the ranks
            for(int y = 2; y <= 14; y++){

               // 2 to 10 will be simply the number cards
               if(y >=2 && y <= 10){
                    rank = "" + y;
                }

               //11 to 13 will be assigned to face cards, with 14 as the ace - the highest card
                else if(y == 11){
                    rank = "Jack";
                }
                else if(y == 12){
                    rank = "Queen";
                }
                else if(y == 13){
                    rank = "King";
                }
               else if(y == 14){
                   rank = "Ace";
               }

               //creating the object of Cards class
                Cards card = new Cards(suit, rank);
               //adding the newly created card into the arrayList
                Deck.add(card);
            }

        }

        Collections.shuffle(Deck, new Random()); //shuffle the deck randomly

        //two separate lists of cards for both players
        LinkedList<Cards> deck1 = new LinkedList<>();
        LinkedList<Cards> deck2 = new LinkedList<>();

        deck1.addAll(Deck.subList(0, 25)); //26 cards for p1
        deck2.addAll(Deck.subList(26, Deck.size()));//26 cards for p2

        //here the main game begins
        //Since the game could be infinite, I have used for loop to limit the number of rounds played between the players
        //here the max rounds played is 25
        for(int i=0; i< MAX_ROUNDS; i++){

            //each player plays one card face up
            Cards p1Card = deck1.removeLast();
            Cards p2Card = deck2.removeLast();

            //display the face up card
            System.out.println("Player 1 plays " + p1Card.toString());
            System.out.println("Player 2 plays " + p2Card.toString());

            //Compare the two cards played by players

            //if player 1 gets higher card
            if(p1Card.getValue() > p2Card.getValue()){
                //add both cards to the bottom of player 1 deck
                deck1.addFirst(p1Card);
                deck1.addFirst(p2Card);
                System.out.println("Player 1 wins the round");
            }

            //player 2 gets higher card
            else if(p1Card.getValue() < p2Card.getValue()){
                //add both cards to the bottom of player 2 deck
                deck2.addFirst(p1Card);
                deck2.addFirst(p2Card);
                System.out.println("Player 2 wins the round");
            }

            //if both the cards match
            else {
                System.out.println("\nBoth cards match, war begins..\n");

                //creating two lists for cards of both players
                List<Cards> war1 = new ArrayList<>();
                List<Cards> war2 = new ArrayList<>();

                //The war can only be completed if each player has enough cards

                int card = 0; // variable for the while loop, each player will draw 4 cards, three face down, one face up
                while(card < 4){

                    //either one player runs out of card is game over, break out of the while loop
                    if(deck1.size() == 0 || deck2.size() == 0 ){
                        break;
                    }

                    //System.out.println("War card for player1 is xx\nWar card for player2 is xx");

                    war1.add(deck1.pop());  //place additional card for war
                    war2.add(deck2.pop());

                    //only compare result when both players have enough cards for war
                    if(war1.size() == 4 && war2.size() == 4 ){
                        //display the war cards from each player
                        //System.out.println("War card for player1 is " + war1.get(3).toString());
                       // System.out.println("War card for player2 is " + war2.get(3).toString());

                        //if player 1 wins the war round
                        if(war1.get(3).getValue() > war2.get(3).getValue()){
                            //player1 get all 10 cards
                            //first add p1card and p2 card in war1
                            war1.add(p1Card);
                            war1.add(p2Card);
                            deck1.addAll(0,war1); //4 cards
                            deck1.addAll(0,war2);//4 cards
                            System.out.println("Player 1 wins the war round\n");
                            break;
                        }//end if

                        //player 2 wins the war round
                        else if(war1.get(3).getValue() < war2.get(3).getValue()){
                            //player2 get all 10 cards
                            war1.add(p1Card);
                            war1.add(p2Card);
                            deck2.addAll(0,war1); //4 cards
                            deck2.addAll(0,war2); // 4 cards
                            System.out.println("Player 2 wins the war round\n");
                            break;
                        }
                        else{
                           System.out.println("\nThe cards are still the same for both players, next round of war begins\n");
                           card = 0; // while loop will be reinitialized
                        } //end else
                    }//end if

                    else
                        card++;

                }//end for

            }//end war round else

            //game over either one player runs out of card(deck size is 0)
            if(deck1.size() == 0 ){
                System.out.println("game over\nPlayer 1 wins the game");
                break;
            }
            else if(deck2.size() == 0){
                System.out.println("game over\nPlayer 2 wins the game");
                break;
            }
        }//end for loop

        if(deck1.size()!=0 && deck2.size()!=0){
            System.out.println("\n25 rounds over, declaring the player with the most cards as the winner\n ");
            if(deck1.size() > deck2.size())
                System.out.println("Player 1 wins the game!!");
            else{
                System.out.println("Player 2 wins the game!!");
            }
        }

    }//end main
}
