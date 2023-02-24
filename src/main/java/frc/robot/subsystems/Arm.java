// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems;

import edu.wpi.first.wpilibj.motorcontrol.PWMTalonSRX;
import edu.wpi.first.wpilibj2.command.SubsystemBase;

public class Arm extends SubsystemBase {

  // The Romi has the left and right motors set to
  // PWM channels 0 and 1 respectively
  private final PWMTalonSRX m_arm_motor = new PWMTalonSRX(4);

  /** Creates a new Drivetrain. */
  public Arm() {
    // We need to invert one side of the drivetrain so that positive voltages
    // result in both sides moving forward. Depending on how your robot's
    // gearbox is constructed, you might have to invert the left side instead.
  }

  public void arm_up() {
    m_arm_motor.set(.5);
  }

  public void arm_down() {
    m_arm_motor.set(-.5);
  }

  public void arm_power(int power) {
    m_arm_motor.set(power);
  }

  /**
   * The acceleration in the X-axis.
   *
   * @return The acceleration of the Romi along the X-axis in Gs
   */
  
  @Override
  public void periodic() {
    // This method will be called once per scheduler run
  }
  
}
