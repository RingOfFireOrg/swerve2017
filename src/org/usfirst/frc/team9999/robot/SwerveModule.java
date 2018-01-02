package org.usfirst.frc.team9999.robot;

import edu.wpi.first.wpilibj.Jaguar;
import edu.wpi.first.wpilibj.TalonSRX;

public class SwerveModule{
	Jaguar drive;
	TalonSRX steer;
	AbsoluteAnalogEncoder turnEncoder;
	double speed;
	double angle;
	
	public SwerveModule(Jaguar driveMotor, TalonSRX steerMotor, AbsoluteAnalogEncoder steerEncoder) {
		drive = driveMotor;
		steer = steerMotor;
		turnEncoder = steerEncoder;
	}
	private void setSpeed (double driveSpeed) {
		speed = driveSpeed;
		drive.set(speed);
	}
	private void setAngle (double wheelAngleGoal) {
		angle = wheelAngleGoal;
		double currentAngle = turnEncoder.getAngle();
		//figure out tolerance level(if absolute value dif is less than something...)
		//proportional turn
		
	}
	public void control(double driveSpeed, double wheelAngle) {
		setSpeed(driveSpeed);
		setAngle(wheelAngle);
	}
}
