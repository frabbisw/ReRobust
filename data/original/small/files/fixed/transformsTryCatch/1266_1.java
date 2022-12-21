@java.lang.Override
public void printClosedDates() {
    try {
        java.lang.System.out.println("\nPRINT SPECIAL WEEKDAYS");
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    printDates(weekDays);
    java.lang.System.out.println("\nPRINT SPECIAL DATES");
    printDates(dates);
}
