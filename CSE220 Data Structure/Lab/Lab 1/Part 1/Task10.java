import java.util.Scanner;
public class Task10{
  public static String season(int a,int b){
    if(a>=3 && a<=6){
      if(a==3 && b>=16){
        return "Spring";
      }
      else if(a==6 && b<=15){
        return "Spring";
      }
      else if(a>3 && a<6){
        return "Spring";
      }
    }
     if(a>=6 && a<=9){
      if(a==6 && b>=16){
        return "Summer";
      }
      else if(a==9 && b<=15){
        return "Summer";
      }
      else if(a>6 && a<9){
        return "Summer";
      }
    }
      if(a>=9 && a<=12){
      if(a==9 && b>=16){
        return "Fall";
      }
      else if(a==12 && b<=15){
        return "Fall";
      }
      else if(a>9 && a<12){
        return "Fall";
      }
    }
    return "Winter";
  }
  public static void main(String[]args){
    Scanner sc=new Scanner(System.in);
    System.out.println("enter month between 1-12 and date between 1-31");
    int m1=sc.nextInt();
    int d1=sc.nextInt();
    System.out.println(season(m1,d1));
  }
}