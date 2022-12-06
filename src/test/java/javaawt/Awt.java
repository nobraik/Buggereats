package javaawt;

import java.awt.*;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

public class Awt {


public void uplodCnh() throws AWTException {

    Robot robot = new Robot();
    robot.delay(800);
    StringSelection ss = new StringSelection("C:\\Users\\decio.silva\\Pictures\\Screenshots\\cnhfalsa.jpg");
    Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss,null);
    robot.keyPress(KeyEvent.VK_CONTROL);
    robot.keyPress(KeyEvent.VK_V);
    robot.keyRelease(KeyEvent.VK_CONTROL);
    robot.delay(700);
    robot.keyRelease(KeyEvent.VK_V);
    robot.delay(700);
    robot.keyPress(KeyEvent.VK_ENTER);
    robot.keyRelease(KeyEvent.VK_ENTER);
    robot.delay(700);

}
}
