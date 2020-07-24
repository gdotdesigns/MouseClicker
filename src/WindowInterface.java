import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class WindowInterface {

    JTextField textField;
    int clickDelay;
    RobotClicker robotClicker;

    public void createWindow(){
        JFrame frame = new JFrame("Mouse Clicker");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JLabel label = new JLabel("Time Interval(1sec ~ 100sec): ");
        textField = new JTextField(5);
        label.setPreferredSize(new Dimension(300,100));
        JButton startStop = new JButton("Start");
        frame.getContentPane().add(label,BorderLayout.WEST);
        frame.getContentPane().add(startStop,BorderLayout.EAST);
        frame.getContentPane().add(textField,BorderLayout.CENTER);
        frame.setLocationRelativeTo(null);
        frame.pack();
        frame.setVisible(true);


        startStop.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                clickDelay = Integer.parseInt(textField.getText());
                robotClicker = new RobotClicker();
                robotClicker.startMouseClick(clickDelay);

            }
        });
    }

}
