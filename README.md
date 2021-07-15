## WarGame

### Description of the Game

War Game is a simple card game, typically played by two players using a standard playing card deck.The objective of the game is to win all of the cards.
</br>

The deck is divided evenly among the players, giving each a down stack. In unison, each player reveals the top card of their deck and the player with the higher card takes both of the cards played and moves them to their stack. Aces are high, and suits are ignored.
</br>

If the two cards played are of equal value, then there is a "war".Both players place the next three cards face down and then another card face-up. The owner of the higher face-up card wins the war and adds all the cards on the table to the bottom of their deck(total 10 cards). If the face-up cards are again equal then the war repeats with another set of face-down/up cards. This repeats until one player's face-up card is higher than their opponent's.

### Assumptions made for the Game

* For the purpose of comparison, ranks are assigned to each card. So 2- 10 ranks are simple number cards and 11 to 13 are Face cards, assigned 14 to the Ace card.
* To represent the suits, 0-3 numbers are used.
* To represent the stack or deck of cards, two linked lists are used each containing randomly shuffled 26 cards for each player.
* For war round, each player takes out 4 cards from its deck (creating separate lists for playing war), but reveals only the last card.
* Cards are removed from the end of the list (using list.removeLast()) and added to the front of the list(using list.addFirst()).

### Corner Cases

* While playing the war, if either of the player exhaust all its cards, it loses immediately, the other player wins and the game is over.
* If after a war, the cards are still the same for both players, again a war will be played. This is handled by a variable, **war_round**.
* Since, the game involved randomness, it could run for infinite iterations, so for the sake of simplicity MAX_ROUNDS variable has been used that limits the number of rounds to be played (MAX_ROUNDS = 50 have been used in the current set up). At the end of the 50 iterations, the player with the maximum number of cards wins the game.


### Features

* Project is build using Apache Maven.
* Language used is Java 8 with jdk-14.0.1.
* Junit framework is used for writing test cases.
* IntelliJ IDE is used for the implementation.

### To run the project

Follow the below instructions, two players will be initialized and the game will be played either for 50 iterations or if one of the decks becomes empty.

* Clone this repo: $git clone https://github.com/devyani611/WarGame.git
* Open command prompt and run with java: java -Dfile.encoding=UTF-8 -classpath **PATH TO REPO**\target\classes Game
* Replace **PATH TO REPO** in the above command with the path to the repository.

### What might be done differently, if given more time

* **Modularization** - Might have added more classes instead of just two, where the functionalities would be written in 
separate methods, instead of writing everything in main method. This helps to maintain the code effectively when the code grows in the future.
* **Testing** - Modularization also helps in more unit testing, thus making sure each module of the program works as expected.
Thus, more unit testing could be done.
* **Interactivity** - The program could be changed to take user input, thus making it more interactive.
* **Handling corner case after 50 iterations** - The program could be enhanced to handle the case where each player has same number of cards at the end of 50 iterations.



