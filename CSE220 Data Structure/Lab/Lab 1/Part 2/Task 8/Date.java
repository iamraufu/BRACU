public class Date{
  public int month,day,year;
  Date(){
    month=0;
    day=0;
    year=0;
  }
  public void setMonth(int a){
    month=a;
  }
  public void setDay(int a){
    day=a;
  }
  public void setYear(int a){
    year=a;
  }
  public int getMonth(){
    return month;
  }
  public int getDay(){
    return day;
  }
  public int getYear(){
    return year;
  }
  public void displayDate(){
    System.out.println(getMonth()+"/"+getDay()+"/"+getYear());
  }
}
  
  