package cs2.util;

public class Vec2 {
  private double x, y;
  public Vec2() { }
  public Vec2(double ix, double iy) {
    this.x = ix; this.y = iy;
  }
  public static Vec2 random(double span) {
    return new Vec2(Math.random() * 2*span - span, Math.random() * 2*span - span);
  }
  public double getX() { return this.x; }
  public double getY() { return this.y; }
  public Vec2 addThis(Vec2 other) {
    this.x += other.x;
    this.y += other.y;
    return this;
  }
  public Vec2 add(Vec2 other) {
    return new Vec2(this.x + other.x, this.y + other.y);
  }
  public Vec2 clone() {
    return new Vec2(this.x, this.y);
  }
}
