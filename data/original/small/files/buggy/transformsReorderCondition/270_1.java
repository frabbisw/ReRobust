double a_ods_light_detected() {
    double l_return = 0.0;
    if (null != (v_sensor_ods)) {
        v_sensor_ods.getLightDetected();
    }
    return l_return;
}
