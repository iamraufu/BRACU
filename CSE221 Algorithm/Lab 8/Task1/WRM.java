import java.util.Scanner;
public class WRM{
    Scanner sc = new Scanner (System.in);
    Queue q;
    public static int id = 1000;
    public WRM(){
        q = new ArrayQueue();
    }
    
    public void RegisterPatient(){
        id++;
        System.out.println("Enter Name");
        String n = sc.next();
        System.out.println("Enter Age");
        int a = sc.nextInt();
        System.out.println("Enter Blood Group");
        String b = sc.next();
        Patient p = new Patient (n , a, b, id); 
        try{
            q.enqueue(p);
            System.out.println(p.name+" Added");
        }
        catch(QueueOverflowException e){
            System.err.println("Queue Full! Cannot Enqueue\n"+e);
        }
        
    }
    
    
    public void ServePatient(){
        try{
            Patient x = (Patient) q.dequeue();
            System.out.println(x.name+" has been served");
        }
        catch(QueueUnderflowException e){
            System.err.println("No Appointment");
        }
    }
    
    public void CancelAll(){
        if(q.size()>0){
            System.out.println("All Appointment canceled");
        }
        for(int i = 0 ; i<=q.size() ; i++){
            try{
                q.dequeue();
            }
            
            catch (QueueUnderflowException e){
                System.err.println("No Appointment");
            }
            
        }
    }
    
    
    public void CanDoctorGoHome(){
        if(q.isEmpty()){
            System.out.println("Yes, There is no available patient to serve.");
        }
        else{
            System.out.println("No, Still patients are in waiting.");
        }
    }
    
    public void ShowAllPatient(){
        Object [] temp = q.toArray();
        
        for(int i = 0 ; i<q.size() ; i++){
            for(int j = i+1 ; j<q.size() ; j++){
                Patient a = (Patient) temp[i];
                Patient b = (Patient) temp[j];
                if(a.name.compareTo(b.name)>0){
                    Object swap = temp[i];
                    temp[i] = temp[j];
                    temp[j] = swap;
                }
            }
        }
        if(q.size()==0){
            System.err.println("No Appointment");
        }
        else{
            for(int i = 0 ; i<temp.length ; i++){
                System.out.println(temp[i]);
            }
        }
        
    }
}
