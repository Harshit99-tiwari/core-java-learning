import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

public class BorderPaneDemo extends Application{
  public void start(Stage stage) throws Exception{

    Button b1 = new Button("one");
    Button b2 = new Button("two");
    Button b3 = new Button("three");
    Button b4 = new Button("four");
    Button b5 = new Button("five");

    BorderPane root = new BorderPane();
    root.setTop(b1);
    root.setBottom(b2);
    root.setCenter(b3);
    root.setLeft(b4);
    root.setRight(b5);
    
        Scene sc = new Scene(root,500,500);
        stage.setScene(sc);
        stage.show();
    }
     public static void main(String[] args) {
        launch(args);
     }
}
