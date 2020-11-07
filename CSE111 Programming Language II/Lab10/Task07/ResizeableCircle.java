public class ResizeableCircle extends Circle implements Resizeable{
    ResizeableCircle(){}
    ResizeableCircle(double k){
    radius=k;
    }
    public void resize(int percent){
        double newradius=(percent/100.0)*radius;
        radius=radius+newradius;
    }
}