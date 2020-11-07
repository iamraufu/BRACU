public class Square
{
    
    public double height;
    public double width;
    
    public Square()
    {
        
    }
    
    public double getHeight()
    {
        return height;
    }
    
    public void setHeight(int h)
    {
        height=h;
    }
    
    public double getWidth ()
    {
        return width;
    }
    
    public void setWidth (double w)
    {
        width=w;
    }
    
    public double getArea ()
    {
        return width*height;
    }
}