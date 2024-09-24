package org.UIAutomation.Keyboard;

import java.awt.*;
import java.awt.event.InputEvent;
import java.awt.event.KeyEvent;

public class TaskbarAutomation {
    public static void main(String[] args) throws AWTException {
        Robot robot = new Robot();

        // Move the mouse to the taskbar (adjust the coordinates as needed)
        robot.mouseMove(1500, 750); // Example coordinates

        // Click on the taskbar (left mouse button)
        robot.mousePress(InputEvent.BUTTON1_DOWN_MASK);
        robot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);

        // Simulate keyboard shortcuts, e.g., opening the Start menu
        robot.keyPress(KeyEvent.KEY_LOCATION_NUMPAD);
        robot.keyRelease(KeyEvent.KEY_LOCATION_NUMPAD);
        robot.keyPress(KeyEvent.VK_CAPS_LOCK);
        robot.keyRelease(KeyEvent.VK_CAPS_LOCK);
        robot.keyPress(KeyEvent.VK_WINDOWS);
        robot.keyRelease(KeyEvent.VK_WINDOWS);
    }
}
