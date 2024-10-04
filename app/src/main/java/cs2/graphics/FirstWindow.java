package cs2.graphics;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.ArcType;
import javafx.scene.shape.StrokeLineCap;
import javafx.stage.Stage;

public class FirstWindow extends Application {
  public void start(Stage primaryStage) {
    Canvas canvas = new Canvas(400, 600);
    Scene scene = new Scene(new StackPane(canvas));
    primaryStage.setScene(scene);
    primaryStage.setTitle("My First Window");
    primaryStage.show();

    GraphicsContext g = canvas.getGraphicsContext2D();

    g.setFill(Color.rgb(40,200,80));
    g.fillRect(100,100, 200,400);

    g.setFill(Color.ANTIQUEWHITE);
    g.setStroke(Color.BLACK);
    g.fillOval(25,100, 150,200);
    g.fillOval(225,100, 150,200);
    g.strokeOval(25,100, 150,200);
    g.strokeOval(225,100, 150,200);

    g.setFill(Color.BLACK);
    g.fillOval(100,175, 50,50);
    g.fillOval(250,175, 50,50);

    g.setLineWidth(45);
    g.setLineCap(StrokeLineCap.ROUND);
    g.strokeLine(150,400, 250,400);

    g.setLineWidth(2);
    g.strokeArc(175,300, 50,100, 90, 135, ArcType.OPEN);

  }
  
}
