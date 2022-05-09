import javax.swing.*;
import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        ArrayList<Card> CardList = new ArrayList<Card>();
//        CardList.add(new Card(1,true, Suit.DIAMOND));
        for (int i = 0; i < 4; i++) {

            for (int j = 2; j < 11; j++) {
                CardList.add(new Card(j,false, Suit.values()[i]));
            }
            for (int p = 11; p < 15; p++) {
                CardList.add(new Card(p, true, Suit.values()[i]));
            }

        }
        Collections.shuffle(CardList);

        for (Card card:
             CardList) {
            System.out.println(card);
        }
    }
}







/*make deck of cards with (face or number, numerical value, suit) ez pz right?.
the difficult part is creating the actual values for the stuff.
With loops you can make all the cards up to the ace? Not sure but put in values for those I guess.
the faces alone might be enough but the numerical values would help if you wanna do other stuff.
onces you've made all the cards which I presume you have to do in separate classes, classifying everything.
you can make code to make a deck with random cards. thenn that'll be it
 */

/* so for doing the above you'll have to look at the previous polymorphism and inheritance assignments
to find out how to put in all the suits and stuff.
Then look into using loops to make each thingy.
Probably make some getters ans setters to be able to get the values and set the values as well.
Once thats been done you need to make sure that you set the amount of cards there are ina deck.
Cause inside a deck there are only so many cards
After the deck build yourself a hand which is randomizing everything and giving yourself 5 cards
Then you're done

 */
