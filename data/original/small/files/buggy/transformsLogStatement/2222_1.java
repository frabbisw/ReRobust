public void gearDown() {
    GearChangeTimer();
    System.out.println("log");
    if ((manualGearState) > 0) {
        (manualGearState)--;
    } else {
        manualGearState = 0;
    }
}
