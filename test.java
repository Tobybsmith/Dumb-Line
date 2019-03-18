public class test
{
    public static void test()
    {
        Point p1 = new Point(5,6);
        Point p2 = new Point(4,11);
        Line line1 = new Line(5, 3, 11); 
        Line line2 = new Line(2, p1); //Slope and a point it runs through
        Line line3 = new Line(2, p2);
        Line line4 = new Line(p1, p2);
        System.out.println(line1.toString());
        System.out.println(line2.toString());
        boolean b = line2.isParallel(line3);
        System.out.println("Are they parallel? " + b);
        boolean b2 = line3.isParallel(line4);
        System.out.println("Are they parallel? " + b2);
    }
}