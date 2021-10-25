package MainPackage;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;

import java.awt.event.ActionEvent;
import java.io.IOException;
import java.util.Objects;

public class ToDoListGUIController {
    public void changeToLoadFileSceneOnButtonPress(MouseEvent event) throws IOException {
        Parent loadFileParent = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("LoadFile.fxml")));
        Scene loadFileScene = new Scene(loadFileParent);

        Stage window = (Stage)((Node) event.getSource()).getScene().getWindow();

        window.setScene(loadFileScene);
        window.show();
    }

    public void changeToMakeNewFileSceneOnButtonPress(MouseEvent event) throws IOException {
        Parent loadFileParent = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("MakeNewFile.fxml")));
        Scene loadFileScene = new Scene(loadFileParent);

        Stage window = (Stage)((Node) event.getSource()).getScene().getWindow();

        window.setScene(loadFileScene);
        window.show();
    }

    public void closeWindowOnExitButtonPress(MouseEvent event) {
        Stage window = (Stage)((Node) event.getSource()).getScene().getWindow();
        window.close();
    }
}
