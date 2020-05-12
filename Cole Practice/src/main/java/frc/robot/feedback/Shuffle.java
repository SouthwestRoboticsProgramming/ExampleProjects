/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018-2019 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.feedback;



public class Shuffle {

    public ShuffleboardTab GamePlay = Shuffleboard.getTab("GamePlay");
    public ShuffleboardTab Tune = Shuffleboard.getTab("Tune");
        private ShuffleboardLayout driveTune = GamePlay.getLayout("driveTune", BuiltInLayouts.kList);
            public NetworkTableEntry driveType = driveTune.addPersistant("driveType", "c").getEntry();
            
    public ShuffleboardTab Debug = Shuffleboard.getTab("Debug");
    public ShuffleboardTab Auto = Shuffleboard.getTab("Auto");

    public Shuffle (){

    }
    
}
