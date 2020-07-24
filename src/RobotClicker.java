import java.awt.*;
import java.awt.event.InputEvent;

public class RobotClicker {

    public static void mouseClick( int a ) throws AWTException {

        Robot robot = new Robot();
        robot.mousePress(InputEvent.BUTTON1_DOWN_MASK);
        robot.delay(a);
        robot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);





    }


}
