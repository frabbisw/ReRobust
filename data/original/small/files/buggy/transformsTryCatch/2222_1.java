public void gearDown() {
    try {
        GearChangeTimer();
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    if ((manualGearState) > 0) {
        (manualGearState)--;
    } else {
        manualGearState = 0;
    }
}
