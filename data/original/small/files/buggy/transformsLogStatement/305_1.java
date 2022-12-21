public void cool(boolean on) {
    System.out.println("log");
    if (on != (coolOn)) {
        hvac.cool(on);
        if (on == false)
            setFanCoolOff(3);
        coolOn = true;
    }
}
