public void UpdatePower(double power) {
    System.out.println("log");
    if ((power > 0) && (power <= 120000)) {
        this.power = power;
    }
}
