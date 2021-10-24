/*
 *  UCF COP3330 Summer 2021 Application Assignment 1 Solution
 *  Copyright 2021 Gabriel Martin
 */
package MainPackage;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Application extends javafx.application.Application {
    @Override

    public void start(Stage stage) throws Exception {

        Parent root =
                FXMLLoader.load((getClass().getResource("ToDoListGUI.fxml")));
        Scene scene = new Scene(root); // attach scene graph to scene
        stage.setTitle("Tip Calculator"); // displayed in window's title bar
        stage.setScene(scene); // attach scene to stage
        stage.show(); // display the stage
    }

    public static void main(String[] args) {
        // create a TipCalculator object and call its start method
        launch(args);
    }

    public ToDoListManager saveToDoLists() {
        //creates am empty ToDoListManager
        //adds only the ToDoLists with their selected fields set to true
        //returns the newly created ToDoListManager to be saved to a file
        return null;
    }

    public void writeToFile(ToDoListManager selectedLists) {
        //writes the manager created in the function above and loops through
        // its to do lists and each of the items and writes it down in each down on a separate line
        //for example:
            //groceries 2
                //get apple
                    //granny smith
                    //2021-10-31
                //get chicken
                    //tender
                    //2021-10-31
        //the integer after the list name represents the number of items in the list
    }

    public ToDoListManager loadToDoLists() {
        //loads the file that contains a ToDoListManager
        //reads the txt file in the same way described above to populate a new ToDoListManager
        //returns newly made manager
        return null;
    }
}

