# War Card Game Implementation

Gongyu Yan

##
- I changed the CardGame.java file to implement a simple War card game using the LinkedList implementation. I added separate LinkedLists for player hands, also added round-based gameplay aswell as game logic for comparing card values lastly I added game status display and round information

## Game Rules
- The deck is split evenly between two players
- Each round, both players draw their top card
- The player with the higher value card wins the round
- The game continues for 26 rounds (half the deck)

## LinkedList Usage
The game uses LinkedList in three ways:
1. Main deck (cardList) - stores all cards initially
2. Player 1's hand (player1Hand) - stores Player 1's cards
3. Player 2's hand (player2Hand) - stores Player 2's cards

## How to Play
1. Run the CardGame.java file
2. The game automatically simulates 26 rounds
3. Each round shows the cards drawn and the winner
4. The game runs in the console with text output