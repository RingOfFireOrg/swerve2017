package org.usfirst.frc.team9999.robot;

import edu.wpi.first.wpilibj.Jaguar;
import edu.wpi.first.wpilibj.TalonSRX;

public class SwerveModule {
	Jaguar drive;
	TalonSRX steer;
	AbsoluteAnalogEncoder turnEncoder;
	PIDController pid = new PIDController(1, 0, 0, turnEncoder.getAngle, turnSpeed);
	double speed;
	double turnSpeed;
	double angleGoal;
	double currentAngle;

	public SwerveModule(Jaguar driveMotor, TalonSRX steerMotor, AbsoluteAnalogEncoder steerEncoder) {
		drive = driveMotor;
		steer = steerMotor;
		turnEncoder = steerEncoder;
	}

	private void setSpeed(double driveSpeed) {
		speed = driveSpeed;
		drive.set(speed);
	}

	private void setAngle (double wheelAngleGoal) {
		angleGoal = wheelAngleGoal;
		currentAngle = turnEncoder.getAngle();
		if(math.abs(pid.getSetpoint - turnEncoder.getAngle()) < 5) {
			//nothing
		} else {
			pid.setSetpoint(angle);
			pid.enable
			steer.set(turnSpeed);
		}
		
		//figure out tolerance level 5 may be wrong number...
		//also the while loop might not work if it is being called every x ms... maybe do cases with steps for each one
		
		
	}

	public void control(double driveSpeed, double wheelAngle) {
		setAngle(wheelAngle);
		setSpeed(driveSpeed);
	}
}
