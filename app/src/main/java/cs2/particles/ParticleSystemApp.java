package cs2.particles;

import cs2.util.Vec2;
import javafx.animation.AnimationTimer;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.image.Image;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
import java.util.ArrayList;

public class ParticleSystemApp extends Application {
  public static final Image img = new Image("file:smoke.png");
  Vec2 wind = new Vec2();
  public void start(Stage primaryStage) {
    Canvas canvas = new Canvas(600, 600);
    Scene scene = new Scene(new StackPane(canvas));
    primaryStage.setScene(scene);
    primaryStage.setTitle("Particles!");
    primaryStage.show();

    GraphicsContext g = canvas.getGraphicsContext2D();

    ArrayList<ParticleSystem> p = new ArrayList<ParticleSystem>();//(new Vec2(300,300));

    canvas.setOnMouseClicked((MouseEvent e) -> {
      p.add(new ParticleSystem(new Vec2(e.getX(), e.getY())));
    });
    canvas.setOnMouseMoved((MouseEvent e) -> {
      wind = new Vec2(e.getX() / 300 -1, 0);
    });

    ColorPattern bgColor = new RainbowColor();//new SolidColor(Color.DIMGREY);

    AnimationTimer timer = new AnimationTimer() {
      long prevT = 0;
      public void handle(long t) {
        if(t - prevT > 1000/30) {
          prevT = t;
          g.setFill(bgColor.getColor());
          g.fillRect(0,0, 600,600);
          for(ParticleSystem ps : p) {
            ps.addParticle();
            ps.display(g);
            ps.update();
            ps.addForce(new Vec2(0,0.1));
            ps.addForce(wind);
          }
        }
      }
    };
    timer.start();
  
  }
}
