import controller.CoderController;
import database.ConfigDB;
import model.CoderModel;

import javax.swing.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        String option = "";

        do {
            option = JOptionPane.showInputDialog("""
                    1. List Coders.
                    2. Insert Coder.
                    3. Update Coder.
                    4. Delete Coder.
                    5. Get coder by name.
                    6. Exit
                                        
                    Choose an option:
                    """);
            switch (option) {
                case "1":
                    CoderController.getAll();
                    break;

                case "2":
                    CoderController.create();
                    break;

                case "4":
                    CoderController.delete();
                    break;

                case "5":
                    CoderController.getByName();
                    break;
            }

        } while (!option.equals("6"));
    }
}