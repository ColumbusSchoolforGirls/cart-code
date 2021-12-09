// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems;

import edu.wpi.first.wpilibj2.command.SubsystemBase;

import edu.wpi.first.wpilibj.AnalogInput;
import com.revrobotics.CANSparkMax;
import com.revrobotics.CANSparkMax.IdleMode;
import com.revrobotics.CANSparkMaxLowLevel.MotorType;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;
import frc.robot.RobotContainer;
import frc.robot.RobotMap;


public class DriveTrain extends SubsystemBase {
  /** Creates a new DriveTrain. */
  public DriveTrain() {}

  private final CANSparkMax right = new CANSparkMax(RobotMap.right_motor, MotorType.kBrushless);
  private final CANSparkMax left = new CANSparkMax(RobotMap.left_motor, MotorType.kBrushless);

  public void setTeleop(){
    right.setIdleMode(IdleMode.kCoast);
    left.setIdleMode(IdleMode.kCoast);
  }

   public void Wheelspeed(double speed){  
    right.set(speed);
    left.set(speed);
  }
  

  @Override
  public void periodic() {
    // This method will be called once per scheduler run
  }
}
