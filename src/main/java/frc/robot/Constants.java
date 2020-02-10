/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018-2019 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot;

/**
 * The Constants class provides a convenient place for teams to hold robot-wide numerical or boolean
 * constants.  This class should not be used for any other purpose.  All constants should be
 * declared globally (i.e. public static).  Do not put anything functional in this class.
 *
 * <p>It is advised to statically import this class (or one of its inner classes) wherever the
 * constants are needed, to reduce verbosity.
 */
public final class Constants {
    public static final class PortAssignments {
      // PWM Ports
      public static final int kLeftMotorPort1  = 0;
      public static final int kLeftMotorPort2  = 1;
      public static final int kRightMotorPort1 = 2;
      public static final int kRightMotorPort2 = 3;
      public static final int LIDARPort = 4;
      public static final int PWM5 = 5;
      public static final int PWM6 = 6;
      public static final int PWM7 = 7;
      public static final int PWM8 = 8;
      public static final int ControlPanelMotorPort = 9;
      // DIO Ports
      public static final int DIO0 = 0;
      public static final int DIO1 = 1;
      public static final int DIO2 = 2;
      public static final int DIO3 = 3;
      public static final int ControlPanelEncoderPort1 = 4;
      public static final int ControlPanelEncoderPort2 = 5; // Do we need two ports for the encoder? 
      public static final int kLeftEncoderPort1  = 6;
      public static final int kLeftEncoderPort2  = 7;
      public static final int kRightEncoderPort1 = 8;
      public static final int kRightEncoderPort2 = 9;

    }

    public static final class DriveConstants {
      //public static final int kLeftMotor1Port = 0;
     // public static final int kLeftMotor2Port = 1;
      //public static final int kRightMotor1Port = 2;
      //public static final int kRightMotor2Port = 3;
  
      //public static final int[] kLeftEncoderPorts = new int[]{6,7};
      //public static final int[] kRightEncoderPorts = new int[]{8,9};
      public static final boolean kLeftEncoderReversed = false;
      public static final boolean kRightEncoderReversed = true;
  
      public static final int kEncoderCPR = 1024;
      public static final double kWheelDiameterInches = 6;
      public static final double kEncoderDistancePerPulse =
          // Assumes the encoders are directly mounted on the wheel shafts
          (kWheelDiameterInches * Math.PI) / (double) kEncoderCPR;
  
      public static final boolean kGyroReversed = false;
  
      public static final double kStabilizationP = 1;
      public static final double kStabilizationI = 0.5;
      public static final double kStabilizationD = 0;
  
      public static final double kTurnP = 1;
      public static final double kTurnI = 0;
      public static final double kTurnD = 0;
  
      public static final double kMaxTurnRateDegPerS = 100;
      public static final double kMaxTurnAccelerationDegPerSSquared = 300;
      public static final double kMaxTurnPIDTurnSpeed = 0.2;
  
      public static final double kTurnToleranceDeg = 2;
      public static final double kTurnRateToleranceDegPerS = 10; // degrees per second
    }
  
    public static final class OIConstants {
      public static final int kDriverControllerPort = 1;
    }
  }
