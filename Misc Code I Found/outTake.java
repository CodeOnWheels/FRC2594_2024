package frc.robot.shooterAndIntake;

import javax.print.attribute.standard.MediaSize.Other;

import edu.wpi.first.wpilibj.motorcontrol.Talon;

public class outTake{

    // fly wheel motor object
    // Right
    static Talon outTakeMotor1 = new Talon(2);
    // Left
    static Talon outTakeMotor2 = new Talon(0);

    
    //sets motor speed
    static double motorSpeed = 0.6;

    public outTake() {
        outTakeMotor2.setInverted(true);



    }

    // motor turns  clockwise im guessing
    public void forward(){
        outTakeMotor1.set(-motorSpeed);
        // Thread.sleep(0);
        outTakeMotor2.set(motorSpeed);
    }

    // motor turns counter clockwise
    public void reverse(){
        outTakeMotor1.set(motorSpeed / 2);
        outTakeMotor2.set(-motorSpeed / 2);
    
    }

    //motor Stops
    public void Stop(){
        outTakeMotor1.set(0);
        outTakeMotor2.set(0);
    }
}
