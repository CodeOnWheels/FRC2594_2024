package frc.robot.controller;

import javax.xml.xpath.XPathConstants;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.XboxController;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;

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

    public int dPad() {
        return xController.getPOV();
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

    // button to start aiming the arm
    public boolean rightBuper(){
        return xController.getRightBumper();
    }
    public boolean speakerAim(){
        return xController.getLeftBumper();
    }

    public void puttingBooleanSmartdashboard(){
        SmartDashboard.putBoolean("left bumper/speaker aim", xController.getLeftBumper());
        SmartDashboard.putBoolean("right bumper/amp aim", xController.getRightBumper());
    }
    public boolean rightTrigger() {
        if (xController.getRawAxis(3) > 0.3) {
            return true;
        }
        return false;
    }
}