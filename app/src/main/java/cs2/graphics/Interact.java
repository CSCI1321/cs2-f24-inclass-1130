package cs2.graphics;

import javafx.animation.AnimationTimer;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class Interact extends Application {
  public double x = 0;
  public double y = 0;

  public void start(Stage primaryStage) {
    Canvas canvas = new Canvas(600, 600);
    Scene scene = new Scene(new StackPane(canvas));
    primaryStage.setScene(scene);
    primaryStage.setTitle("Drawing!");
    primaryStage.show();

    GraphicsContext g = canvas.getGraphicsContext2D();
   
    canvas.requestFocus();
    
    canvas.setOnKeyPressed( (KeyEvent e) -> {
      if(e.getCode() == KeyCode.SPACE) {
        g.setFill(Color.WHITE);
        g.fillRect(0,0, 600,600);
      }
      if(e.getCode() == KeyCode.P) {
        g.setFill(Color.VIOLET);
        g.fillRect(0,0, 600,600);
      }
    });

    canvas.setOnMouseDragged( (MouseEvent e) -> {
      g.setStroke(Color.rgb(0, 0, 0, 1));
      g.strokeLine(x,y, e.getX(),e.getY());
      x = e.getX();
      y = e.getY();
      //System.out.println("HERE!" + e.getX());
    });


    
    g.setFill(Color.RED);
    AnimationTimer timer = new AnimationTimer() {
      double px = 100;
      double py = 100;
      public void handle(long t) {
        g.fillOval(px,py, 100,100);
        px += 1;
      }
    };
    timer.start();

  }
}
