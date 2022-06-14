import javax.swing.*;
import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        LinkedList<Card> CardList = new LinkedList<Card>();
        for (int i = 0; i < 4; i++) {

            for (int j = 2; j < 11; j++) {
                CardList.add(new Card(j,false, Suit.values()[i]));
            }
            for (int p = 11; p < 15; p++) {
                CardList.add(new Card(p, true, Suit.values()[i]));
            }
        }

        Collections.shuffle(CardList);
        LinkedList<Card> HandList = new LinkedList<Card>(); {
            for (int k = 0; k < 5; k++) {
                HandList.add(CardList.pop());
            }
            System.out.println(HandList);
            /*This is the hand, the first result will be the hand of 5 cards that were chosen and the
            remainder will be the remaining cards that are sorted
             */
        }
        Collections.sort(CardList, Collections.reverseOrder());

        for (Card card:
             CardList) {
            System.out.println(card);
        }
    }
}
