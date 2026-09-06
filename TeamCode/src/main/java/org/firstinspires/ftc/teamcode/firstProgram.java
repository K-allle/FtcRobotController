package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.Autonomous;
import com.qualcomm.robotcore.eventloop.opmode.Disabled;
import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
@Disabled
@Autonomous(name = "first program", group = "Iterative Opmode")
public class firstProgram extends OpMode {
    @Override
    public void init() {
        telemetry.addData("First","Program");
    }

    @Override
    public void loop() {

    }
}
