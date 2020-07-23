import javax.swing.*;
import java.awt.*;

public class GUI {

    public static void createWindow(){

        JFrame frame = new JFrame("Mouse Clicker");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JLabel label = new JLabel("Time Interval");
        label.setPreferredSize(new Dimension(300,100));
        frame.getContentPane().add(label,BorderLayout.CENTER);
        frame.setLocationRelativeTo(null);
        frame.pack();
        frame.setVisible(true);

    }

}
