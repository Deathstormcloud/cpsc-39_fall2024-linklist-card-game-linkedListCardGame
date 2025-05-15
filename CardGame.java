import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class CardGame {
    private static LinkList cardList = new LinkList();  // deck
    private static LinkList player1Hand = new LinkList(); // player 1's cards
    private static LinkList player2Hand = new LinkList(); // player 2's cards
    
    public static void main(String[] args) {
        // File name to read from
        String fileName = "cards.txt"; // Ensure the file is in the working directory or specify the full path

        // Read the file and create Card objects
        try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {
            String line;
            while ((line = br.readLine()) != null) {
                // Split the line into components
                String[] details = line.split(","); // Assuming comma-separated values
                if (details.length == 4) {
                    // Parse card details
                    String suit = details[0].trim();
                    String name = details[1].trim();
                    int value = Integer.parseInt(details[2].trim());
                    String pic = details[3].trim();

                    // Create a new Card object
                    Card card = new Card(suit, name, value, pic);

                    // Add the Card object to the list
                    cardList.add(card);
                } else {
                    System.err.println("Invalid line format: " + line);
                }
            }
        } catch (IOException e) {
            System.err.println("Error reading file: " + e.getMessage());
        }

        // Print the loaded cards
        System.out.println("Cards loaded:");
        cardList.displayList();

        // Deal cards to players
        int totalCards = 52; // standard deck
        for(int i = 0; i < totalCards; i++) {
            if(i % 2 == 0) {
                player1Hand.add(cardList.getFirst());
            } else {
                player2Hand.add(cardList.getFirst());
            }
        }

        // Play game
        int rounds = 0;
        int maxRounds = 26; // half the deck
        
        System.out.println("=== WAR CARD GAME ===");
        System.out.println("Each player draws a card. Higher value wins the round!");
        
        while(rounds < maxRounds) {
            rounds++;
            System.out.println("\nROUND " + rounds);
            
            Card p1Card = player1Hand.getFirst();
            Card p2Card = player2Hand.getFirst();
            
            System.out.println("Player 1 drew: " + p1Card);
            System.out.println("Player 2 drew: " + p2Card);
            
            if(p1Card.getCardValue() > p2Card.getCardValue()) {
                System.out.println("Player 1 wins the round!");
            } else if(p2Card.getCardValue() > p1Card.getCardValue()) {
                System.out.println("Player 2 wins the round!");
            } else {
                System.out.println("It's a tie!");
            }
            
            // Add small delay between rounds
            try {
                Thread.sleep(1000);
            } catch(InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }
        
        System.out.println("\nGame Over!");
    }
}
