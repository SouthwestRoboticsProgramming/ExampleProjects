/*----------------------------------------------------------------------------*/
/* Copyright (c) 2019 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.subsystems;

import com.ctre.phoenix.motorcontrol.NeutralMode;
import com.ctre.phoenix.motorcontrol.can.WPI_TalonFX;

import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.Constants;

public class DriveBase extends SubsystemBase {
  
  private WPI_TalonFX leftMaster, leftSlave1, leftSlave2, 
                      rightMaster, rightSlave1, rightSlave2;
  
  private Constants constants = new Constants();

  /**
   * Creates a new Drivebase.
   */
  public DriveBase() {
    leftMaster = new WPI_TalonFX(constants.leftPort1);
		leftSlave1 = new WPI_TalonFX(constants.leftPort2);
		leftSlave2 = new WPI_TalonFX(constants.leftPort3);
		rightMaster = new WPI_TalonFX(constants.rightPort1);
		rightSlave1 = new WPI_TalonFX(constants.rightPort2);
		rightSlave2 = new WPI_TalonFX(constants.rightPort3);
    
    // RESET TALONS
		leftMaster.configFactoryDefault();
		leftSlave1.configFactoryDefault();
		leftSlave2.configFactoryDefault();
		rightMaster.configFactoryDefault();
		rightSlave1.configFactoryDefault();
		rightSlave2.configFactoryDefault();

		// PID
		// fxConfig = new TalonFXConfiguration();
		// fxConfig.primaryPID.selectedFeedbackSensor = FeedbackDevice.IntegratedSensor;
		// fxConfig.neutralDeadband = .001;
		// fxConfig.slot0.kF = Robot.shuffleBoard.driveFXPidF.getDouble(0);
		// fxConfig.slot0.kP = Robot.shuffleBoard.driveFXPidP.getDouble(0);
		// fxConfig.slot0.kI = Robot.shuffleBoard.driveFXPidI.getDouble(0);
		// fxConfig.slot0.kD = Robot.shuffleBoard.driveFXPidD.getDouble(0);
		// fxConfig.slot0.closedLoopPeakOutput = 1;
		// fxConfig.openloopRamp = .5;


		// rightMaster.configAllSettings(fxConfig);
		// leftMaster.configAllSettings(fxConfig);
		
		// LEFT MASTER
		leftMaster.setInverted(true);
		leftSlave1.setInverted(true);
		leftSlave2.setInverted(true);
		leftMaster.setSensorPhase(true);
		leftMaster.setNeutralMode(NeutralMode.Brake);
		leftSlave1.follow(leftMaster);
		leftSlave2.follow(leftMaster);
		
		// RIGHT MASTER
		rightMaster.setInverted(false);
		rightSlave1.setInverted(false);
		rightSlave2.setInverted(false);
		rightMaster.setSensorPhase(true);
		rightMaster.setNeutralMode(NeutralMode.Brake);
		rightSlave1.follow(rightMaster);
		rightSlave2.follow(rightMaster);
  }

  @Override
  public void periodic() {
    // This method will be called once per scheduler run
  }
}
