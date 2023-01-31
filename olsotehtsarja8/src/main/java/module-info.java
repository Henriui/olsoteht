module com.tehtava8 {
    requires javafx.controls;
    requires javafx.fxml;

    opens com.tehtava8 to javafx.fxml;
    exports com.tehtava8;

}
