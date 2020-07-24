import java.awt.*;
import java.awt.event.InputEvent;


public class RobotClicker {

    Robot robot;
    boolean shouldStart = true;


    {
        try {
            robot = new Robot();
        } catch (AWTException e) {
            e.printStackTrace();
        }
    }

    public void startMouseClick( int a ) {

        while (shouldStart) {
            robot.mousePress(InputEvent.BUTTON1_DOWN_MASK);
            robot.delay(100);
            robot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
            robot.delay(a);
        }
    }


    public void stopMouseClick(){
        shouldStart = false;
    }
}
