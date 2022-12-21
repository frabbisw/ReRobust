public static void main(java.lang.String[] args) {
    pl.krysinski.emulator.core.CpuCore core = new pl.krysinski.emulator.core.CpuCore();
    try {
        core.loadProgram("someProgram");
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    while (true) {
    }
}
