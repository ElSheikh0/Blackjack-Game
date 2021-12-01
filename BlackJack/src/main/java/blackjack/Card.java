package blackjack;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Mohamed
 */
public class Card {

   
   private final int suit;
   private final int rank;
   private final int value;
 public Card() { //a default constructor of Card
    suit = 0;
    rank = 0; 
    value = 0; 
  }
    public Card(int suit, int rank, int value) {
        this.suit = suit;
        this.rank = rank;
        this.value = value;
    }
  
    public Card(Card card){
    this.rank=card.rank ;
    this.suit=card.suit;
    this.value=card.value ;
    }
     public int getSuit() {
        return suit;
    }

    public int getRank() {
        return rank;
    }

    public int getValue() {
        return value;
    }

    
    
}