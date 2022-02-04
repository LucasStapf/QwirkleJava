module com.qwirkle.qwirkle {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.qwirkle.qwirkle to javafx.fxml;
    exports com.qwirkle.qwirkle;
}