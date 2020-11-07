public class MyString{
    private char [] elements;
    private String l="";
    MyString(){}
    MyString(String v){
        elements=v.toCharArray();
    }
    public int indexOf(char k){
        for(int p=elements.length-1  ; p>=0 ;p--){
            if(elements[p] == k){
                return p; 
            }
        }return -1;
    }
}