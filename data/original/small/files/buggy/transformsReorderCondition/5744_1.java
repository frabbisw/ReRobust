@java.lang.Override
public boolean testMachine() {
    final java.lang.String actualName = java.lang.System.getenv("COMPUTERNAME");
    for (final java.lang.String testName : this.computerNames) {
        if (testName == actualName) {
            return true;
        }
    }
    return false;
}
