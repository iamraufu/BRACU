public class MyString{
    private char [] elements;
    MyString(){
        elements=new char [0];
    }
    MyString(String k){
        elements=k.toCharArray();
    }
    int length(){
        return elements.length;
    }
    boolean endsWith(MyString prefix){
        if(prefix.elements.length > elements.length || prefix.elements.length<0){
            System.out.println("system is out of bound");
            return false;
        }
        int b= elements.length-1;
        for(int i=prefix.elements.length-1 ; i>= 0 ; i--){
            if (prefix.elements[i] != elements[b]){
                return false;
            }
            b--;
        }
        return true;
    }
}