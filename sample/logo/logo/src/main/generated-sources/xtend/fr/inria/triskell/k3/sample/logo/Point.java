package fr.inria.triskell.k3.sample.logo;

@SuppressWarnings("all")
public class Point {
  public double x;
  
  public double y;
  
  public Point(final double a, final double b) {
    this.x = a;
    this.y = b;
  }
  
  public Point getDelta(final double dx, final double dy) {
    Point _point = new Point(0, 0);
    Point res = _point;
    double _plus = (this.x + dx);
    res.x = _plus;
    double _plus_1 = (this.y + dy);
    res.y = _plus_1;
    return res;
  }
  
  public String toString() {
    String _plus = ("[" + Integer.valueOf(((int) this.x)));
    String _plus_1 = (_plus + ",");
    String _plus_2 = (_plus_1 + Integer.valueOf(((int) this.y)));
    return (_plus_2 + "]");
  }
}
