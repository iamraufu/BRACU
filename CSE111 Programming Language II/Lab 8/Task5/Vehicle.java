public class Vehicle{
    private int x=0;
    private int y=0;
    int getX(){
        return x;
    }
    int getY(){
        return y;
    }
    public void moveUp(){
        ++y;
    }
    public void moveDown(){
        --y;
    }
    public void moveLeft(){
        --x;
    }
    public void moveRight(){
        ++y;
    }
    public String toString(){
        return "("+x+"  ,  "+y+")";
    }
}
    
    