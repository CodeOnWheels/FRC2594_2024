package frc.robot.shooterAndIntake;

import edu.wpi.first.wpilibj.motorcontrol.PWMSparkMax;
import frc.robot.colorSystem;


public class inTake{

    // instatiating sparkmax obj
    PWMSparkMax inTakeMotor1 = new PWMSparkMax(1);

    // instatiating color object
    colorSystem colorSystem = new colorSystem();

    // sets motor speed
    double motorSpeed = 0.4;

    // motor turns clockwise im guessing
    public void Forward(){
        inTakeMotor1.set(-motorSpeed);
    }

    // motor turns counter clockwise
    public void Reverse(){
        inTakeMotor1.set(motorSpeed / 2);
    
    }

    // motor Stops
    public void Stop(){
        inTakeMotor1.set(0);
    }

    
} 