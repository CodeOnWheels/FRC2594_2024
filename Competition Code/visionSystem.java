package frc.robot;

import java.util.Map;

import edu.wpi.first.math.geometry.Pose3d;
import edu.wpi.first.wpilibj.shuffleboard.BuiltInLayouts;
import edu.wpi.first.wpilibj.shuffleboard.BuiltInWidgets;
import edu.wpi.first.wpilibj.shuffleboard.Shuffleboard;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;

public class visionSystem {
    // Gets Data from the LimeLight
    // X Value from LimeLight
    public static double getX() {
        return LimelightHelpers.getTX("");
    }

    // Y Value from LimeLight
    public static double getY() {
        return LimelightHelpers.getTY("");
    }

    // Z Value from LimeLight
    public static double getZ() {
        /* VAR EXPLAIN:
        * Pose3dCamSpace: Gets the target's (apriltag) 3d Position in CameraSpace
        * stringGetTPose_CamString: Pose3dCameSpace turned to a string, so that it can be put in Shuffleboard
        */

        Pose3d Pose3dCamSpace = LimelightHelpers.getTargetPose3d_CameraSpace(null);

        /* UNCOMMENT: If you want to print values to Shuffleboard */
        // String stringGetTPose_CamString = Pose3dCamSpace.toString();
        // SmartDashboard.putString("stringGetTPose_CamString", stringGetTPose_CamString);
        // SmartDashboard.putNumber("Z value", getTPose_CamSpace.getZ());

        return Pose3dCamSpace.getZ();
    }

    public static double aptilTagNumber() {
        return LimelightHelpers.getFiducialID("");
    }

    public static boolean apriltagIsDetected() {
        // TODO: Add a return statement that tells if an apriltag is detected
        return false;
    }
}
