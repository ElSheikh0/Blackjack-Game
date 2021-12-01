package blackjack;
import java.util.*;
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author Mohamed
 */
public class Player {

    

    private String Name;
    private int Score = 0;
    Card[] player_card = new Card[12];
    private boolean blackJack = false;
    private boolean win = false;
    int counter=0;

    public void setPlayer_card(Card[] player_card) {
        this.player_card = player_card;
    }

    public void setCounter(int counter) {
        this.counter = counter;
    }

    public Card[] getPlayer_card() {
        return player_card;
    }

    public int getCounter() {
        return counter;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public void setScore(int Score) {
        this.Score = Score;
    }

    

    public void setBlackJack(boolean blackJack) {
        this.blackJack = blackJack;
    }

    public void setWin(boolean win) {
        this.win = win;
    }

    public String getName() {
        return Name;
    }

    public int getScore() {
        return Score;
    }

   

    

    public boolean isBlackJack() {
        return blackJack;
    }

    public boolean isWin() {
        return win;
    }
}
