package frc.robot.shooterAndIntake;

import javax.print.attribute.standard.MediaSize.Other;

import edu.wpi.first.wpilibj.motorcontrol.Talon;

import edu.wpi.first.wpilibj.Timer;

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
    public void forward(double speed){
       // rampMotor(outTakeMotor1, true, speed);
        outTakeMotor1.set(-speed);
        // Thread.sleep(0);
        outTakeMotor2.set(speed);
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

    // ramps motor for reverse
    public void rampMotor(Talon motor, boolean reversed, double speed){
        for(int i = 0; i < speed; i++) {
            if (reversed){
                motor.set(i * -0.1);
            }
            if (reversed == false) {
                motor.set(i * 0.1);
            }
            Timer.delay(0.1);
            // motor.set(i * 0.1);
        }
    
    }

}