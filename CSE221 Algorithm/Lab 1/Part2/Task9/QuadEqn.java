public class QuadEqn
{
    int a,b,c;
    double r1,r2;
    public QuadEqn()
    {
        
    }
    
    double discriminant = (b * b) - (4.0 * a * c);
    
    if (discriminant > 0.0) 
    {
        double r1 = (-b + Math.pow(discriminant, 0.5)) / (2.0 * a);
        double r2 = (-b - Math.pow(discriminant, 0.5)) / (2.0 * a);
        System.out.println("The roots are " + r1 + " and " + r2);
    }
    
    else if (result == 0.0) 
    {
        double r1 = -b / (2.0 * a);
        System.out.println("The root is " + r1);
    } 
    
    else
    {
        System.out.println("The equation has no real roots.");
    }
    
    public double root()
    {
        return r1;
    }
    
}