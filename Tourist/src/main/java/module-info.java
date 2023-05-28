module com.maksym.tourist.tourist {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.maksym.tourist.tourist to javafx.fxml;
    exports com.maksym.tourist.tourist;
}