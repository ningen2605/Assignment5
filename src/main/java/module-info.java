module rabuabara.assignment5 {
    requires javafx.controls;
    requires javafx.fxml;
    requires junit;


    opens rabuabara.assignment5 to javafx.fxml;
    exports rabuabara.assignment5;
}