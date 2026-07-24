import java.io.FileInputStream;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.ScrollPane;
import javafx.scene.control.Tab;
import javafx.scene.control.TabPane;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;

public class TabPaneDemo extends Application{
 public void start(Stage stage) throws Exception {

        ImageView iv1 = null;
        ImageView iv2 = null;
        ImageView iv3 = null;

        

        iv1 = new ImageView(new Image(new FileInputStream("images/temple.jpg")));
        iv2 = new ImageView(new Image(new FileInputStream("images/taj.jpeg")));
        iv3 = new ImageView(new Image(new FileInputStream("images/effil.jpg")));
        
        ScrollPane sp1 = new ScrollPane(iv1);
        ScrollPane sp2 = new ScrollPane(iv2);
        ScrollPane sp3 = new ScrollPane(iv3);
         Tab t1 = new Tab("Temple",sp1);
         Tab t2 = new Tab("Taj",sp2);
         Tab t3 = new Tab("Effil",sp3);

         TabPane root = new TabPane();
         root.getTabs().addAll(t1,t2,t3);

        Scene sc = new Scene(root,500,500);
        stage.setScene(sc);
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
