/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018-2019 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot;

import edu.wpi.first.wpilibj.GenericHID;
import edu.wpi.first.wpilibj.XboxController;
import edu.wpi.first.wpilibj.drive.DifferentialDrive;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;
import frc.robot.commands.controlpanel.ControlPanelIndex;
import frc.robot.commands.DriveTrain_TankDrive;
import frc.robot.subsystems.ControlPanel;
import frc.robot.subsystems.DriveTrain;
import frc.robot.subsystems.LIDAR;
import frc.robot.subsystems.gyro;
import edu.wpi.first.wpilibj2.command.Command;

/**
 * This class is where the bulk of the robot should be declared.  Since Command-based is a
 * "declarative" paradigm, very little robot logic should actually be handled in the {@link Robot}
 * periodic methods (other than the scheduler calls).  Instead, the structure of the robot
 * (including subsystems, commands, and button mappings) should be declared here.
 */
public class RobotContainer {
  // The robot's subsystems and commands are defined here...
  public static final ControlPanel m_controlPanel = new ControlPanel();
  public static final DriveTrain m_driveTrain = new DriveTrain();
  public static final Command m_tankDrive = new DriveTrain_TankDrive(m_driveTrain);
  private final ControlPanelIndex m_controlPanelIndex = new ControlPanelIndex(m_controlPanel);
<<<<<<< HEAD
 public static final LIDAR m_LIDAR = new LIDAR();
 public static final gyro m_gyro = new gyro();

=======
  public static final LIDAR m_LIDAR = new LIDAR();
  public static final gyro m_gyro = new gyro();
>>>>>>> 830216b79c58d5a917c53291fc96fce21512f61b

  /**
   * The container for the robot.  Contains subsystems, OI devices, and commands.
   */
  public RobotContainer() {
    // Configure the button bindings
    configureButtonBindings();

    SmartDashboard.putData("Control Panel Index", m_controlPanelIndex);
  }

  /**
   * Use this method to define your button->command mappings.  Buttons can be created by
   * instantiating a {@link GenericHID} or one of its subclasses ({@link
   * edu.wpi.first.wpilibj.Joystick} or {@link XboxController}), and then passing it to a
   * {@link edu.wpi.first.wpilibj2.command.button.JoystickButton}.
   */
  private void configureButtonBindings() {
  }


  /**
   * Use this to pass the autonomous command to the main {@link Robot} class.
   *
   * @return the command to run in autonomous
   */
  public Command getAutonomousCommand() {
    // An ExampleCommand will run in autonomous
    return null;
  }
}
