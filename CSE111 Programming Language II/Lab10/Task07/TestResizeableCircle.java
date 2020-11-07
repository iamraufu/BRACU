public class TestResizeableCircle{
    public static void main(String[] args){
        ResizeableCircle r = new ResizeableCircle();
        r.resize(40);
        System.out.println(r.radius);
        System.out.println(r.getPerimeter());
        System.out.println(r.getArea());
    }
}