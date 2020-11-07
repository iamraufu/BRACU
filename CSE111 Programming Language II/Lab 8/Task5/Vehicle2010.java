public class Vehicle2010 extends Vehicle{
    public void moveUpperLeft(){
        moveUp();
        moveLeft();
    }
    public void moveUpperRight(){
        moveUp();
        moveRight();
    }
    public void moveLowerRight(){
        moveDown();
        moveRight();
    }
    public void moveLowerLeft(){
        moveDown();
        moveLeft();
    }
    public boolean equals(Vehicle2010 v){
        if(v.getX()==getX() && v.getY()==getY()){
            return true;
        }
        else{
            return false;
        }
    }
}