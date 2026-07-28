import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class VBoxDemo extends Application {
     public void start(Stage stage) throws Exception{

    Button b1 = new Button("one");
    Button b2 = new Button("two");
    Button b3 = new Button("three");
    Button b4 = new Button("four");
    Button b5 = new Button("five");

    VBox vb = new VBox();
    vb.getChildren().addAll(b1,b2,b3,b4,b5);

    BorderPane root = new BorderPane();
    
    root.setBottom(vb);
   
    
        Scene sc = new Scene(root,500,500);
        stage.setScene(sc);
        stage.show();
    }
     public static void main(String[] args) {
        launch(args);
     }
}
