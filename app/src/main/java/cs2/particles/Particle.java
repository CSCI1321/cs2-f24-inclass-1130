package cs2.particles;

import cs2.util.Vec2;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;

public class Particle {
  private Vec2 pos;
  private Vec2 vel;
  private double sz;
  private Color col;

  public Particle(Vec2 p, Vec2 v) {
    this.pos = p;
    this.vel = v;
    this.sz = 20;
    this.col = Color.rgb(50,50,200, 0.4);
  }

  public void display(GraphicsContext g) {
    g.setFill(this.col);
    g.fillOval(this.pos.getX(),this.pos.getY(), this.sz,this.sz);
  }

  public void update() {
    this.pos = this.pos.add(this.vel);
  }

  public void addForce(Vec2 f) {
    this.vel.addThis(f);
  }


}
