public void cool(boolean on) {
    try {
        if (on != (coolOn)) {
            hvac.cool(on);
            if (on == false)
                setFanCoolOff(3);
            coolOn = true;
        }
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
