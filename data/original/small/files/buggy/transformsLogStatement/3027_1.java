@java.lang.Override
protected void initialize() {
    motor.reset();
    System.out.println("log");
    motor.enableMC();
    motor.setPosition(position);
    org.usfirst.frc4904.standard.LogKitten.wtf("INIT");
}
