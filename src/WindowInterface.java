import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class WindowInterface implements Runnable {

    static JTextField textField;
    static int clickDelay;
    static RobotClicker robotClicker;
    String buttonText = "Start";
    static JButton startStop;
    Thread thread;

    public void createWindow(){
        JFrame frame = new JFrame("Mouse Clicker");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JLabel label = new JLabel("Time Interval (ms): ");
        textField = new JTextField(5);
        label.setPreferredSize(new Dimension(300,100));
        startStop = new JButton(buttonText);
        frame.getContentPane().add(label,BorderLayout.WEST);
        frame.getContentPane().add(startStop,BorderLayout.EAST);
        frame.getContentPane().add(textField,BorderLayout.CENTER);
        frame.setLocationRelativeTo(null);
        frame.pack();
        frame.setVisible(true);


        startStop.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                thread = new Thread(new WindowInterface());
                thread.start();
            }
        });
    }

    @Override
    public void run() {
        if(startStop.getText() == "Start"){
            startStop.setText("Stop");
            clickDelay = Integer.parseInt(textField.getText());
            robotClicker = new RobotClicker();
            robotClicker.startMouseClick(clickDelay);
        }

        else{
            startStop.setText("Start");
            robotClicker.stopMouseClick();
        }

    }
}
