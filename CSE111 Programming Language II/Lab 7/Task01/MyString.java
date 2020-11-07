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
}
