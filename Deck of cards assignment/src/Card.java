public class Card {
    public int NumericalValue;
    public boolean face;
    //if Face returns false then it is a number card 1-10
    Suit suit;
    public Card(int NumericalValue, boolean face, Suit suit) {
        this.NumericalValue = NumericalValue;
        this.face = face;
        this.suit = suit;
    }

    public int getNumericalValue() {
        return NumericalValue;
    }

    public void setNumericalValue(int numericalValue) {
        NumericalValue = numericalValue;
    }

    public boolean isFace() {
        return face;
    }

    public void setFace(boolean face) {
        this.face = face;
    }

    @Override
    public String toString() {
        if(face == true && NumericalValue == 11) {
            return "Jack of " + suit;
        }
        if(face == true && NumericalValue == 12) {
            return "Queen of " + suit;
        }
        if(face == true && NumericalValue == 13) {
            return "King of " + suit;
        }
        if(face == true && NumericalValue == 14) {
            return "Ace of " + suit;
        }
        return NumericalValue +
                " of " + suit;
    }
    @Override
    public boolean equals(Suit suit) {
            if(this.suit == Suit.CLUBS) {
                return true;
            }

        }
    }
}
