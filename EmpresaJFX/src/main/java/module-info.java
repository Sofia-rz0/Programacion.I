module co.edu.uniquindio.poo.empresajfx {
    requires javafx.controls;
    requires javafx.fxml;

    opens co.edu.uniquindio.poo to javafx.fxml;
    exports co.edu.uniquindio.poo.empresajfx;
    exports co.edu.uniquindio.poo.empresajfx.viewController;
    opens co.edu.uniquindio.poo.viewController to javafx.fxml;

}