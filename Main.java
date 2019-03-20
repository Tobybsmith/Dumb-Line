public class Main
{
    public static void main ()
    {
        //////////////////

        Point p1 = new Point(3,4);
        Point p2 = new Point(10,6.5);

        // You’ll need four different constructors
        Line firstLine = new Line(2,-5,30); // 2x - 5y = 30
        Line secondLine = new Line(1.5, p1); // the line with slope 1.5 that passes through p1
        Line thirdLine = new Line(p1, p2); // the line that passes through p1 and p2.
        // if p1 and p2 have the same co-ordinates, make the Line horizontal.
        Line fourthLine = new Line(1.5, 27); // y = 1.5x + 27

        Line fifthLine = new Line(1,0,6); // x = 6 (vertical line)

        // isParallel takes a Line parameter and returns a boolean
        boolean b = firstLine.isParallel(secondLine); // returns false
        System.out.println("Should say false: " + b);

        // intersects takes a Line parameter and returns a Point
        // the Point is the point of intersection, if there is exactly one
        // if there is not exactly one point of intersection, this method should return null
        Point p3 = firstLine.intersects(secondLine); // returns a point with x = -5 and y = -8
        System.out.println("Should say (-5.0, -8.0) on the line below.");
        System.out.println(p3.toString());


        boolean b2 = secondLine.isParallel(fourthLine); // returns true
        System.out.println("Should say true: " + b2);
        Point p4 = secondLine.intersects(fourthLine); // returns null because the Lines don't intersect. null is a keyword in java.
        // you can say, if (whatever) return null;
        System.out.println("Should say null: " + p4);

        // the toString method returns a String that is the equation of the Line

        String s1 = fourthLine.toString();
        System.out.println("Should say -1.5x + 1.0y = 27.0 or 1.5x – 1.0y = -27.0");
        System.out.println(s1); // prints either -1.5x + 1.0y = 27.0 or 1.5x – 1.0y = -27.0
        // it's ok if occasionally you get lots of extra decimals

        String s2 = thirdLine.toString();
        System.out.println("Should say something like 0.35714285714285715x - 1.0y = -2.928571428571429");
        System.out.println("Or 5.0x - 14.0y = -41.0");
        System.out.println(s2);

        Line sixthLine = new Line(1.50000002, 26);
        boolean b3 = fourthLine.isParallel(sixthLine); // returns TRUE, the difference between slopes is less than the value 0.000,000,1
        System.out.println("Should say true: " + b3);
        Line tooDifferent = new Line(1.50001, 26); // NOT parallel to fourthLine or sixthLine, the slopes are not close enough.

        boolean b4 = sixthLine.isParallel(tooDifferent);
        System.out.println("Should say false: " + b4);
        /////////////////////
    }
}