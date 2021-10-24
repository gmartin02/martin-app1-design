/*
 *  UCF COP3330 Summer 2021 Application Assignment 1 Solution
 *  Copyright 2021 Gabriel Martin
 */
package MainPackage;

public class Item {
    String name;
    String description;
    String dueDate;
    boolean completion = false;

    public String getName() {
        //gets item name from the user
        return null;
    }

    public String getDescription() {
        //gets item description from the user
        return null;
    }

    public String getDueDate() {
        //gets item due date from the user
        //validates the input to match 'YYYY-MM-DD'
        return null;
    }

    public Item createItem() {
        //sets the name, description, and due date for a new item
        //completion is set to false by default

        return null;
    }
    public void editDescription() {
        //takes in a new description from the GUI and replaces the old one
    }

    public void editDueDate() {
        //takes in a new due date from the GUI and replaces the old one
    }

    public void changeCompletion() {
        //when activated changes completion from false to true or vice versa
        //will be a checkbox in the GUI so a check = true, empty = false
    }
}
