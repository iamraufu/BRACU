public class MyString{
    private char[] elements;
    MyString(){}
    MyString(String k){
        elements=k.toCharArray();
    }
    public void replaceAll(char m , char k){
        for(int i=0 ; i<elements.length ; i++){
            if(elements[i]==m){
                elements[i]=k;
            }
        }
        for(int i=0 ; i<elements.length ; i++){
            System.out.print(elements[i]);
        }
    }
}
            