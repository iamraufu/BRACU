class Vehicle
{
    int x;
    int y;
    Vehicle()
    {
        x=0;
        y=0;
    }
    public void moveUp()
    {
        y++;
    }
    public void moveDown()
    {
        y--;
    }
    public void moveLeft()
    {
        x--;
    }
    public void moveRight()
    {
        x++;
    }
    public String toString()
    {
        return "("+x+" , "+y+")";
    }
}