import java.awt.*;

public class LineSegment {
    private Point2D start;
    private Point2D end;


    // constructors
    public LineSegment() {
        start = new Point2D(0,0);
        end = new Point2D(0,0);
    }

    public LineSegment(Point2D start, Point2D end) {
        if (start == null || (start.getX() < 0) || (start.getY() < 0)) {
            return;
        }
        if (end == null || (end.getX() < 0) || (end.getY() < 0)) {
            return;
        }
        this.start = start;
        this.end = end;
    }

    public LineSegment(LineSegment other) {
        this.start = other.start;
        this.end = other.end;
    }

    // action methods


    public Point2D getStart() {
        return new Point2D(start);
    }

    public Point2D getEnd() {
        return new Point2D(end);
    }

    public void setStartPoint(Point2D point) {

        if (point == null || (point.getX() < 0) || (point.getY() < 0))
        {
            return;
        }
        this.start = point;
    }

    public void setEndPoint(Point2D point) {

        if (point == null || (point.getX() < 0) || (point.getY() < 0))
        {
            return;
        }
        this.end = point;
    }

    @Override
    public String toString() {
        String retStr = "Line start: " + start.toString() + " end: " + end.toString();

        return retStr;
    }

    @Override
    public boolean equals(Object other) {
        if (other == null || !(other instanceof LineSegment)) {
            return false;
        }
        if (this == other) {
            return true;
        }
        LineSegment that = (LineSegment) other;
        return this.start.equals(that.start) && this.end.equals(that.end);
    }

    public double distance () {

        double xDiff = this.start.getX() - this.end.getX();
        double yDiff = this.start.getY() - this.end.getY();

        // Use the Pythagorean theorem to calculate the distance
        double distance = Math.sqrt(xDiff * xDiff + yDiff * yDiff);

        return distance;
    }
    public double distance (Point2D start, Point2D end) {


            double xDiff = start.getX() - end.getX();
            double yDiff = start.getY() - end.getY();

            // Use the Pythagorean theorem to calculate the distance
            double distance = Math.sqrt(xDiff * xDiff + yDiff * yDiff);

            return distance;
        }
}