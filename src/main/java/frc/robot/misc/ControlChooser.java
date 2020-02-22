/**
 * @author Hunter Pugh
 */

package frc.robot.misc;

import javax.swing.plaf.basic.BasicOptionPaneUI.ButtonActionListener;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.Victor;
import edu.wpi.first.wpilibj2.command.button.Button;
import edu.wpi.first.wpilibj2.command.button.JoystickButton;
import frc.robot.RobotContainer;
import frc.robot.commands.align.TurnToAngle;
import frc.robot.commands.shooter.shooter;
import frc.robot.commands.shooter.feeder;
import frc.robot.commands.shooter.feederinstant;
import frc.robot.commands.shooter.intake;
import frc.robot.commands.shooter.intake_a_instant;
import frc.robot.commands.shooter.intake_b_instant;
public final class ControlChooser {

    int safetyChecker;

    public static Joystick leftJoy = new Joystick(0);
    public static Joystick rightJoy = new Joystick(1);
    //Define buttons here

    //Button leftjoy3 = new JoystickButton(leftJoy,3).whenPressed(new TurnToAngle(5,RobotContainer.m_driveTrain,RobotContainer.m_gyro,true ).withTimeout(5));
    //Button leftjoy4 = new JoystickButton(leftJoy,4).whenPressed(new TurnToAngle(-5,RobotContainer.m_driveTrain,RobotContainer.m_gyro,true ).withTimeout(5));
    Button shooter_button = new JoystickButton(rightJoy,6).whenPressed(new shooter());
    Button feeder_button = new JoystickButton(rightJoy,4).whenPressed(new feederinstant()); 
    Button intake_a_button = new JoystickButton(rightJoy,3).whenPressed(new intake_a_instant());
    Button intake_b_button = new JoystickButton(rightJoy,5).whenPressed(new intake_b_instant());
  
    public void ControlInit(final int controlMethod) {
        switch (controlMethod) {
        case 0: // Example name: General Flightsticks with DIDBoard
            // Define Joysticks First!
            //exampleJoystick = new Joystick(0);

            // Define Buttons Next
            //exampleButton = new JoystickButton(exampleJoystick, 1);
            break;

        case 1:// Example name: Arlene
               // Define Joysticks First!
            //exampleJoystick = new Joystick(1);

            // Define Buttons Next
           // exampleButton = new JoystickButton(exampleJoystick, 4);
            break;
        }
    }

    private void ControlPeriodic(final int controlMethod) {

        safetyChecker = controlMethod;

        switch (controlMethod) {
        case 0: // Example name: General Flightsticks with DIDBoard
            //exampleRobotDriveX = exampleJoystick.getX();
            //exampleRobotDriveY = exampleJoystick.getY();
            break;

        case 1:// Example name: Arlene
            //exampleRobotDriveX = exampleJoystick.getZ();
            //exampleRobotDriveY = exampleJoystick.getX();
            break;
        }
    }

    // This checks to see if the driver has changed control input and will
    // re-initialize if so.
    public void ControlSafety(final int controlMethod) {
        if(controlMethod == safetyChecker){
            ControlPeriodic(controlMethod);
        } else {
            ControlInit(controlMethod);
            ControlPeriodic(controlMethod);
        }
    }
}