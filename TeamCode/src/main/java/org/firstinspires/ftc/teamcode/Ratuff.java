package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.Disabled;
import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.DcMotorSimple;

@TeleOp(name = "Ratuff")
public class Ratuff extends OpMode {
    double power = 0;
DcMotor backRight = null;
DcMotor backLeft = null;
DcMotor frontRight = null;
DcMotor frontLeft = null;
    @Override
    // This method will be called once, when the INIT button is pressed.
    public void init() {

        backRight = hardwareMap.get(DcMotor.class, "backRight");
         backLeft = hardwareMap.get(DcMotor.class, "backLeft");
         frontRight = hardwareMap.get(DcMotor.class, "frontRight");
         frontLeft = hardwareMap.get(DcMotor.class, "frontLeft");
        backRight.setDirection(DcMotor.Direction.FORWARD);
        backLeft.setDirection(DcMotor.Direction.REVERSE);
        frontRight.setDirection(DcMotor.Direction.REVERSE);
        frontLeft.setDirection(DcMotor.Direction.FORWARD);
    }
    // This method will be called repeatedly during the period between when the init button is pressed and when
    // the play button is pressed (or the OpMode is stopped)
    public void init_loop() {};

    // This method will be called once, when the play button is pressed.
    public void start() {}

    @Override
    // This method will be called repeatedly during the period between when the play button is pressed
    // and when the OpMode is stopped.
    public void loop() {
        if (gamepad1.a) {
            power = .8;

        }

        else if (gamepad1.b) {
            power = .5;

        } else {
                power =0; }

                frontRight.setPower(power);
                frontLeft.setPower(power);
                backRight.setPower(power);
                backLeft.setPower(power);
    }
}
