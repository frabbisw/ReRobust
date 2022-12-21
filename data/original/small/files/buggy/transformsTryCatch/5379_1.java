@java.lang.Override
public double getLateFees(int daysLate) {
    try {
        java.lang.System.out.println(daysLate);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    return 0.75 * daysLate;
}
