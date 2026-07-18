import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.PrintStream;
import java.util.HashMap;
import java.util.Scanner;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.stage.Stage;

class Customer{
    private int custid;
    private String name;
    private String address;

   public  Customer(int c,String n,String a)
    {
       custid = c;
       name = n;
       address = a;
    }
    public int getId(){return custid;}
    public String getName(){return name;}
    public String getAddress(){return address;}

    public void SetAddress(String add){
        address = add;
    }
}
public class ComboBoxdemo extends Application {
    int count = 0;

    public void start(Stage stage) throws Exception {
        HashMap<Integer,Customer> hm = new HashMap<>();

        Font f = new Font("Times New Roman", 20);
        Label l1 = new Label("Customer ID");
        l1.setFont(f);
        Label l2 = new Label("Name");
        l2.setFont(f);
        Label l3 = new Label("Address");
        l3.setFont(f);

        ComboBox<Integer> cust = new ComboBox<>();
        cust.setStyle("-fx-font-size:20");
        TextField name = new TextField();
        name.setFont(f);
        TextField add = new TextField();
        add.setFont(f);
        name.setPrefColumnCount(15);
        add.setPrefColumnCount(20);

        Button save = new Button("Save");
        Button create = new Button("Create");
        Button search = new Button("Search");

        create.setOnAction(e->{
            count++;
            cust.getItems().add(count);
            cust.setValue(count);
            name.setText("");
            add.setText("");
        });
        save.setOnAction(e->{
            Customer c = new Customer(cust.getValue(),name.getText(),add.getText());
            hm.put(count, c);

            try(PrintStream ps = new PrintStream(new FileOutputStream("Customer.txt")))
            {
                    for(Customer ct: hm.values()){
                        ps.print(ct.getId());
                        ps.print(ct.getName());
                        ps.print(ct.getAddress());
                    }
            }
            catch(Exception ep){}
        });

        HBox hb1 = new HBox();
        HBox hb2 = new HBox();
        HBox hb3 = new HBox();
        HBox hb4 = new HBox();
        hb1.getChildren().addAll(l1, cust);
        hb2.getChildren().addAll(l2, name);
        hb3.getChildren().addAll(l3, add);
        hb4.getChildren().addAll(create, save, search);

        VBox vb = new VBox();
        vb.getChildren().addAll(hb1, hb2, hb3, hb4);
        
          try(Scanner sc= new Scanner(new FileInputStream("Customer.txt")))
            {
                 int c;
                 String n;
                 String a;
                 while(sc.hasNext()){
                    c = sc.nextInt();
                    n = sc.next();
                    a = sc.next();
                    hm.put(c,new Customer(c, n, a));
                    if(c>count)count = c;
                    cust.getItems().add(c);
                 }
            }
            catch(Exception ep){}
            cust.valueProperty().addListener(e->{
                int c = cust.getValue();
                Customer ct = hm.get(c);
                name.setText(ct.getName());
                add.setText(ct.getAddress());
            });
        Scene sc = new Scene(vb, 500, 500);
        stage.setScene(sc);
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
