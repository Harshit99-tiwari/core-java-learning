import javafx.application.Application;
import javafx.scene.*;
import javafx.scene.control.*;
import javafx.scene.layout.FlowPane;
import javafx.scene.paint.*;
import javafx.stage.Stage;
public class PropertyDemo extends Application
{
    public void start(Stage stage) throws Exception
    {
         Button b = new Button("_Click me");
         b.setTextFill(Color.BLUE);
         b.setMnemonicParsing(true);

         Tooltip tp = new Tooltip("click to save data");
         b.setTooltip(tp);
        b.setStyle("-fx-border-color:yellow;-fx-background-color-red;");
        
         FlowPane fp = new FlowPane(b);

         Scene sc = new Scene(fp,400,400);
         stage.setScene(sc);
         stage.show();

    }
    public static void main(String[] args) {
        launch(args);
    }
}
