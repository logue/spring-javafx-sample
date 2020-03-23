package dev.logue.sample.controllers;

import javafx.fxml.FXML;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import lombok.extern.slf4j.Slf4j;
import net.rgielen.fxweaver.core.FxmlView;
import org.springframework.stereotype.Component;

/**
 * DialogController.
 *
 * @author Rene Gielen
 * @noinspection WeakerAccess
 */
@Component
@FxmlView
@Slf4j
public class SomeDialog {

    private Stage stage;

    @FXML
    private Button closeButton;
    @FXML
    private VBox dialog;

    @FXML
    public void initialize() {
        log.info("🔧 Initialize SomeDialog Controller");
        this.stage = new Stage();
        stage.setScene(new Scene(dialog));

        closeButton.setOnAction(actionEvent -> stage.close());
    }

    public void show() {
        log.info("🔧 Show SomeDialog");
        stage.show();
    }

}
