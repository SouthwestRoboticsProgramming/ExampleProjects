/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018-2019 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.feedbackDevices;

import edu.wpi.first.networktables.NetworkTableEntry;
import edu.wpi.first.wpilibj.shuffleboard.BuiltInLayouts;
import edu.wpi.first.wpilibj.shuffleboard.Shuffleboard;
import edu.wpi.first.wpilibj.shuffleboard.ShuffleboardLayout;
import edu.wpi.first.wpilibj.shuffleboard.ShuffleboardTab;
/**
 * Add your docs here.
 */
public class Shuffle {

    public ShuffleboardTab GamePlay = Shuffleboard.getTab("GamePlay");
    public ShuffleboardTab Tune = Shuffleboard.getTab("Tune");
        private ShuffleboardLayout driveTune = Tune.getLayout("driveTune", BuiltInLayouts.kList);
            public NetworkTableEntry driveType = driveTune.addPersistent("driveType", "a").getEntry();

    public ShuffleboardTab Debug = Shuffleboard.getTab("Debug");
    public ShuffleboardTab Auto = Shuffleboard.getTab("Auto");
        
    public Shuffle() {

    }

}
