public class Card {
    public int NumericalValue;
    public boolean Face;
    //if Face returns false then it is a number card 1-10
    public String suit;
    public Card(int NumericalValue, boolean Face, String suit) {
        this.NumericalValue = NumericalValue;
        this.Face = Face;
        this.suit = suit;

    }
}
