import java.awt.Color;

public class Shape {
    private int y;
    private int x;
    private Color color;
    private int numberOfSides;

    // Constructors
    public Shape() {
        x = 0;
        y = 0;
        color = Color.RED;
    }

    public Shape(int x, int y, Color color) {
        this.x = x;
        this.y = y;
        this.color = color;
        numberOfSides = 4;
    }

    public Shape(int numberOfSides) {
        this.numberOfSides = numberOfSides;
        x = 0;
        y = 0;
        color = Color.RED;
    }

    public Shape(int x, int y, Color color, int numberOfSides) {
        this.x = x;
        this.y = y;
        this.color = color;
        this.numberOfSides = numberOfSides;
    }

    // Method Actions
    public double getArea() { // left almost abstract to be implemented in new shape object override
        return -1;
    }

    // public void draw(Graphics g) {}

    @Override
    public String toString() {
        String returnString = "";
        returnString = numberOfSides + "-sided shape, (" + getX() + ", " + getY() + ") " + color;

        return returnString;
    }

    int getX() {
        return x;
    }

    int getY() {
        return y;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }
}
