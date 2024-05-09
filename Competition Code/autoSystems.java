package frc.robot;

import com.revrobotics.CANSparkMax;
import com.revrobotics.CANSparkLowLevel.MotorType;

import edu.wpi.first.math.geometry.Pose3d;
import edu.wpi.first.wpilibj.motorcontrol.Spark;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;
import frc.robot.shooterAndIntake.pusher;

public class autoSystems {
    static CANSparkMax m1 = new CANSparkMax(20, MotorType.kBrushless);
    public static void run() {
        if (visionSystem.getX() > 0) {
            m1.set(0.1);
        } else if (visionSystem.getX() < 0) {
            m1.set(-0.1);
        } else {
          //  System.out.println("ERR ");
        }
    }


}
