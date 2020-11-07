public class MyString{
    private char [] elements;
    MyString(){}
    MyString(String k){
    elements=k.toCharArray();
    }
    public boolean equalsIgnoreCase(MyString k){
        if(k.elements.length> elements.length){
            return false;
        }
        for(int i=0 ; i<elements.length ; i++){
            int ch=elements[i];
            ch=(char)(ch-32);
            if(ch != k.elements[i]){
                return false;
            
            }
        }
        return true;
    }
}