package frc.robot;

import com.revrobotics.CANSparkMax;
import com.revrobotics.CANSparkLowLevel.MotorType;

import edu.wpi.first.wpilibj.Timer;

public class simpleAuto {

    private CANSparkMax drive1 = new CANSparkMax(2, MotorType.kBrushless);
    private CANSparkMax drive2 = new CANSparkMax(4, MotorType.kBrushless);
    private CANSparkMax drive3 = new CANSparkMax(6, MotorType.kBrushless);
    private CANSparkMax drive4 = new CANSparkMax(8, MotorType.kBrushless);

    Timer Timer = new Timer();

    public void auto1Run() {
        Timer.start();

        if(Timer.get() < 3){
            drive1.set(0.1);
            drive2.set(0.1);
            drive3.set(0.1);
            drive4.set(0.1);
        }
    }
}
