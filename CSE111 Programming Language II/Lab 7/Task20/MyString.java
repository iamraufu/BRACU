public class MyString{
  private char [] elements;
  private String s="";
  private String s1="";
  private String s2="";
  MyString(){}
  MyString(String k){
    elements=k.toCharArray();
  }
  public String concat(MyString k){
    for (int i=0 ; i<elements.length ; i++){
      s1+=elements[i];
    }
    for (int i=0 ; i<k.elements.length ; i++){
      s2+=k.elements[i];
    }
    s=s1+s2;
    return s;
  }
}
