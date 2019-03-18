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

    //Every line needs a Slope, xCo, yCo, and an Intercept
    
    public Line(int xCoIn, int yCoIn, int totalIn)
    {
        xCo = xCoIn;
        yCo = yCoIn;
        total = totalIn;
        slope = xCo/yCo;
        yIntercept = total/yCo;
        //This line is good and done
    }

    public Line(double slopeIn, Point p1)
    {
        pointX1 = p1.x;
        pointY1 = p1.y;
        slope = slopeIn;
        yCo = slope*(xCo - p1.x) - p1.y;
        xCo = ((yCo - p1.y)/slope) + p1.x;
        
        //Need X coefficient and Y coeffiecient and total
        //Y- p1.y = slope*(X - p1.x)
        //(yCo - p1.y)/slope = xCo - p1.x
        //((yCo - p1.y)/slope) + p1.x = xCo
        //int Ax + By + C = 0;
    }

    public Line(Point p1, Point p2)
    {
        xCo = p1.x;
        yCo = p1.y;
        pointX2 = p2.x;
        pointY2 = p2.y;
        slope = (pointY2/pointY1)/(pointX2/pointX1);
    }

    public Line(double slopeIn, int yInterceptIn)
    {
        slope = slopeIn;
        yIntercept = yInterceptIn;
        //y = slope(x) + yIntercept
    }

    public String toString()
    //X Coefficient + Y Coeffiecnt = total
    {
        String str = xCo + "x + " + yCo + "y = " + total;
        return str;
    }

    public boolean isParallel(Line l2)
    {
        //If the slope is the same, then go ahead and make it true
        slopeL2 = l2.slope;
        if(l2.slope == slope)
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
        slopeL1 = l1.slope;
        //Algebra
        //Take in A line
        //Check slopes
        //Set one side equal to the other
        //Solve
        //2. Check if they intersect
        if(parallel == true)
        {
            return null;
        }

        Point p1 = new Point(xCo, yCo);
        return p1;
    }
}
