package frc.robot.controller;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.XboxController;

public class controlSystem {
    XboxController xController = null;
    XboxController xController2 = null;
    Joystick joystick = null;

    // set joysticks
    public  controlSystem(String controllerType, int port, String controllerType2, int port2){
        if (controllerType == "Xbox"){
            xController = new XboxController(1);
    
        }
        if (controllerType2 == "Xbox"){

        }

    }

    public double leftStick(){
        return xController.getRawAxis(1);
    }

    public double rightStick(){
        return xController.getRawAxis(1);
    }

    public void leftStickRotation(){
        // math
    }

    public void rightStickRotation(){

    }
    
    public boolean shootButton(){
        return xController.getAButtonPressed();
    }

    public boolean intakeButton(){
        return xController.getBButtonPressed();
    }

    public boolean aimButton(){
        return xController.getYButtonPressed();
    }

    public boolean ejectButton(){
        return xController.getLeftBumperPressed();
    }

    public boolean idleButton(){
        return xController.getXButtonPressed();
    }
    public double armControl() {
        return xController.getRawAxis(1);
    }

}
