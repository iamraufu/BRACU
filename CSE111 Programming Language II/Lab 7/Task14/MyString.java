public class MyString{
    private char [] elements;
    private String l="";
    MyString(){}
    MyString(String v){
    elements=v.toCharArray();
    }
    public String substring(int k){
        for(int s=k ; k<elements.length ;k++){
            l+=elements[k];
        }
        return l;
    }
}