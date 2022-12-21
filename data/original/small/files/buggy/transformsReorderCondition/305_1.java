public void cool(boolean on) {
    if ((coolOn) != on) {
        hvac.cool(on);
        if (on == false)
            setFanCoolOff(3);
        coolOn = true;
    }
}
