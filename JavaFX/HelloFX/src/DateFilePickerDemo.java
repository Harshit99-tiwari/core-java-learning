import java.io.FileInputStream;
import java.util.Scanner;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ColorPicker;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Slider;
import javafx.scene.control.TextArea;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.stage.FileChooser;
import javafx.stage.Stage;

public class DateFilePickerDemo extends Application {

     public void start(Stage stage) throws Exception{

    TextArea ta = new TextArea();
    ta.setPrefColumnCount(100);
    ta.setPrefRowCount(100);

    Slider sl = new Slider(10,50,10);
    sl.setMajorTickUnit(5);
    sl.setShowTickMarks(true);

    sl.valueProperty().addListener(e->ta.setFont(Font.font(sl.getValue())));

    DatePicker dp = new DatePicker();
    dp.setShowWeekNumbers(true);
    dp.setOnAction(e->ta.setText("Date :"+dp.getValue() /*+"\n"+ta.getText()*/));

    ColorPicker cp = new ColorPicker();
    cp.setOnAction(e->{
        ta.setStyle("-fx-text-fill:#"+cp.getValue().toString().substring(2,8));
        ta.setText(cp.getValue()+"\n"+ta.getText());
    });

    Button b = new Button("open file");
    b.setOnAction(e->{
        FileChooser fc = new FileChooser();
        java.io.File file = fc.showOpenDialog(stage);
        try(Scanner sc = new Scanner(new FileInputStream(file)))
        {
            String str = "";
            while(sc.hasNext())
                str = str+sc.nextLine()+"\n";
            ta.setText(str);
        }
        catch(Exception ex)
        {
          ta.setText("select valid file");
        }
    });

    VBox vb = new VBox();
    vb.setAlignment(Pos.TOP_CENTER);
    vb.getChildren().addAll(ta,sl,dp,cp,b);

        Scene sc = new Scene(vb,600,600);
        stage.setScene(sc);
        stage.show();
   }
    public static void main(String[] args) {
        launch(args);
    }
}
