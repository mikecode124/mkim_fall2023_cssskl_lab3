
public class Point2D
{
    private int x;
    private int y;
    //default constructor (leaves x and y at 0)
    public Point2D() {}
    //overloaded constructor
    public Point2D(int x, int y) {
        this.x = x;
        this.y = y;
    }

    //overloaded copy constructor
    public Point2D(Point2D other) {
        this.x = other.x;
        this.y = other.y;
    }

    //This method should set your private variable x equal to nX.
    public void setX(int nX) {
        this.x = nX;
    }
    //Similar to above but for y
    public void setY(int nY) {
        this.y = nY;
    }
    //This function should return a copy of your private integer x;
    public int getX() {
        return this.x;
    }
    //Similar to above, but for y.
    public int getY() {
        return this.y;
    }
    //This function sets both x and y to zero.
    public void resetToOrigin() {
        x = 0;
        y = 0;
    }
    //This method adds dx to x, and dy to y
    public void translate(int dx, int dy) {
        x += dx;
        y += dy;
    }
    @Override
//returns a string representation of the point
    public String toString() {
        return "(" + x + ", " + y + ")";
    }
}
