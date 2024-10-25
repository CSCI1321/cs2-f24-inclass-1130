package cs2.particles;

import java.util.ArrayList;
import cs2.util.Vec2;
import javafx.scene.canvas.GraphicsContext;

public class ParticleSystem {
  private ArrayList<Particle> parts = new ArrayList<Particle>();
  private Vec2 origin;

  public ParticleSystem() {
    origin = new Vec2();
  }
  public ParticleSystem(Vec2 o) {
    origin = o;
  }

  public void addParticle() {
    this.parts.add(0, new RainbowParticle(this.origin.clone(), Vec2.random(1)));
    
    //this.parts.add(0, new ImageParticle(this.origin.clone(), Vec2.random(1)));

    /*
    if(Math.random() < 0.5) {
      this.parts.add(new SquareParticle(this.origin.clone(), Vec2.random(5)));
    } else {
      this.parts.add(new RoundParticle(this.origin.clone(), Vec2.random(5)));
    }*/

  }
  public void display(GraphicsContext g) {
    for(int i=0; i<this.parts.size(); i++) {
      this.parts.get(i).display(g);
    }
  }
  public void update() {
    for(Particle p : this.parts) {
      p.update();
    }
  }
  public void addForce(Vec2 f) {
    for(Particle p : this.parts) { p.addForce(f); }
  }




}
