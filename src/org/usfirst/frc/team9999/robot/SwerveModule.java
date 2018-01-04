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
	double angle;

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
		angle = wheelAngleGoal;
		double currentAngle = turnEncoder.getAngle();
		steer.set(turnSpeed);
		pid.setSetpoint(angle);
		pid.enable
			while(pid.isenabled == true) {
				if(math.abs(pid.getSetpoint - turnEncoder.getAngle()) < 5) {
					pid.disable
				}
			}
		//figure out tolerance level 5 may be wrong number...
		//also the while loop might not work if it is being called every x ms... maybe do cases with steps for each one
		
		
	}

	public void control(double driveSpeed, double wheelAngle) {
		setAngle(wheelAngle);
		setSpeed(driveSpeed);
	}
}
