public class MyString{
    private char [] elements;
    MyString(){
        elements=new char [0];
    }
    MyString(String k){
        elements=k.toCharArray();
    }
    public int length(){
        return elements.length;
    }
    public char charAt(int k){
        if(k>=0&&k<elements.length){
            return elements[k];
        }
          else{
              return ' ' ;
            }
    }
}
