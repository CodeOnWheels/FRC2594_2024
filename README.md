# FRC Team 2594 — 2024 CRESCENDO source archive

Java source collected from Team 2594, the NASKCOrpions, for the 2024 FIRST Robotics Competition season. This repository preserves competition-related code and reference material.

## My role

My work on Team 2594 included:

- Working on code structure intended to support rapid prototyping and iteration.
- Guiding newer programmers through the code and development workflow.

The source in this archive was developed collaboratively; the credits below identify the team contributors. The REV swerve files are reference material.

## Start here

| Location | Contents |
| --- | --- |
| [Competition Code/Robot.java](Competition%20Code/Robot.java) | Robot lifecycle and calls into autonomous and teleoperated behavior. |
| [Competition Code/controller](Competition%20Code/controller) | Controller input and response handling. |
| [Competition Code/shooterAndIntake](Competition%20Code/shooterAndIntake) | Intake, outtake, and pusher components. |
| [Competition Code/visionSystem.java](Competition%20Code/visionSystem.java) | Limelight target measurements and AprilTag ID access. |
| [Swerve Template from REV](Swerve%20Template%20from%20REV) | REV swerve reference files; separate from team-authored work. |
| [Misc Code I Found](Misc%20Code%20I%20Found) | Additional historical source fragments. |

## Build status

This is a source archive, not a complete deployable WPILib project. It does not include a Gradle build or all referenced classes, including `RobotContainer`, `LimelightHelpers`, and `shuffleboard`.

The vision code also contains unfinished behavior: `apriltagIsDetected()` currently returns `false`. The archive preserves both implemented systems and unfinished experiments.

To reproduce robot behavior, the original WPILib project, vendor dependencies, hardware configuration, and missing source files would be needed.

## Credits

This was collaborative team work. Original contributor credits are preserved:

- Matt Rummler
- Giovanni Cascio
- Owen Pierson
- Grant Price
- Sheilah Ascarrunz
- Olly K.
- Kai Sanders
- Chris Madenford

The REV reference files and WPILib-derived code retain their original attribution.

