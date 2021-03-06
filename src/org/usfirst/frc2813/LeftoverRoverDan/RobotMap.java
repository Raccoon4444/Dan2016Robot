package org.usfirst.frc2813.LeftoverRoverDan;

import edu.wpi.first.wpilibj.AnalogGyro;
import edu.wpi.first.wpilibj.AnalogPotentiometer;
import edu.wpi.first.wpilibj.CounterBase.EncodingType;
import edu.wpi.first.wpilibj.Encoder;
import edu.wpi.first.wpilibj.PIDSourceType;
import edu.wpi.first.wpilibj.RobotDrive;
import edu.wpi.first.wpilibj.SpeedController;
import edu.wpi.first.wpilibj.Talon;
import edu.wpi.first.wpilibj.VictorSP;

import edu.wpi.first.wpilibj.livewindow.LiveWindow;

public class RobotMap {

	public static SpeedController elevatorSpeedControllerLeft;
	public static SpeedController elevatorSpeedControllerRight;
	public static RobotDrive elevatorSpeedControllers;
	public static Encoder elevatorEncoder;
	public static SpeedController shooterSpeedController;
	public static Encoder shooterEncoder;
	public static SpeedController intakeSpeedControllerLeft;
	public static SpeedController intakeSpeedControllerRight;
	public static SpeedController driveTrainSpeedControllerFrontLeft;
	public static SpeedController driveTrainSpeedControllerFrontRight;
	public static SpeedController driveTrainSpeedControllerBackLeft;
	public static SpeedController driveTrainSpeedControllerBackRight;
	public static RobotDrive driveTrainSpeedControllers;
	public static AnalogGyro driveTrainGyro;
	public static AnalogPotentiometer armsPotentiometer;
	public static SpeedController armsSpeedControllerLeft;
	public static SpeedController armsSpeedControllerRight;
	public static SpeedController armsSpeedControllerSucker;
	public static RobotDrive armsSpeedControllers;

	public static void init() {
		elevatorSpeedControllerLeft = new VictorSP(1);
		LiveWindow.addActuator("Elevator", "SpeedControllerLeft",
				(VictorSP) elevatorSpeedControllerLeft);

		elevatorSpeedControllerRight = new VictorSP(2);
		LiveWindow.addActuator("Elevator", "SpeedControllerRight",
				(VictorSP) elevatorSpeedControllerRight);

		elevatorSpeedControllers = new RobotDrive(elevatorSpeedControllerLeft,
				elevatorSpeedControllerRight);

		elevatorSpeedControllers.setSafetyEnabled(true);
		elevatorSpeedControllers.setExpiration(0.1);
		elevatorSpeedControllers.setSensitivity(0.5);
		elevatorSpeedControllers.setMaxOutput(1.0);

		elevatorEncoder = new Encoder(0, 1, false, EncodingType.k4X);
		LiveWindow.addSensor("Elevator", "Encoder", elevatorEncoder);
		elevatorEncoder.setDistancePerPulse(1.0);
		elevatorEncoder.setPIDSourceType(PIDSourceType.kRate);
		shooterSpeedController = new VictorSP(0);
		LiveWindow.addActuator("Shooter", "SpeedController",
				(VictorSP) shooterSpeedController);

		shooterEncoder = new Encoder(2, 3, false, EncodingType.k4X);
		LiveWindow.addSensor("Shooter", "Encoder", shooterEncoder);
		shooterEncoder.setDistancePerPulse(1.0);
		shooterEncoder.setPIDSourceType(PIDSourceType.kRate);
//		intakeSpeedControllerLeft = new VictorSP(7);
//		LiveWindow.addActuator("Intake", "SpeedControllerLeft",
//				(VictorSP) intakeSpeedControllerLeft);

//		//intakeSpeedControllerRight = new VictorSP(8);
//		LiveWindow.addActuator("Intake", "SpeedControllerRight",
//				(VictorSP) intakeSpeedControllerRight);

		driveTrainSpeedControllerFrontLeft = new Talon(9);
		LiveWindow.addActuator("ArcadeDrive", "SpeedControllerFrontLeft",
				(Talon) driveTrainSpeedControllerFrontLeft);

		driveTrainSpeedControllerFrontRight = new Talon(7);
		LiveWindow.addActuator("ArcadeDrive", "SpeedControllerFrontRight",
				(Talon) driveTrainSpeedControllerFrontRight);

		driveTrainSpeedControllerBackLeft = new Talon(8);
		LiveWindow.addActuator("ArcadeDrive", "SpeedControllerBackLeft",
				(Talon) driveTrainSpeedControllerBackLeft);

		driveTrainSpeedControllerBackRight = new Talon(6);
		LiveWindow.addActuator("ArcadeDrive", "SpeedControllerBackRight",
				(Talon) driveTrainSpeedControllerBackRight);

		driveTrainSpeedControllers = new RobotDrive(
				driveTrainSpeedControllerFrontLeft,
				driveTrainSpeedControllerBackLeft,
				driveTrainSpeedControllerFrontRight,
				driveTrainSpeedControllerBackRight);

		driveTrainSpeedControllers.setSafetyEnabled(true);
		driveTrainSpeedControllers.setExpiration(0.1);
		driveTrainSpeedControllers.setSensitivity(0.5);
		driveTrainSpeedControllers.setMaxOutput(1.0);

		driveTrainGyro = new AnalogGyro(0);
		LiveWindow.addSensor("ArcadeDrive", "Gyro", driveTrainGyro);
		driveTrainGyro.setSensitivity(0.007);
		armsPotentiometer = new AnalogPotentiometer(1, 1.0, 0.0);
		LiveWindow.addSensor("Arms", "Potentiometer", armsPotentiometer);

		//armsSpeedControllerLeft = new Talon(9);
//		LiveWindow.addActuator("Arms", "SpeedControllerLeft",
//				(Talon) armsSpeedControllerLeft);

		armsSpeedControllerRight = new Talon(10);
		LiveWindow.addActuator("Arms", "SpeedControllerRight",
				(Talon) armsSpeedControllerRight);

//		armsSpeedControllers = new RobotDrive(armsSpeedControllerLeft,
//				armsSpeedControllerRight);

//		armsSpeedControllers.setSafetyEnabled(true);
//		armsSpeedControllers.setExpiration(0.1);
//		armsSpeedControllers.setSensitivity(0.5);
//		armsSpeedControllers.setMaxOutput(1.0);
	}
}