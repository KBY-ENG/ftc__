package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.*;
import com.qualcomm.robotcore.hardware.DcMotor;

@TeleOp(name = "ftc")
public class ftc extends LinearOpMode {
    DcMotor mo;
    @Override
    public void runOpMode() {

        mo = hardwareMap.get(DcMotor.class,"0");
        //float no = gamepad1.a;

        waitForStart();
        if (opModeIsActive()) {
            // Pre-run
            while (opModeIsActive()) {
                // OpMode loop
                telemetry.update();
                //gamepad1.a?mo.setPower(1.0):mo.setPower(0.0);
                //mo.setPower((-gamepad1.left_stick_y+1)/2);
                mo.setPower(gamepad1.x?(1.0):(0.0));

            }
        }
    }
}
