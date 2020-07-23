import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GUI {



    public static void createWindow(){

        JFrame frame = new JFrame("Mouse Clicker");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JLabel label = new JLabel("Time Interval(1sec ~ 100sec): ");
        JTextField textField = new JTextField(5);
        textField.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int var = Integer.parseInt(textField.getText());
            }
        });
        label.setPreferredSize(new Dimension(300,100));
        frame.getContentPane().add(label,BorderLayout.WEST);
        frame.getContentPane().add(textField,BorderLayout.CENTER);
        frame.setLocationRelativeTo(null);
        frame.pack();
        frame.setVisible(true);

    }

}
