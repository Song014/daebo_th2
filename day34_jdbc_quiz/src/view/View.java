package view;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.SQLException;

import controller.Controller;

public class View {
    public static void main(String[] args) throws ClassNotFoundException, SQLException, NumberFormatException, IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        Controller.menu();
    }
}
