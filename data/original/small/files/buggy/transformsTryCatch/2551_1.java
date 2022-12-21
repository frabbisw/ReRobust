public java.lang.String getTimeDisplay(shared.CustomTime time) {
    java.lang.String display = EMPTY_STRING;
    try {
        if (time.hasTime()) {
            display = this._timeFormat.format(time.getTime());
        }
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    return display;
}
