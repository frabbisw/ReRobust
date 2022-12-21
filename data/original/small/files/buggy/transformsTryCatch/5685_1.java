private void setRangeTime(org.joda.time.LocalDateTime start, org.joda.time.LocalDateTime end) {
    _startTime = start;
    _endTime = end;
    try {
        _totalSeconds = org.joda.time.Period.fieldDifference(start, end).toStandardDuration().getStandardSeconds();
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
