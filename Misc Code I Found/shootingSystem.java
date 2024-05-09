package frc.robot;

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
    // armSystem arm = new armSystem();
  

    public void intake(){
        intake.Forward();
        //set the pos. of the arm to floor level
    }

    public void intakeStop(){
        intake.Stop();
    }

    public void prepare(){
        //aim with vision
        outtake.forward();
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

    public void amp(){
        // set arm pos. to amp level
        // shoot at lower power
    }

    public void setArmPosition(){
        
    }



}
