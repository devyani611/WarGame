## WarGame

### Description of the Game

War Game is a simple card game, typically played by two players using a standard playing card deck.The objective of the game is to win all of the cards.
</br>
The deck is divided evenly among the players, giving each a down stack. In unison, each player reveals the top card of their deck and the player with the higher card takes both of the cards played and moves them to their stack. Aces are high, and suits are ignored.
</br>
If the two cards played are of equal value, then there is a "war".Both players place the next three cards face down and then another card face-up. The owner of the higher face-up card wins the war and adds all the cards on the table to the bottom of their deck(total 10 cards). If the face-up cards are again equal then the battle repeats with another set of face-down/up cards. This repeats until one player's face-up card is higher than their opponent's.

### Assumptions made for the Game

* For the purpose of comparison, ranks are assigned to each card. So 2- 10 ranks are simple number cards and 11 to 13 are Face cards, assigned 14 to the Ace card.
* To represent the suits, 0-3 numbers are used.
* To represent the stack or deck of cards, two linked lists are used each containing randomly shuffled 26 cards for each player.
* Cards are removed from the end of the list (using list.removeLast()) and added to the front of the list(using list.addFirst()).
* While playing the war, if either of the player exhaust all its cards, it loses immediately and the game is over.
* Since, the game involved randomness, it could take many iterations to decide the winner, so for the sake of simplicity MAX_ROUNDS variable has been used that limits the number of rounds to be played (MAX_ROUNDS = 25 have been used in the current set up). At the end of the 25 iterations, the player with the maximum number of cards wins the game.


