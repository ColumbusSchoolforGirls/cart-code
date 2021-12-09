// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.commands;

import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.Global;
import frc.robot.RobotContainer;
import frc.robot.subsystems.DriveTrain;

public class Tankdrive extends CommandBase {
  /** Creates a new Tankdrive. */

  private final DriveTrain m_drivetrain;

  public Tankdrive(DriveTrain drivetrain) {
    // Use addRequirements() here to declare subsystem dependencies.
    m_drivetrain = drivetrain;
    addRequirements(m_drivetrain);
  }

  // Called when the command is initially scheduled.
  @Override
  public void initialize() {
    m_drivetrain.setTeleop();
  }

  // Called every time the scheduler runs while the command is scheduled.
  @Override
  public void execute() {
    //amountGo should be equivalent to the throttle value, but alas we have no throttle at the moment
    double amountGo = 1;
    double go;

    if (Math.abs(amountGo) >= Global.DEADZONE) {
      go = amountGo;
    } else {
      go = 0.0005;
    }

    m_drivetrain.Wheelspeed(go);

  }

  // Called once the command ends or is interrupted.
  @Override
  public void end(boolean interrupted) {}

  // Returns true when the command should end.
  @Override
  public boolean isFinished() {
    return false;
  }
}
