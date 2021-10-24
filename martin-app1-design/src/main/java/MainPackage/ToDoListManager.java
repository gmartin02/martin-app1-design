/*
 *  UCF COP3330 Summer 2021 Application Assignment 1 Solution
 *  Copyright 2021 Gabriel Martin
 */
package MainPackage;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class ToDoListManager {
    List<ToDoList> manager = new ArrayList<>();
    String fileLocation;
    File file = new File(fileLocation);

    public String getFileLocation() {
        //returns file location provided by user
        return null;
    }

    public void deleteList(ToDoList tdl) {
        //gets the list selected in the GUI and ensures that it exists in the manager
        //using its index it is removed from the list
    }

    public ToDoList createList() {
        ToDoList tdl = new ToDoList();
        //gets the title, description, and dueDate from the GUI
        return tdl;
    }

    public void ediTitle(ToDoList tdl) {
        //changes the title of the list by prompting for a new name and reassigning title
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
