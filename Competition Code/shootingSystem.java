package frc.robot;

import edu.wpi.first.wpilibj.Timer;
// import frc.robot.armMovment.armSystem;
import frc.robot.shooterAndIntake.inTake;
import frc.robot.shooterAndIntake.outTake;
import frc.robot.shooterAndIntake.pusher;

// import frc.robot.outTake;
// import frc.robot.inTake;
// import frc.robot.pusher;

public class shootingSystem {
    static inTake intake = new inTake();
    outTake outtake = new outTake();
    pusher pusher = new pusher();

    colorSystem colorSystem = new colorSystem();
    // armSystem arm = new armSystem();
  

    public void intake(){
        // if (colorSystem.noteDectection() == true) {
        //     intake.Stop();
        // } else if (colorSystem.noteDectection() == false) {
        //     intake.Forward();
        // }
        //set the pos. of the arm to floor level

        intake.Forward();
    }

    public void intakeStop(){
        intake.Stop();
    }

    public void prepare(){
        //aim with vision
        outtake.forward(0.6);
    }

    public void shootSpeaker(){
        outtake.forward(0.6);
        Timer.delay(1);
        intake.Forward();
    }

    public void shootaMP(){
        outtake.forward(0.3);
        Timer.delay(.3);
        intake.Forward();
    }

    public void prepareStop(){
        outtake.Stop();
    }

    public void shoot(){ 
        pusher.Forward();
    }

    public void shootStop(){
        pusher.Stop();
    }

    public void eject(){
        intake.Reverse();
        outtake.reverse();
        pusher.Reverse();
    }

    public void ejectStop(){
        intake.Stop();
        outtake.Stop();
        pusher.Stop();
    }

    public void idle(){
        intake.Stop();
        outtake.Stop();
        pusher.Stop();
        // set arm pos. to straight up
    }



}
