package blackjack;

import java.util.Random;
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author Mohamed
 */
public class Game {

    public Player player[] = new Player[4];
    public Card cards[] = new Card[52];
    public int validHighScore = 0;
    Random rand = new Random();
    int c = 0;

    public void generatesCard() {

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 13; j++) {

                if (j < 10) {
                    cards[c] = new Card(i, j, j + 1);
                    // System.out.println(cards[0].getSuit()+"  "+cards[j].getRank()+"  "+cards[j].getValue());
                } else {
                    cards[c] = new Card(i, j, 10);
                    //   System.out.println(cards[1].getSuit()+"  "+cards[j].getRank()+"  "+cards[j].getValue());
                }
                c++;
            }

        }
    }

    public Card cardDraws(Player p) {

        while (true) {
            int randomChoice = rand.nextInt(52);
            if (cards[randomChoice] != null) {

                Card card1 = new Card(cards[randomChoice].getSuit(), cards[randomChoice].getRank(), cards[randomChoice].getValue());
                for (int i = 0; i < p.player_card.length; i++) {
                    if (p.player_card[i] == null) {
                        p.player_card[i] = cards[randomChoice];
                        p.counter++;
                        break;
                    }

                }

                System.out.println("Hi "+p.getName()+ " your card "+p.counter + " is : " +"Suit is "+ cards[randomChoice].getSuit() + ",   " + "Rank is "+cards[randomChoice].getRank() + "   " + "Value is "+cards[randomChoice].getValue());
               
                p.setScore(p.getScore() + cards[randomChoice].getValue());
                System.out.println("HI "+p.getName()+" your total score is : " + p.getScore());
                cards[randomChoice] = null;

                return card1;
            }
        }

    }

    public void set_information() {
        for (int i = 0; i < 4; i++) {
            System.out.println("please enter your name : ");
            Player play = new Player();
            Scanner input = new Scanner(System.in);
            play.setName(input.nextLine());
            player[i] = play;

         
                cardDraws(player[i]);
                cardDraws(player[i]);
                 System.out.println("\n****************************");
                
           
        }
    }

    public void update() {
        for (int i = 0; i < 3; i++) {
            if (player[i].getScore() > validHighScore && player[i].getScore() <= 21) {
                validHighScore = player[i].getScore();
            }
        }

    }

}
