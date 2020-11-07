public class MyString{
  private char [] elements;
  private String l="";
  MyString(){}
  MyString(String v){
    elements=v.toCharArray();
  }
  public String substring(int k,int m){
    for(int s=k ; k<=m ;k++){
      l+=elements[k];
    }
    return l;
  }
}