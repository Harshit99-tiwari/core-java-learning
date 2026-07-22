import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class GridPaneDemo extends Application{
 public void start(Stage stage) throws Exception{

    Button b1 = new Button("one");
    Button b2 = new Button("two");
    Button b3 = new Button("three");
    Button b4 = new Button("four");
    Button b5 = new Button("five");

       GridPane root =  new GridPane();
       root.add(b1, 0, 0);
       root.add(b2, 1, 0);
       root.add(b3, 2, 0);
       root.add(b4, 0, 1);
       root.add(b5, 1, 1);
        Scene sc = new Scene(root,500,500);
        stage.setScene(sc);
        stage.show();
    }
     public static void main(String[] args) {
        launch(args);
     }
}
