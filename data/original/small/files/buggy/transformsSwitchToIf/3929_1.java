public void calcmRes() {
    if (MagSettings.scale == 4) {
        MagSettings.mRes = SENSITIVITY_MAGNETOMETER_4;
    } else if (MagSettings.scale == 8) {
        MagSettings.mRes = SENSITIVITY_MAGNETOMETER_8;
    } else if (MagSettings.scale == 12) {
        MagSettings.mRes = SENSITIVITY_MAGNETOMETER_12;
    } else if (MagSettings.scale == 16) {
        MagSettings.mRes = SENSITIVITY_MAGNETOMETER_16;
    }
}
