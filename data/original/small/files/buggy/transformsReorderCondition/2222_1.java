public void gearDown() {
    GearChangeTimer();
    if (0 < (manualGearState)) {
        (manualGearState)--;
    } else {
        manualGearState = 0;
    }
}
