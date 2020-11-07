public class MyString{
    private char[] elements;
    MyString(){}
    MyString(String k){
        elements=k.toCharArray();
    }
    public void replaceLast(char m , char k){
        for(int i=elements.length-1 ; i>=0 ; i--){
            if(elements[i]==m){
                elements[i]= k;
                break ;
            }
        }
        for(int i=0; i<elements.length ; i++){
            System.out.print(elements[i]);
        }
    }
}
            