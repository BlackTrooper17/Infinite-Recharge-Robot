/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018-2019 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.commands.controlpanel;

import edu.wpi.first.wpilibj.DriverStation;
import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.subsystems.ControlPanel;

/**
 * An example command that uses an example subsystem.
 */
public class ControlPanelIndex extends CommandBase {
  @SuppressWarnings({"PMD.UnusedPrivateField", "PMD.SingularField"})
  private final ControlPanel m_subsystem;
  boolean isItFinished = false;
  String gameData;

  public ControlPanelIndex(ControlPanel subsystem) {
    m_subsystem = subsystem;
    addRequirements(m_subsystem);
  }

  // Called when the command is initially scheduled.
  @Override
  public void initialize() {
    gameData = DriverStation.getInstance().getGameSpecificMessage();
  }

  // Called every time the scheduler runs while the command is scheduled.
  @Override
  public void execute() {

    //Spins the control panel wheel
    m_subsystem.controlPanelMoveIndex();

    //Makes sure there is game data before trying to read it
    if(gameData.length() > 0){

      //Offsets the colors by two to reflect the difference between what the
      //robot reads and what the FMS reads
      switch(gameData.charAt(0)){
        case 'B' :
        if(m_subsystem.getColor() == "Red"){
          isItFinished = true;
          System.out.println("Red!");
        }
        break;

        case 'G' :
        if(m_subsystem.getColor() == "Yellow"){
          isItFinished = true;
          System.out.println("Yellow!");
        }
        break;

        case 'R' :
        if(m_subsystem.getColor() == "Blue"){
          isItFinished = true;
          System.out.println("Blue!");
        }
        break;

        case 'Y' :
        if(m_subsystem.getColor() == "Green"){
          isItFinished = true;
          System.out.println("Green!");
        }
        break;
      }
    } else {
      System.out.println("Cannot run ControlPanelIndex, no FMS data!");
    }
  }

  // Called once the command ends or is interrupted.
  @Override
  public void end(boolean interrupted) {
    m_subsystem.controlPanelStop();
    isItFinished = false;
  }

  // Returns true when the command should end.
  @Override
  public boolean isFinished() {
    return isItFinished;
  }
}
