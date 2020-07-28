import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class WindowInterface implements Runnable {

    static JTextField textField;
    static int clickDelay;
    static RobotClicker robotClicker;
    static String buttonText = "Start";
    static JButton startStop;
    static Thread thread;

    public static void createWindow(){
        JFrame frame = new JFrame("Mouse Clicker");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setAlwaysOnTop(true);
        frame.setResizable(false);
        JLabel label = new JLabel("Time Interval (sec): ");
        textField = new JTextField("1",5);
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
            clickDelay = 1000 * (Integer.parseInt(textField.getText()));
            robotClicker = new RobotClicker();
            robotClicker.startMouseClick(clickDelay);
        }

        else{
            startStop.setText("Start");
            robotClicker.stopMouseClick();
        }

    }
}
