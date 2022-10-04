/*Write a Program DeckOfCards.java, to initialize deck of cards having suit
("Clubs", "Diamonds", "Hearts", "Spades") & Rank ("2", "3", "4", "5", "6", "7", "8",
"9", "10", "Jack", "Queen", "King", "Ace"). Shuffle the cards using Random
method and then distribute 9 Cards to 4 Players and Print the Cards received by
the 4 Players using 2D Array...
 */
package com.Bridgelabz.DeckOfCards;

import java.util.Random;

public class DeckOfCards {
    static String[] suitsArray = {"Clubs", "Diamonds", "Hearts", "Speades"};
    static String[] ranksArray = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King", "Ace"};
    static String[][] cardCombination = new String[ranksArray.length][ranksArray.length];



    public static void main(String[] args) {
        DeckOfCards deckOfCards = new DeckOfCards();

        deckOfCards.getCardCombination();
        deckOfCards.shuffleCard();
        deckOfCards.distribute();
    }



    //method for geting cards Combination
    public void getCardCombination() {
        for(int i = 0; i < suitsArray.length; i++) {
            for (int j = 0; j < ranksArray.length; j++) {
                cardCombination[i][j] = suitsArray[i] + ranksArray[j];
            }
        }
    }


    //method for Shuffle the card
    public void shuffleCard() {
        Random random = new Random();
        for (int i = 0; i < suitsArray.length; i++) {
            for (int j = 0; j < ranksArray.length; j++) {
                int m = random.nextInt(i+1);
                int n = random.nextInt(j+1);
                String temp = cardCombination[i][j];
                cardCombination[i][j] = cardCombination[m][n];
                cardCombination[m][n] = temp;
            }
        }
    }


    //mehod for distribute the 9 cards in 4 players
    public void distribute() {
        for (int i = 0; i < 4; i++) {
            System.out.println(" ");
            System.out.println("Cards Recieved By Player " + (i+1) + " are");
            for (int j = 0; j < 9; j++) {
                System.out.println("  " + cardCombination[i][j]);
            }
        }
    }
}