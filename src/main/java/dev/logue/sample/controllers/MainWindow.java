package dev.logue.sample.controllers;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.layout.VBox;
import lombok.extern.slf4j.Slf4j;
import net.rgielen.fxweaver.core.FxControllerAndView;
import net.rgielen.fxweaver.core.FxmlView;
import org.springframework.stereotype.Component;

@Component
@FxmlView
@Slf4j
public class MainWindow {

  private final FxControllerAndView<SomeDialog, VBox> someDialog;

  @FXML public Button openDialogButton;

  public MainWindow(FxControllerAndView<SomeDialog, VBox> someDialog) {
    log.info("🔧 MainWindow Controller");
    this.someDialog = someDialog;
  }

  @FXML
  public void initialize() {
    log.info("🔧 Initialize MainWindow Controller");
    openDialogButton.setOnAction(actionEvent -> someDialog.getController().show());
  }
}
