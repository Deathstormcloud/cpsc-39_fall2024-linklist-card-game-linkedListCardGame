# War Card Game Implementation

Gongyu Yan

I changed the CardGame.java file to implement a simple War card game using the LinkedList implementation. I added separate LinkedLists for player hands, also added round-based gameplay aswell as game logic for comparing card values lastly I added game status display and round information

 Game Rules
 The deck is split evenly between two players
 Each round, both players draw their top card
 The player with the higher value card wins the round
 The game continues for 26 rounds (half the deck)

 LinkedList Usage
The game uses LinkedList in three ways:
 Main deck (cardList) - stores all cards initially
 Player 1's hand (player1Hand) - stores Player 1's cards
 Player 2's hand (player2Hand) - stores Player 2's cards

 How to Play
 Run the CardGame.java file
 The game automatically simulates 26 rounds
 Each round shows the cards drawn and the winner
 The game runs in the console with text output


Program output

Cards loaded:
List (first-->last): two of spade (Value: 2, Picture: 2s.gif)
three of spade (Value: 3, Picture: 3s.gif)
four of spade (Value: 4, Picture: 4s.gif)
five of spade (Value: 5, Picture: 5s.gif)
six of spade (Value: 6, Picture: 6s.gif)
seven of spade (Value: 7, Picture: 7s.gif)
eight of spade (Value: 8, Picture: 8s.gif)
nine of spade (Value: 9, Picture: 9s.gif)
ten of spade (Value: 10, Picture: ts.gif)
jack of spade (Value: 10, Picture: js.gif)
queen of spade (Value: 10, Picture: qs.gif)
king of spade (Value: 10, Picture: ks.gif)
ace of spade (Value: 11, Picture: as.gif)
two of club (Value: 2, Picture: 2c.gif)
three of club (Value: 3, Picture: 3c.gif)
four of club (Value: 4, Picture: 4c.gif)
five of club (Value: 5, Picture: 5c.gif)
six of club (Value: 6, Picture: 6c.gif)
seven of club (Value: 7, Picture: 7c.gif)
eight of club (Value: 8, Picture: 8c.gif)
nine of club (Value: 9, Picture: 9c.gif)
ten of club (Value: 10, Picture: tc.gif)
jack of club (Value: 10, Picture: jc.gif)
queen of club (Value: 10, Picture: qc.gif)
king of club (Value: 10, Picture: kc.gif)
ace of club (Value: 11, Picture: ac.gif)
two of diamond (Value: 2, Picture: 2d.gif)
three of diamond (Value: 3, Picture: 3d.gif)
four of diamond (Value: 4, Picture: 4d.gif)
five of diamond (Value: 5, Picture: 5d.gif)
six of diamond (Value: 6, Picture: 6d.gif)
seven of diamond (Value: 7, Picture: 7d.gif)
eight of diamond (Value: 8, Picture: 8d.gif)
nine of diamond (Value: 9, Picture: 9d.gif)
ten of diamond (Value: 10, Picture: td.gif)
jack of diamond (Value: 10, Picture: jd.gif)
queen of diamond (Value: 10, Picture: qd.gif)
king of diamond (Value: 10, Picture: kd.gif)
ace of diamond (Value: 11, Picture: ad.gif)
two of heart (Value: 2, Picture: 2h.gif)
three of heart (Value: 3, Picture: 3h.gif)
four of heart (Value: 4, Picture: 4h.gif)
five of heart (Value: 5, Picture: 5h.gif)
six of heart (Value: 6, Picture: 6h.gif)
seven of heart (Value: 7, Picture: 7h.gif)
eight of heart (Value: 8, Picture: 8h.gif)
nine of heart (Value: 9, Picture: 9h.gif)
ten of heart (Value: 10, Picture: th.gif)
jack of heart (Value: 10, Picture: jh.gif)
queen of heart (Value: 10, Picture: qh.gif)
king of heart (Value: 10, Picture: kh.gif)
ace of heart (Value: 11, Picture: ah.gif)

=== WAR CARD GAME ===
Each player draws a card. Higher value wins the round!

ROUND 1
Player 1 drew: king of heart (Value: 10, Picture: kh.gif)
Player 2 drew: ace of heart (Value: 11, Picture: ah.gif)
Player 2 wins the round!

ROUND 2
Player 1 drew: jack of heart (Value: 10, Picture: jh.gif)
Player 2 drew: queen of heart (Value: 10, Picture: qh.gif)
It's a tie!

ROUND 3
Player 1 drew: nine of heart (Value: 9, Picture: 9h.gif)
Player 2 drew: ten of heart (Value: 10, Picture: th.gif)
Player 2 wins the round!

ROUND 4
Player 1 drew: seven of heart (Value: 7, Picture: 7h.gif)
Player 2 drew: eight of heart (Value: 8, Picture: 8h.gif)
Player 2 wins the round!

ROUND 5
Player 1 drew: five of heart (Value: 5, Picture: 5h.gif)
Player 2 drew: six of heart (Value: 6, Picture: 6h.gif)
Player 2 wins the round!

ROUND 6
Player 1 drew: three of heart (Value: 3, Picture: 3h.gif)
Player 2 drew: four of heart (Value: 4, Picture: 4h.gif)
Player 2 wins the round!

ROUND 7
Player 1 drew: ace of diamond (Value: 11, Picture: ad.gif)
Player 2 drew: two of heart (Value: 2, Picture: 2h.gif)
Player 1 wins the round!

ROUND 8
Player 1 drew: queen of diamond (Value: 10, Picture: qd.gif)
Player 2 drew: king of diamond (Value: 10, Picture: kd.gif)
It's a tie!

ROUND 9
Player 1 drew: ten of diamond (Value: 10, Picture: td.gif)
Player 2 drew: jack of diamond (Value: 10, Picture: jd.gif)
It's a tie!

ROUND 10
Player 1 drew: eight of diamond (Value: 8, Picture: 8d.gif)
Player 2 drew: nine of diamond (Value: 9, Picture: 9d.gif)
Player 2 wins the round!
