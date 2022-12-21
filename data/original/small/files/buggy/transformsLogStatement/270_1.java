double a_ods_light_detected() {
    double l_return = 0.0;
    System.out.println("log");
    if ((v_sensor_ods) != null) {
        v_sensor_ods.getLightDetected();
    }
    return l_return;
}
