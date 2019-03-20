/**
 * Represents a point on the Cartesian plane
 * 
 * @author R Jamieson
 * @version 2.1
 */
public class Point extends Main
{ 

    double x;
    double y;

    public Point(double xin, double yin)
    {
        // initialise instance variables
        x = xin;
        y = yin;
    }

    /**
     * Calculates the distance between this and "other"
     * @param other The Point to which to calculate distance
     * @return the distance from this to Point other
     */
    public double distanceToPoint(Point other)
    {
        return Math.sqrt(Math.pow(x - other.x, 2) + Math.pow(y - other.y, 2)); 
    }

    // returns a String that looks readable
    public String toString()
    {
        return "(" + x + ", " + y + ")";
    }

    public double getX()
    {
        return x;
    }

    public double getY()
    {
        return y;
    }
}