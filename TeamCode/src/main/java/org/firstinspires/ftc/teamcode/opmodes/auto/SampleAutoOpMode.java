package org.firstinspires.ftc.teamcode.opmodes.auto;

import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.Servo;

public class SampleAutoOpMode extends OpMode {
    //Creates the new motors as a variable with class DcMotor
    DcMotor leftDriveMotor;
    DcMotor rightDriveMotor;

    //Creates double driveTime to determine
    //how long the robot will drive for
    //TODO tune
    double driveTime = 1.5;

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
    }

    //start() Runs once when play pressed
    @Override
    public void start() {
        leftDriveMotor.setPower(.4);
        rightDriveMotor.setPower(.4);
    }

    @Override
    public void loop() {
        if(getRuntime() >= driveTime){
            leftDriveMotor.setPower(0);
            rightDriveMotor.setPower(0);
            requestOpModeStop();
        }
        telemetry.addData("RunTime:", getRuntime());
    }

}
