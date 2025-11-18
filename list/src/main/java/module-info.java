module ua.opnu.list {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires java.desktop;
    opens ua.opnu.list to javafx.fxml;
    exports ua.opnu.list;
}