import java.util.*;
public class MyReader 
{
  int readInteger() throws EitaIntegerNoiException{
    Scanner k = new Scanner(System.in);
    String s = k.nextLine();
    k.close();
    if (s.contains(".")) {
      throw new EitaIntegerNoiException("errorss...");
    } 
    else {
      return Integer.parseInt(s);
    }
  }
}
