package pizza;

import javax.swing.*;
import java.awt.*;
import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {
        JFrame myFrame = new JFrame();
        myFrame.setSize(1024, 768);
        myFrame.setLocationRelativeTo(null);
        myFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        myFrame.setTitle("MyPanel");
        myFrame.add(new PizzaPanel());
        myFrame.setVisible(true);

    }
}
