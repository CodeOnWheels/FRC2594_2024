package frc.robot.controller;

import frc.armSystem;
import frc.robot.colorSystem;
import frc.robot.shootingSystem;
import frc.robot.shooterAndIntake.inTake;

import edu.wpi.first.wpilibj.Timer;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;



public class controlResponseSystem{
    shootingSystem shooter = new shootingSystem();
    controlSystem control1 = new controlSystem("Xbox", 1, "N", 0);
    armSystem arm = new armSystem();
    // inTake inTake = new inTake();

    //controlSystem controlSystem = new controlSystem();

    Timer timer = new Timer();

    colorSystem colorSystem = new colorSystem();
// change blue name for arm if desired

    boolean shootToggle = true;
    boolean pushToggle = true;
    boolean intakeToggle = true;
    boolean aimToggle = true;
    boolean ejectToggle = true;

        public void robotStart(){
            shooter.idle();
            arm.stop();
        }

        public void listenLoop(){

            SmartDashboard.putNumber("Arm Encoder", arm.getEncoder());
            System.out.println(arm.getEncoder());

            control1.puttingBooleanSmartdashboard();
            //controlSystem.puttingBooleanSmartdashboard();
            //System.out.println(arm.getEncoder());
            // TODO: Fix This:
            if (control1.shootButton()){
                shooter.shootSpeaker();
                //shootToggle = false;
            } 
            //else if (control1.shootButton()) && shootToggle == false){
                //     shooter.shootStop();
                //     shootToggle = true;
                //}
                
                if (control1.intakeButton()){
                    shooter.intake();
                    //intakeToggle = false;
                } //else if (control1.intakeButton() && intakeToggle == false){
                //shooter.intakeStop();
                //shootToggle = true;
            //}
            
            if(control1.rightTrigger()){
                shooter.shootSpeaker();
            }
            if(control1.rightBuper()){
                shooter.shootaMP();
            }

            if (control1.aimButton()){
                shooter.prepare();
                aimToggle = false;
            } else if (control1.aimButton() && aimToggle == false){
                shooter.prepareStop();
                aimToggle = true;
            }

            if (control1.ejectButton()){
                shooter.eject();
                ejectToggle = false;
            } else if (control1.ejectButton() && ejectToggle == false){
                shooter.ejectStop();
                ejectToggle = true;
            }

            if (control1.idleButton()){
                shooter.idle();
            }



            // Arm
            if (control1.armControl() >= -0.5 && control1.armControl() <= 0.5) {
                // D-Pad Neutral Position
                // Move Arm Up
                arm.stop();
            }
            if (control1.armControl() < -0.5) {
                // D-Pad Up Position
                arm.backward();

            }
            if (control1.armControl() == 90) {
                // D-Pad Right Position
                // Position 1. _______ position
                // arm.setPosition(0);
            }
            if (control1.armControl() > 0.5) {
                // D-Pad Down Position
                // Move Arm Down
                arm.forward();

            }
            if (control1.armControl() == 270) {
                // D-Pad Left Position
                // Position 2. _______ position
                // arm.setPosition(0);

            }

            if (control1.dPad() == 180) {
                arm.setPosition(34); //speaker
            }
            
            if (control1.dPad() == 0){
                arm.setPosition(56); //amp
            }
            /* 
            if(control1.ampAim() == true){
                while(arm.getEncoder() > 6){
                    arm.backward();
                }
                while(arm.getEncoder() > 4){
                    arm.forward();
                }
                arm.brakeOn();
            }

            if(control1.speakerAim() == true){
                while(arm.getEncoder() > 8){
                    arm.backward();
                }
                while (arm.getEncoder() < 8) {
                    arm.forward();
                }
                arm.brakeOn();

            }
            */
            // Does Nothing. Fill statement later if needed
            /*if (control1.armControl() == 0) {

            }*/
        }
    }