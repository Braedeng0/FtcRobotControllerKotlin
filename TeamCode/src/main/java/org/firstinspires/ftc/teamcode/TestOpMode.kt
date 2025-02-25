package org.firstinspires.ftc.teamcode

import com.qualcomm.robotcore.eventloop.opmode.OpMode
import com.qualcomm.robotcore.eventloop.opmode.TeleOp

@TeleOp(name = "TestOpMode")
class TestOpMode : OpMode() {
    override fun init() {
        telemetry.addData("Status", "Initialized")
        telemetry.update()
    }

    override fun loop() {
        telemetry.addData("Status", "Running")
        telemetry.update()
    }

    override fun stop() {
        telemetry.addData("Status", "Stopped")
        telemetry.update()
    }
}