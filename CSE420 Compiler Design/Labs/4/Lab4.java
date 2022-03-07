import java.io.File;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.io.FileNotFoundException;

public class Lab4 {
 public static void main(String[] args) {
     try{    
            Scanner sc = new Scanner(new File("C:\\Users\\HP\\Desktop\\input.txt"));
             
            String s = "([a-z]+?) (([a-z]+?)\\(.*?\\))";
            Pattern p = Pattern.compile(s);
             
            System.out.println("Methods:");
             
            while (sc.hasNextLine()){
                String s2 = sc.nextLine();
                Matcher m = p.matcher(s2);
                    
                if (m.find() && !"main".equals(m.group(3))) {
                    System.out.println(m.group(2) + ", " + "return type: " + m.group(1));
             }
         }
     } catch (FileNotFoundException e) {
   e.printStackTrace();
  }
    }
}