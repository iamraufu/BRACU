public class MyString{
    private char [] elements;
    MyString(){}
    MyString(String k){
    elements=k.toCharArray();
    }
    public boolean equals(MyString k){
        if(k.elements.length> elements.length){
            return false;
        }
        for(int i=0 ; i<elements.length ; i++){
            if(elements[i] != k.elements[i]){
                return false;
            
            }
        }
        return true;
    }
}