package frc.robot;

import com.revrobotics.ColorSensorV3;
import com.revrobotics.ColorSensorV3.RawColor;

import edu.wpi.first.wpilibj.I2C;
import edu.wpi.first.wpilibj.I2C.Port;
import edu.wpi.first.wpilibj.util.Color;

public class colorSystem {
    
    I2C.Port port = I2C.Port.kOnboard;
    ColorSensorV3 colorSensor = new ColorSensorV3(port);

    // TODO: COMMENT OUT WHEN IN MATCH
    public Color getColor(){
        
        System.out.println("in beginning of colorSystem.getColor()");
        Color colorVariable = colorSensor.getColor();
        System.out.println(colorVariable);
        return colorVariable;
    }

    public int getIR(){
        System.out.println("prints out IR value of the color sensor");
        int colorIr = colorSensor.getIR();
        System.out.println(colorIr);
        return colorIr;
    }

    public boolean noteDectection(){
        if(colorSensor.getIR() > 0){
            return true;
        }
        return false;
    }
}
