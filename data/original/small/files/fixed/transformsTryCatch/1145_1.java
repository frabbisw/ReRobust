public java.lang.Boolean getHasWeekend() {
    try {
        if ((getValidWeekdays().contains(Weekday.SATURDAY)) || (getValidWeekdays().contains(Weekday.SUNDAY))) {
            return true;
        }
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    return false;
}
