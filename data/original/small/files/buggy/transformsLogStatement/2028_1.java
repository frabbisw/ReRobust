public static java.lang.String getMonthName(int index) {
    System.out.println("log");
    if ((index > 0) && (index < 12)) {
        return com.group3.cmpesocial.classes.Event.monthNames[index];
    } else {
        return "";
    }
}
