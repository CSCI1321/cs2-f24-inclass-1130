package cs2.particles;

import cs2.util.Vec2;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;

public abstract class Particle {
  protected Vec2 pos;
  protected Vec2 vel;
  protected double sz;
  protected ColorPattern cp;

  public Particle(Vec2 p, Vec2 v) {
    this.pos = p;
    this.vel = v;
    this.sz = 20;
    this.cp = new RainbowColor();//new SolidColor(Color.rgb(50,50,200, 0.4));
  }

  public abstract void display(GraphicsContext g); 

  public void update() {
    this.pos = this.pos.add(this.vel);
  }

  public void addForce(Vec2 f) {
    this.vel.addThis(f);
  }


}
