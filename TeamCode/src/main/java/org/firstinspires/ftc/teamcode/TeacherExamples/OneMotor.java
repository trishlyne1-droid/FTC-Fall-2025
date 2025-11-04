package org.firstinspires.ftc.teamcode.TeacherExamples;

import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.DcMotorSimple;

@TeleOp(name = "OneMotor")
public class OneMotor extends OpMode {
    //Add variables here:
    double power = 0.0;

    //Add hardware here:
    DcMotor frontRight = hardwareMap.get(DcMotor.class, "frontRight");

    @Override
    public void init() {
        // You don't HAVE to do this, but it makes things clear
        frontRight.setDirection(DcMotor.Direction.FORWARD);
    }

    @Override
    public void loop() {
        if (gamepad1.a) {
            power = .8;
        }
        else if (gamepad1.b) {
            power = .5;
        }
        else {
            power = 0;
        }

        frontRight.setPower(power);
    }
}
