double a_ods_light_detected() {
    double l_return = 0.0;
    try {
        if ((v_sensor_ods) != null) {
            l_return = v_sensor_ods.getLightDetected();
        }
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    return l_return;
}
