package com.tehtava8;

import java.io.IOException;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.GridPane;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class TervehdysApplication extends Application{
    
    private static Scene scene;

    @Override
    public void start(Stage stage) throws IOException {
        GridPane grid = new GridPane();
        grid.setAlignment(Pos.CENTER);
        grid.setVgap(20);
        grid.setHgap(30);
        grid.setPadding(new Insets(30,30,30,30));
        scene = new Scene(grid, 640, 480);

        Text text = new Text("Paina jotain.");
        Button btn1 = new Button("Aamu");
        Button btn2 = new Button("Päivä");
        Button btn3 = new Button("Ilta");
        Button btn4 = new Button("Yö");
        
        btn1.setOnAction(new EventHandler<ActionEvent>() {
            public void handle(ActionEvent event){
                text.setText("Huomenta");
            }
        });
        btn2.setOnAction(new EventHandler<ActionEvent>() {
            public void handle(ActionEvent event){
                text.setText("Päivää");
            }
        });
        btn3.setOnAction(new EventHandler<ActionEvent>() {
            public void handle(ActionEvent event){
                text.setText("Iltaa");
            }
        });
        btn4.setOnAction(new EventHandler<ActionEvent>() {
            public void handle(ActionEvent event){
                text.setText("Yötä");
            }
        });

        grid.add(text , 0, 0, 5, 1);
        grid.add(btn1, 0, 1);
        grid.add(btn2, 1, 1);
        grid.add(btn3, 2, 1);
        grid.add(btn4, 3, 1);
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }

}
