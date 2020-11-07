public class MyString{
  private char [] elements;
  private String l="";
  MyString(){}
  MyString(String v){
    elements=v.toCharArray();
  }
  public int indexOf(char k,int v){
    for(int p=v  ; p<elements.length ;p++){
      if(elements[p] == k){
        return p; 
      }
    }return -1;
  }
}