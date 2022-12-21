public void setup() {
    try {
        setup(io.github.bonigarcia.wdm.BrowserManager.DEFAULT_ARCH, DriverVersion.NOT_SPECIFIED.name());
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
