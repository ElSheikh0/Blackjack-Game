/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package blackjack;

import com.sun.org.apache.bcel.internal.generic.RETURN;
import java.util.*;
/**
 *
 * @author Mohamed
 */
import java.util.Scanner;

public class BlackJack {

    static int count_HS = 0;
    static int count_BJ = 0;
    /**
     * @return
     */
    static Scanner keyboard = new Scanner(System.in);
    static Game game = new Game();

    public static void count() {
        for (int i = 0; i < 3; i++) {
            if (game.player[i].getScore() == game.validHighScore) {
                count_HS++;
            }

            if (game.player[i].getScore() == 21) {
                count_BJ++;
            }
        }
    }

    public static void hit_or_stand(Player p, int i) {
        int choice;
        //System.out.println("Hi "+ p.getName() +" Would you like to \"hit\" or \"stay\"? ");

        while (true) {

            System.out.println("Hi " + p.getName() + " Would you like to \"hit enter 1\" or \"stay enter 2 \"? " + "YOur Score is : " + p.getScore());

            choice = keyboard.nextInt();
            if (p.getScore() <= 21 && (choice == 1)) {

                game.cardDraws(p);
                GUI gui = new GUI();
                gui.updatePlayerHand(p.player_card[p.counter - 1], i);

                System.out.println("Your total is " + p.getScore() + " .\n");
            } else {
                choice = 0;
                game.update();
                break;
            }
        }

    }

    public static void hit_or_stand_for_deler(Player p) {
        int choice = 1;
        if (p.getScore() == game.validHighScore && count_BJ == 0 && count_HS == 1) {

            System.out.println("\n****************************");
            System.out.println("deler is woner");
           
        } else {
            do {

                System.out.println("Dealer chooses to hit.");

                game.cardDraws(p);
                GUI gui = new GUI();
                gui.updateDealerHand(p.player_card[p.counter - 1], game.cards);

                System.out.println("Your total is " + p.getScore() + ".\n");
                game.update();
                if (p.getScore() == game.validHighScore && count_HS == 1 && count_BJ == 0) {
                    System.out.println("deler is woner");
                    p.setWin(true);
                    break;

                }

            } while (p.getScore() <= 21);
        }
    }

    static void win_or_lose(Player[] p) {

        if ((count_BJ == 0 && p[0].getScore() == game.validHighScore && count_HS == 1) || (p[0].getScore() == 21 && count_BJ == 1)) {
            System.out.println("\n****************************");
            System.out.println(p[0].getName() + " is woner wiht score : " + p[0].getScore());
        } else if ((count_BJ == 0 && p[1].getScore() == game.validHighScore && count_HS == 1) || (p[1].getScore() == 21 && count_BJ == 1)) {
            System.out.println("\n****************************");
            System.out.println(p[1].getName() + " is woner wiht score : " + p[1].getScore());
        } else if ((count_BJ == 0 && p[2].getScore() == game.validHighScore && count_HS == 1) || (p[2].getScore() == 21 && count_BJ == 1)) {
            System.out.println("\n****************************");

            System.out.println(p[2].getName() + " is woner wiht score : " + p[2].getScore());
        } else if ((count_BJ == 0 && p[3].getScore() == game.validHighScore && count_HS == 1) || (p[3].getScore() == 21 && count_BJ == 1)) {
            System.out.println("\n****************************");
            System.out.println(p[3].getName() + " Dealer is woner wiht score : " + p[3].getScore());
        } else {
            System.out.println("\n****************************");
             System.out.println("Unfortunately, there is no winner");
        }
       

    }

    public static void main(String[] args) {
        // TODO code application logic here

        game.generatesCard();
        game.set_information();
        GUI gui = new GUI();
        gui.runGUI(game.cards, game.player[0].player_card, game.player[1].player_card, game.player[2].player_card, game.player[3].player_card);

        hit_or_stand(game.player[0], 0);
        hit_or_stand(game.player[1], 1);
        hit_or_stand(game.player[2], 2);
       
         count();
        hit_or_stand_for_deler(game.player[3]);
        if (game.player[3].isWin() == false) {
            System.out.println(game.player[0].getName()+" : score : "+game.player[0].getScore());
            System.out.println(game.player[1].getName()+" : score : "+game.player[1].getScore());
            System.out.println(game.player[2].getName()+" : score : "+game.player[2].getScore());
            System.out.println(game.player[3].getName()+" Dealer : score : "+game.player[3].getScore());
             win_or_lose(game.player);

        }
        System.out.println("\n****************************");
        System.out.println("The game is over,Thanks for trying  ");

    }

}
