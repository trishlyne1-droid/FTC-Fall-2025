package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.Disabled;
import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;

@TeleOp(name = "Trishlyne")
@Disabled
public class Trishlyne extends OpMode {
    double number = 100.0;

    @Override
    // This method will be called once, when the INIT button is pressed.
    public void init() {
        number = number + 100;
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
        telemetry.addData("My number is", number);
        telemetry.addData("Another format for telemetry", "%d, but not %f" , number, 0.05);
        telemetry.update();
    }
}
