public class Card {
    public int NumericalValue;
    public boolean Face;
    //if Face returns false then it is a number card 1-10
    Suit suit;
    public Card(int NumericalValue, boolean Face, Suit suit) {
        this.NumericalValue = NumericalValue;
        this.Face = Face;
    }

    public int getNumericalValue() {
        return NumericalValue;
    }

    public void setNumericalValue(int numericalValue) {
        NumericalValue = numericalValue;
    }

    public boolean isFace() {
        return Face;
    }

    public void setFace(boolean face) {
        Face = face;
    }

}
