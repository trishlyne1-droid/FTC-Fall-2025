package org.firstinspires.ftc.teamcode.TeacherExamples;

import com.qualcomm.robotcore.eventloop.opmode.Disabled;
import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.hardware.DcMotor;

@TeleOp(name = "MovementTeleOp")
@Disabled
public class MovementTeleop extends LinearOpMode {

    @Override
    public void runOpMode() throws InterruptedException {
        DcMotor leftFront = hardwareMap.get(DcMotor.class, "leftFront");
        DcMotor leftRear = hardwareMap.get(DcMotor.class, "leftRear");
        DcMotor rightFront = hardwareMap.get(DcMotor.class, "rightFront");
        DcMotor rightRear = hardwareMap.get(DcMotor.class, "rightRear");

        leftFront.setDirection(DcMotor.Direction.FORWARD);
        leftRear.setDirection(DcMotor.Direction.FORWARD);
        rightFront.setDirection(DcMotor.Direction.REVERSE);
        rightRear.setDirection(DcMotor.Direction.REVERSE);

        double power = 0.5;

        waitForStart();

        while (opModeIsActive()) {
            if (gamepad1.a){
                power = .8;
            }
            if (gamepad1.b){
                power = .5;
            }

            double y = -gamepad1.left_stick_y;
            double x = gamepad1.left_stick_x;
            double rotation = gamepad1.right_stick_x;

            double leftFront_Power = (y + x + rotation) * power;
            double leftRear_Power = (y - x + rotation) * power;
            double rightFront_Power = (y - x - rotation)  * power;
            double rightRear_Power = (y + x - rotation)  * power;

            leftFront.setPower(leftFront_Power);
            leftRear.setPower(leftRear_Power);
            rightFront.setPower(rightFront_Power);
            rightRear.setPower(rightRear_Power);
        }
    }
}
