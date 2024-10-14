package cs2.particles;

import cs2.util.Vec2;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class ParticleSystemApp extends Application {
  public void start(Stage primaryStage) {
    Canvas canvas = new Canvas(600, 600);
    Scene scene = new Scene(new StackPane(canvas));
    primaryStage.setScene(scene);
    primaryStage.setTitle("Particles!");
    primaryStage.show();

    GraphicsContext g = canvas.getGraphicsContext2D();

    Particle p = new Particle(new Vec2(), new Vec2());
    
    
    p.display(g);
    p.update();


  }
}
