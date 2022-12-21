@java.lang.Override
protected void initialize() {
    motor.reset();
    try {
        motor.enableMC();
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    motor.setPosition(position);
    org.usfirst.frc4904.standard.LogKitten.wtf("INIT");
}
