public class Q1 {
    public static void main(String[] args) { 
        int x = 1, y = 0, sum = 0;
        while (x < 10) {
            y = 40;
            while (y > 22) {
                if ((sum > 40) || (sum < 100)) {
                    sum += x * 3;
                }
                if ((sum > 20) || (sum < 60)) {
                    sum += x * 2;  
                } else {
                    sum += 23;
                }
                System.out.println(sum+y);
                y -= 10;
            }
            x += 2;
        }
        int a=1,b=20,c=sum++;
        int d=a+=b+=c+=4000;
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
    }
}
