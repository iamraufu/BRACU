public class MyString{
    private char [] elements;
    MyString(){}
    MyString(String k){
    elements=k.toCharArray();
    }
    public void toLowerCase(){
        for(int i= 0 ; i<elements.length ; i++){
            int ch=elements[i];
            if(ch>=91&&ch<=122){
                ch=ch-32;
                System.out.print((char)ch);
            }
            else if(ch==32){
                System.out.print(" ");
            }
        }
    }
}
        