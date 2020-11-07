import java.util.Scanner;
public class Tester{
  public static void main (String[]args){
    Scanner s = new Scanner(System.in);
    String menu = "Enter your Choice:\n1.Register a patient\n2.Serve a patient\n3.Cancel all appointments\n4.Can doctor go home\n5.List of all patient\n6.Exit";
    System.out.println("Welcome to LinkedList Based Queue Hospital System");
    System.out.println(menu);                                              
    int select = 0 ;
    WRM w = new WRM();
    
    while(select!=6){
      try{
        select = s.nextInt();
        if(select == 1){
          w.RegisterPatient();
          System.out.println("---\n"+menu);
        }
        else if(select == 2){
          w.ServePatient();
          System.out.println("---\n"+menu);
          
        }
        else if(select ==  3){
          w.CancelAll();
          System.out.println("---\n"+menu);
          
        }
        else if(select == 4){
          w.CanDoctorGoHome();
          System.out.println("---\n"+menu);
        }
        else if(select == 5){
          w.ShowAllPatient();
          System.out.println("---\n"+menu);
        }
        else if(select == 6){
          System.out.println("Thank You");
        }
        else{
          System.out.println(menu);
        }
      }
      
      catch(Exception e){
        System.err.println("Input Format Mismatch! Please, try Again.\n"+menu);
        s.next();
      }
      
    }
  }
}
