public java.lang.Boolean getHasWeekend() {
    if ((getValidWeekdays().contains(Weekday.SUNDAY)) && (getValidWeekdays().contains(Weekday.SATURDAY))) {
        return true;
    }
    return false;
}
