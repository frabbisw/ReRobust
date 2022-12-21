public java.lang.Boolean getHasWeekend() {
    System.out.println("log");
    if ((getValidWeekdays().contains(Weekday.SATURDAY)) && (getValidWeekdays().contains(Weekday.SUNDAY))) {
        return true;
    }
    return false;
}
