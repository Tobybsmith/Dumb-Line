public class test
{
    public static void test()
    {
        Point p1 = new Point(3,4);
        Point p2 = new Point(10,6.5);

        // You’ll need four different constructors
        Line firstLine = new Line(2,-5,30); // 2x - 5y = 30
        Line secondLine = new Line(1.5, p1); // the line with slope 1.5 that passes through p1
        Line thirdLine = new Line(p1, p2); // the line that passes through p1 and p2.
        // if p1 and p2 have the same co-ordinates, make the Line horizontal.
        Line fourthLine = new Line(1.5, 27); // y = 1.5x + 27

        Line fifthLine = new Line(1,0,6); // x = 6 (vertical line)

        System.out.println("First Line(xCo, yCo, total) " + firstLine.toString());
        System.out.println("Second Line(slope, point)" + secondLine.toString());
        System.out.println("Third Line(two points)" + thirdLine.toString());
        System.out.println("Fourth Line(negative xCo +total)" + fourthLine.toString());
        System.out.println("Fifth Line(same as first with a zero)" + fifthLine.toString());
    }
}
