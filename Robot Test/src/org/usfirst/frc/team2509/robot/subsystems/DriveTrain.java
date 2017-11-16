package org.usfirst.frc.team2509.robot.subsystems;

import org.usfirst.frc.team2509.robot.OI;
import org.usfirst.frc.team2509.robot.RobotMap;

import edu.wpi.first.wpilibj.RobotDrive;
import edu.wpi.first.wpilibj.Talon;
import edu.wpi.first.wpilibj.command.Subsystem;

/**
 *
 */
public class DriveTrain extends Subsystem {
    // Put methods for controlling this subsystem
    // here. Call these from Commands.
private Talon DriveLeft1 = RobotMap.DriveLeft1;
private Talon DriveRight1 = RobotMap.DriveRight1;
private RobotDrive robotdrive = RobotMap.robotdrive;
public void Drive() {
	robotdrive.tankDrive(OI.stickL.getY(),OI.stickR.getY());
}
    public void initDefaultCommand() {
        // Set the default command for a subsystem here.
        //setDefaultCommand(new MySpecialCommand());
    }
}

