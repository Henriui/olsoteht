package com.tehtava8;

import java.io.IOException;

import controller.NoppaController;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.GridPane;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class NoppaApplication extends Application implements IView {
    private static Scene scene;
    private static NoppaController controller;
    private Text text;
    private ImageView image;
    @Override
    public void start(Stage stage) throws IOException {
        
        GridPane grid = new GridPane();
        text = new Text("");
        Button btn1 = new Button("Heitä noppaa.");
        image = new ImageView();

        grid.setAlignment(Pos.CENTER);
        grid.setVgap(20);
        grid.setHgap(30);
        grid.setPadding(new Insets(30,30,30,30));

        scene = new Scene(grid, 640, 480);

        btn1.setOnAction(new EventHandler<ActionEvent>() {
            
            public void handle(ActionEvent event){

                // yksittäinen noppa
        
                // controller.heitaNoppa(); 

                // 5 eri noppaa

                controller.heitaNoppia(); 
            }
        });

        grid.add(text , 0, 0, 5, 1);
        grid.add(image, 0,  0, 4, 1);
        grid.add(btn1, 0, 1);
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    } 

    @Override
    public void init(){
        controller = new NoppaController(this);
    }

    @Override
    public void setTulos(String tulos) {
        text.setText(tulos);
        
    }

    @Override
    public void setKuvaTulos(Image tulosKuva) {
        image.setImage(tulosKuva);
    }

     
}
