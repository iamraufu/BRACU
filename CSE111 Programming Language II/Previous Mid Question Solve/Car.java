public class Car {
    private String make = "";
    private String model = "";
    public Car(){
        
    }
    public Car(String s){
        make=s;
    }
    public Car(String s, String t){
        make=s;
        model=t;
    }
    public void start(){
        if(make== "" && model== ""){
            System.out.println("Car is starting");
        }
        else if(make== ""){
            System.out.println("Car make: "+make+" is starting");
        }
        else{
            System.out.println("Car make: "+make+", model: "+model+" is starting");
        }
        
    } 
}