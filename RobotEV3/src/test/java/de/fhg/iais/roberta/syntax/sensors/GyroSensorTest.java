package de.fhg.iais.roberta.syntax.sensors;

import org.junit.Test;

import de.fhg.iais.roberta.testutil.Helper;

public class GyroSensorTest {

    @Test
    public void setGyro() throws Exception {
        String a = "\nhal.getGyroSensorAngle(SensorPort.S2)" + "hal.getGyroSensorRate(SensorPort.S4)";

        Helper.assertCodeIsOk(a, "/syntax/sensors/sensor_setGyro.xml");
    }

    @Test
    public void resetGyroSensor() throws Exception {
        String a = "\nhal.resetGyroSensor(SensorPort.S2);";

        Helper.assertCodeIsOk(a, "/syntax/sensors/sensor_resetGyro.xml");
    }
}
