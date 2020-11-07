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
    boolean startsWith(MyString prefix){
        if(prefix.elements.length > elements.length || prefix.elements.length<0){
            System.out.println("system is out of bound");
            return false;
        }
        for(int i=0 ; i<prefix.elements.length ;i++){
            if (prefix.elements[i] != elements[i]){
                return false;
            }
        }
        return true;
    }
}