class Circle extends Point
{
  Circle(double rad) 
  {
    super(rad);
  }
  double space()
  {
      System.out.println("Creating a Circle....done!");
      double area=Math.PI*Math.pow(getRadius(),2);
      return area;
  }
}