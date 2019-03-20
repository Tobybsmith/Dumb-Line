public class Line extends Main //owo\\
{
    double xCo;
    double yCo;
    double total; 
    //Is the b in y = mx + b
    //2x + 5y = 7
    //2x - 7 = 5y
    //y = 2/5x -  7/5

    double slope;

    double pointX1;
    double pointY1;
    double pointX2;
    double pointY2;

    double slopeL2;
    double slopeL1;

    double yIntercept;

    boolean parallel;

    boolean negative = false;
    boolean zeroY = false;
    boolean zeroX = false;

    //Every line needs a Slope, xCo, yCo, and a total

    public Line(int xCoIn, int yCoIn, int totalIn) //First Line
    {
        xCo = xCoIn;
        yCo = yCoIn;
        total = totalIn;
        if(yCo != 0)
        {
            slope = xCo/yCo;
        }
        else
        {
            slope = xCo;
        }

        if(xCo == 0)
        {
            zeroX = true;
        }
        if(yCo == 0)
        {
            zeroY = true;
        }
        //Not neeeded but useful for understanding how everything works
        //This line is good and done
    }

    public Line(double slopeIn, Point p1) //Second Line
    {
        pointX1 = p1.x;
        pointY1 = p1.y;
        slope = slopeIn;
        total = p1.y - slope*p1.x;
        xCo = slope;
        yCo = -1;

        negative = true;

        if(xCo == 0)
        {
            zeroX = true;
        }
        if(yCo == 0)
        {
            zeroY = true;
        }
    }

    public Line(Point p1, Point p2) //Third Line
    {
        pointX1 = p1.x;
        pointY1 = p1.y;
        pointX2 = p2.x;
        pointY2 = p2.y;

        slope = (pointY2-pointY1)/(pointX2-pointX1);

        //In y = mx+b form m is the xCo and 1 is the yCo
        //But in aX + bY = c form, the yCo is 1 and the xCo is 
        yIntercept = p1.y - (p1.x*slope);
        yCo = 1;
        xCo = slope;
        total = yIntercept;

        
        //Need xCo and yCo
        if(xCo == 0)
        {
            zeroX = true;
        }
        if(yCo == 0)
        {
            zeroY = true;
        }
    }

    public Line(double slopeIn, int yInterceptIn) //Fourth Line
    {
        slope = slopeIn;
        yIntercept = yInterceptIn;
        total = yIntercept;
        xCo = slope;
        yCo = 1;

        //y = slope(x) + yIntercept

        //Need xCo and yCo
        if(xCo == 0)
        {
            zeroX = true;
        }
        if(yCo == 0)
        {
            zeroY = true;
        }
    }

    public String toString()
    //X Coefficient + Y Coefficient = total
    {
        //in the case that the second line constrinctor was called
        if(negative = true)
        {
            return xCo + "x - " + Math.abs(yCo) + "y = -" + Math.abs(total);
        }
        //If theres a zero, remove that part
        if(zeroX == true)
        {
            return yCo + "y = " + total;
        }
        if(zeroY == true)
        {
            return xCo + "x = " + total;
        }
        return xCo + "x + " + yCo + "y = " + total;
    }

    public boolean isParallel(Line l2)
    {
        //If the slope is the same, then go ahead and make it true
        slopeL2 = l2.slope;
        if(l2.slope < slope + 0.0000001 && l2.slope > slope - 0.0000001)
        {
            parallel = true;
        }
        else
        {
            parallel = false;
        }
        return parallel;
    }

    public Point intersects(Line l1)
    {
        double slopeLine1 = l1.slope;
        double xCo1 = l1.xCo;
        double yCo1 = l1.yCo;
        double total1 = l1.total;
        
        Point p1 = new Point(0,0);
        if(parallel == true)
        {
            return null;
        }
        p1.x = Math.ceil(((total*yCo1) - (total1 * yCo))/((xCo*yCo1) - (xCo1*yCo)));
        p1.y = Math.ceil(((xCo*-1*p1.x)/yCo) + (total/yCo));
        
        return p1;
    }
}
