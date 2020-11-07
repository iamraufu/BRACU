class Sphere extends Point
{
  Sphere(double rad) 
  {
    super(rad);
  }
  double space()
  {
      System.out.println("Creating a Sphere....done!");
      double area=4*Math.PI*Math.pow(getRadius(),2);
      return area;
  }
}