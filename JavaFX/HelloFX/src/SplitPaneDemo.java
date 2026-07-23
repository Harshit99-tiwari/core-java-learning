import java.io.FileInputStream;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.ScrollPane;
import javafx.scene.control.SplitPane;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;

public class SplitPaneDemo extends Application {
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
        SplitPane root = new SplitPane(sp1,sp2,sp3);
        root.setDividerPositions(0.33,0.66);

        Scene sc = new Scene(root,500,500);
        stage.setScene(sc);
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
