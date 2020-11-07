public class StudentTester
{
    public static void main(String[] args)
    {
        Student a = new Student(98765432,18101001,"A");
        Student b = new Student(98765433,18101002,"B");
        Student c = new Student(98765432,19101234,"A");
        System.out.println(a.check(c));
        a.identify();
        a.match(c);
        c.setName("C");
        a.match(c);
        a.match(b);
    }
}