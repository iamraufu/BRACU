public class Student{
     String ApplicantID, StudentId,Name;
}
public Student(String a,String i, String n){
    ApplicantId=a;
    StudentId=i;
    Name=n;
}
public boolean check(Student s){
    if(name==s.name){
        return true;
    }
    else {
        return false;
    }
}
public void identify(){
    System.out.println("ApplicantID: "+ ApplicantId+", StudentID: "+StudentId+", Name: "+name);
}
public void match(Student s){
    Name=s;
}
public void match(Student s){
    if(Student==s.Student){
        System.out.print(StudentId+" is the same person as "+StudentId);
    }
    else{
        System.out.print(StudentId+" is the different person from "+StudentId);
    }
}