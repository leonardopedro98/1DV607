package sample;

import javafx.application.Application;
import javafx.beans.property.SimpleStringProperty;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.geometry.Insets;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.stage.Stage;


public class Main extends Application {

    private TableView<Member> table = new TableView<>();
    private final ObservableList< Member> MemberList =
            FXCollections.observableArrayList(
                    new  Member("Leonardo", "Pedro", "991112-9541",1),
                    new  Member("Loic", "Galland", "981202-3592",2),
                    new  Member("Anas", "Kwefati", "923202-3532",3)
            );

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage stage) {
        Scene scene = new Scene(new Group());
        stage.setTitle("Table View Sample");
        stage.setWidth(450);
        stage.setHeight(500);


        table.setEditable(true);

        TableColumn firstNameCol = new TableColumn("First Name");
        firstNameCol.setMinWidth(100);
        firstNameCol.setCellValueFactory(
                new PropertyValueFactory<Member, String>("firstName"));

        TableColumn lastNameCol = new TableColumn("Last Name");
        lastNameCol.setMinWidth(100);
        lastNameCol.setCellValueFactory(
                new PropertyValueFactory<Member, String>("lastName"));

        TableColumn PNCol = new TableColumn("Personal Number");
        PNCol.setMinWidth(200);
        PNCol.setCellValueFactory(
                new PropertyValueFactory<Member, String>("PN"));




        table.setItems(MemberList);
        table.getColumns().addAll(firstNameCol, lastNameCol, PNCol);

        final VBox vbox = new VBox();
        vbox.setSpacing(5);
        vbox.setPadding(new Insets(10, 0, 0, 10));
        vbox.getChildren().addAll(table);

        ((Group) scene.getRoot()).getChildren().addAll(vbox,table);

        stage.setScene(scene);
        stage.show();
    }


}