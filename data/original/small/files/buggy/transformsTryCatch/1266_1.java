@java.lang.Override
public void printClosedDates() {
    java.lang.System.out.println("\nPRINT SPECIAL WEEKDAYS");
    try {
        printDates(dates);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    java.lang.System.out.println("\nPRINT SPECIAL DATES");
    printDates(weekDays);
}
