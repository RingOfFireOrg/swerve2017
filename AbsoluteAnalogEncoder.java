package org.usfirst.frc.team9999.robot;

import edu.wpi.first.wpilibj.AnalogInput;

public class AbsoluteAnalogEncoder extends AnalogInput {
	public AbsoluteAnalogEncoder(int channel) {
		super(channel);
	}
	public double getAngle(){
		double angle = (this.getVoltage() / 5.0) * 360.0;
		return angle;
	}

}
