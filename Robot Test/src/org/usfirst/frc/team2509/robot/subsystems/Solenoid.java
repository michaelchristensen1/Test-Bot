package org.usfirst.frc.team2509.robot.subsystems;

import org.usfirst.frc.team2509.robot.OI;
import org.usfirst.frc.team2509.robot.RobotMap;

import edu.wpi.first.wpilibj.DoubleSolenoid;
import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.command.Subsystem;

/**
 *
 */
public class Solenoid extends Subsystem {

    // Put methods for controlling this subsystem
    // here. Call these from Commands.
private Joystick stickL = OI.stickL;
private DoubleSolenoid Solenoid = RobotMap.Solenoid;
public void shift () {
	if (stickL.getRawButton(1)) {
		Solenoid.set(DoubleSolenoid.Value.kForward);
	} else if(stickL.getRawButton(2)) {
		Solenoid.set(DoubleSolenoid.Value.kReverse);
	} else {
		Solenoid.set(DoubleSolenoid.Value.kOff);
	}
}
    public void initDefaultCommand() {
        // Set the default command for a subsystem here.
        //setDefaultCommand(new MySpecialCommand());
    }
}

