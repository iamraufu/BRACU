import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Lab02 {

    public static void main(String[] args) throws FileNotFoundException {

        Scanner sc = new Scanner(new File("input.txt"));

        int n = sc.nextInt();
        sc.nextLine();
        int i = 1;
        while (sc.hasNext() && i <= n) {
            String s = sc.nextLine().trim();

            if (web(s) && email(s)) {
                System.out.print("Web and Email found in line " + i);
            } else if (web(s)) {
                System.out.print("Web, " + i);
            } else if (email(s)) {
                System.out.print("Email, " + i);
            } else if (web(s) == false && email(s) == false) {
                System.out.print("Nothing found in line " + i);
            }
            i++;
            System.out.println();
        }
    }

    public static boolean web(String s) {
        int state = 0;
        boolean website = false;
        int i = 0;

        while (i < s.length()) {
            switch (state) {
                case 0:
                    if (s.charAt(i) == 'w' || s.charAt(i) == 'W') {
                        state = 1;

                    } else {
                        state = 0;
                    }
                    i++;
                    break;

                case 1:
                    if (s.charAt(i) == 'w' || s.charAt(i) == 'W') {
                        state = 2;

                    } else {
                        state = 0;
                    }
                    i++;
                    break;

                case 2:
                    if (s.charAt(i) == 'w' || s.charAt(i) == 'W') {
                        state = 3;

                    } else {
                        state = 0;
                    }
                    i++;
                    break;
                case 3:
                    if (s.charAt(i) == '.') {
                        state = 4;

                    } else {
                        state = 0;
                    }
                    i++;
                    break;
                case 4:
                    if (((int) s.charAt(i) > 64 && (int) s.charAt(i) < 91) || ((int) s.charAt(i) > 96 && (int) s.charAt(i) < 123)) {
                        state = 5;

                    } else {
                        state = 0;
                    }
                    i++;
                    break;

                case 5:
                    if (((int) s.charAt(i) > 64 && (int) s.charAt(i) < 91) || ((int) s.charAt(i) > 96 && (int) s.charAt(i) < 123) || ((int) s.charAt(i) > 47 && (int) s.charAt(i) < 58)) {
                        state = 5;

                    } else if (s.charAt(i) == '.') {
                        state = 6;
                    } else {
                        state = 0;
                    }
                    i++;
                    break;

                case 6:
                    if (s.charAt(i) == 'c' || s.charAt(i) == 'C') {
                        state = 7;

                    } else {
                        state = 0;
                    }
                    i++;
                    break;
                case 7:
                    if (s.charAt(i) == 'o' || s.charAt(i) == 'O') {
                        state = 8;

                    } else {
                        state = 0;
                    }
                    i++;
                    break;
                case 8:
                    if (s.charAt(i) == 'm' || s.charAt(i) == 'M') {

                        website = true;
                        state = 0;
                    } else {
                        state = 0;
                    }
                    i++;
                    break;
            }
        }

        return website;
    }

    public static boolean email(String s) {
        int state = 0;
        boolean email = false;
        int i = 0;
        while (i < s.length()) {
            switch (state) {
                case 0:
                    if (((int) s.charAt(i) > 64 && (int) s.charAt(i) < 91) || ((int) s.charAt(i) > 96 && (int) s.charAt(i) < 123)) {
                        state = 1;
                    } else {
                        state = 0;
                    }
                    i++;
                    break;
                case 1:
                    if (((int) s.charAt(i) > 64 && (int) s.charAt(i) < 91) || ((int) s.charAt(i) > 96 && (int) s.charAt(i) < 123) || ((int) s.charAt(i) > 47 && (int) s.charAt(i) < 58)) {
                        state = 1;
                    } else if (s.charAt(i) == '@') {
                        state = 2;
                    } else {
                        state = 0;
                    }
                    i++;
                    break;
                case 2:
                    if (((int) s.charAt(i) > 64 && (int) s.charAt(i) < 91) || ((int) s.charAt(i) > 96 && (int) s.charAt(i) < 123)) {
                        state = 2;
                    } else if (s.charAt(i) == '.') {
                        state = 3;
                    } else {
                        state = 0;
                    }
                    i++;
                    break;
                case 3:
                    if (s.charAt(i) == 'c' || s.charAt(i) == 'C') {
                        state = 4;
                    } else {
                        state = 0;
                    }
                    i++;
                    break;
                case 4:
                    if (s.charAt(i) == 'o' || s.charAt(i) == 'O') {
                        state = 5;
                    } else {
                        state = 0;
                    }

                    i++;
                    break;
                case 5:
                    if (s.charAt(i) == 'm' || s.charAt(i) == 'M') {

                        email = true;
                        state = 0;
                    } else {
                        state = 0;
                    }
                    i++;
                    break;

            }
        }

        return email;
    }

}