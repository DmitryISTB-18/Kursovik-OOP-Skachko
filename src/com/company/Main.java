package com.company;
import javax.swing.SwingUtilities;
import java.sql.SQLException;

public class Main {

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable(){
            public void run() {
                try {
                    ControllerAndView osn = new ControllerAndView();
                } catch (SQLException | ClassNotFoundException throwables) {
                    throwables.printStackTrace();
                }
            }
        });
    }
}