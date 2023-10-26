public class Fraction {
    public final int numerator;
    public final int denominator;

    public Fraction(int numerator, int denominator) {
        this.numerator = numerator;
        this.denominator = denominator;
    }
    public Fraction(Fraction other) {
        this.numerator = other.numerator;
        this.denominator = other.denominator;
    }

    public String toString() {
        return (numerator + "/" + denominator);
    }

    public int getNum() {
        return this.numerator;
    }

    public int getDenom() {
        return denominator;
    }

    public Fraction add(Fraction other) {
        if (other.denominator == this.denominator) {
            Fraction sum = new Fraction(this.numerator + other.numerator, this.denominator);
            return sum;
        }
        Fraction sum = new Fraction((this.numerator * other.denominator) + (other.numerator * this.denominator), (this.denominator * other.denominator));
        return sum;
    }

    @Override
    public boolean equals(Object object) {
        if (object == null || !(object instanceof Fraction)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        Fraction compareFraction = (Fraction) object;
        return this.numerator == compareFraction.numerator && this.denominator == compareFraction.denominator;
    }


}
