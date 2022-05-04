import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Arraylist<Card> CardDeck = new ArrayList<>();
        CardDeck.add(new Card(1,true, "diamond"));
    }
}






/*make deck of cards with (face or number, numerical value, suit) ez pz right?.
the difficult part is creating the actual values for the stuff.
With loops you can make all the cards up to the ace? jokers? not sure but put in values for those I guess.
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
