public class MyString{
    private char [] elements;
    MyString(){}
    MyString(String k){
        elements=k.toCharArray();
    }
    public int compareTo(MyString k){
        for(int v=0 ; v<elements.length ; v++){
            if(elements[v] != k.elements[v]){
                int s=(int)(elements[v]);
                int f=(int)(k.elements[v]);
                int sum=s-f;
                return sum;
            }
        }
        return 0;
    }
}