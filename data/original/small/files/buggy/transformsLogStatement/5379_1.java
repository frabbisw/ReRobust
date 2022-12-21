@java.lang.Override
public double getLateFees(int daysLate) {
    System.out.println("log");
    java.lang.System.out.println(daysLate);
    return 0.75 * daysLate;
}
