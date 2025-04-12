package org.firstinspires.ftc.teamcode.opmodes.teleop;

import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.DcMotorSimple;
import com.qualcomm.robotcore.hardware.Servo;

public class SampleOpMode extends OpMode {
    //Creates the new motors as a variable with class DcMotor
    DcMotor leftDriveMotor;
    DcMotor rightDriveMotor;

    //Creates arm motor
    DcMotor armPivotMotor;

    //Creates claw servos
    Servo leftClawServo;
    Servo rightClawServo;

    //init() Runs once when init button pressed
    @Override
    public void init() {
        //Initializes the motors from the hardware map
        leftDriveMotor = hardwareMap.dcMotor.get("leftDriveMotor");
        rightDriveMotor = hardwareMap.dcMotor.get("rightDriveMotor");

        //Sets run mode
        //RUN_WITHOUT_ENCODER means run at certain speed,
        //does not impact RUN_TO_POSITION mode
        leftDriveMotor.setMode(DcMotor.RunMode.RUN_WITHOUT_ENCODER);
        rightDriveMotor.setMode(DcMotor.RunMode.RUN_WITHOUT_ENCODER);

        //TODO Initialize Arm motor here

        //TODO Initialize claw servos here

    }

    //loop() runs over and over after play button pressed
    @Override
    public void loop() {
        // Creates two variables with type double, and assigns
        // their values from the gamepad
        double move = -gamepad1.left_stick_y;
        double turn = -gamepad1.right_stick_x;

        // Sets the speed to run the drive motors
        // move is forward / back
        // turn is turning
        leftDriveMotor.setPower(move + turn);
        rightDriveMotor.setPower(move - turn);

        //TODO Make Arm Move

        //TODO Make Claws Move

    }
}
