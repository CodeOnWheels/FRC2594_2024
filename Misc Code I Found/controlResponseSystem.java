package frc.robot.controller;

import frc.armSystem;
import frc.robot.colorSystem;
import frc.robot.shootingSystem;
import frc.robot.shooterAndIntake.inTake;


public class controlResponseSystem{
    shootingSystem shooter = new shootingSystem();
    controlSystem control1 = new controlSystem("Xbox", 1, "N", 0);
    armSystem arm = new armSystem();
    inTake inTake = new inTake();

    colorSystem colorSystem = new colorSystem();
// change blue name for arm if desired

    boolean shootToggle = true;
    boolean pushToggle = true;
    boolean intakeToggle = true;
    boolean aimToggle = true;
    boolean ejectToggle = true;

        public void listenLoop(){

            //System.out.println(arm.getEncoder());

            if (control1.shootButton()){
                shooter.shoot();
                shootToggle = false;
            } else if (control1.shootButton() && shootToggle == false){
                shooter.shootStop();
                shootToggle = true;
            }

            if (control1.intakeButton()){
                shooter.intake();
                intakeToggle = false;
            } else if (control1.intakeButton() && intakeToggle == false){
                shooter.intakeStop();
                shootToggle = true;
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
            // Does Nothing. Fill statement later if needed
            if (control1.armControl() == 0) {

            }







        }
    }


   