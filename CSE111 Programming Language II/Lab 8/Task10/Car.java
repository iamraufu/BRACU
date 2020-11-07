public class Car{
    private static int totalcar=0;
    private int year;
    Car(int m){
     year=m;
     ++totalcar;
    }
    public int getYear(){
        return year;
    }
    public static int getObjectCount(){
        return totalcar;
    }
}