import java.io.*;
import java.util.*;

public class Lab1 {
      public static void main(String args[]) throws FileNotFoundException {

            ArrayList<String> keyList = new ArrayList<String>();
            Scanner keys = new Scanner(new FileReader("Keyword.txt"));
            while (keys.hasNext()) {
                  keyList.add(keys.next());
            }

            Scanner sc = new Scanner(new FileReader("Input.txt"));

            ArrayList<String> keywords = new ArrayList<String>();
            ArrayList<String> identifiers = new ArrayList<String>();
            ArrayList<String> operators = new ArrayList<String>();
            ArrayList<String> logical = new ArrayList<String>();
            ArrayList<String> bool = new ArrayList<String>();
            ArrayList<String> number = new ArrayList<String>();
            ArrayList<String> others = new ArrayList<String>();

            while (sc.hasNext()) {
                  String temp = sc.next();

                  if (temp.equals("==") || temp.equals(">") || temp.equals(">=") || temp.equals("<")
                              || temp.equals("<=") || temp.equals("!=")) {
                        if (!logical.contains(temp))
                              logical.add(temp);
                  }

                  else if (temp.equals("true") || temp.equals("false")) {

                        if (!bool.contains(temp))
                              bool.add(temp);
                  } 
                  
                  else if (keyList.contains(temp)) {

                        if (!keywords.contains(temp))
                              keywords.add(temp);
                  } 
                  
                  else if (temp.equals("+") || temp.equals("-") || temp.equals("=")) {

                        if (!operators.contains(temp))
                              operators.add(temp);
                  }

                  else if (((int) temp.charAt(0) >= 65 && (int) temp.charAt(0) <= 90)
                              || ((int) temp.charAt(0) >= 97 && (int) temp.charAt(0) <= 122)) {

                        boolean boo = false;
                        for (int i = 0; i < temp.length(); i++) {
                              if ((((int) temp.charAt(i) >= 65 && (int) temp.charAt(i) <= 90)
                                          || ((int) temp.charAt(i) >= 97 && (int) temp.charAt(i) <= 122)) == false) {
                                    boo = true;
                                    break;
                              }
                        }
                        if (!identifiers.contains(temp) && boo == false)
                              identifiers.add(temp);

                  } else if ((int) temp.charAt(0) >= 48 && (int) temp.charAt(0) <= 57) {
                        boolean boo = false;
                        int count = 0;
                        for (int i = 0; i < temp.length(); i++) {
                              if ((((int) temp.charAt(i) >= 48 && (int) temp.charAt(i) <= 57) == false)
                                          && temp.charAt(i) != '.') {
                                    if (temp.charAt(i) == '.') {
                                          count++;
                                    }
                                    boo = true;
                                    break;
                              }
                        }
                        if (!identifiers.contains(temp) && boo == false && count <= 1)
                              number.add(temp);
                  } else {
                        if (!others.contains(temp))
                              others.add(temp);
                  }

            }

            System.out.print("Keywords: ");
            for (int i = 0; i < keywords.size(); i++) {
                  if (i == keywords.size() - 1) {
                        System.out.print(keywords.get(i));
                  } else {
                        System.out.print(keywords.get(i) + ", ");
                  }
            }

            System.out.println();

            System.out.print("Identifiers: ");
            for (int i = 0; i < identifiers.size(); i++) {
                  if (i == identifiers.size() - 1) {
                        System.out.print(identifiers.get(i));
                  } else {
                        System.out.print(identifiers.get(i) + ", ");
                  }
            }

            System.out.println();

            System.out.print("Math Operators: ");
            for (int i = 0; i < operators.size(); i++) {
                  if (i == operators.size() - 1) {
                        System.out.print(operators.get(i));
                  } else {
                        System.out.print(operators.get(i) + ", ");
                  }
            }

            System.out.println();

            System.out.print("Logical Operators: ");
            for (int i = 0; i <logical.size(); i++) {
                  if (i == (logical.size()) - 1) {
                        System.out.print(logical.get(i) + " ");
                  } else {
                        System.out.print(logical.get(i) + ", ");
                  }
            }

            System.out.println();

            System.out.print("Numerical Values: ");
            for (int i = 0; i < number.size(); i++) {
                  if (i == (number.size()) - 1) {
                        System.out.print(number.get(i) + " ");
                  } else {
                        System.out.print(number.get(i) + ", ");
                  }
            }
            
            System.out.println();

            System.out.print("Others: ");
            for (int i = 0; i < others.size(); i++) {
                  if (i == others.size() - 1) {
                        System.out.print(others.get(i));
                  } else {
                        System.out.print(others.get(i) + " ");
                  }
            }
      }
}