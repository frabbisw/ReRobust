public java.lang.String getFormattedStartDate() {
    assert _isStartDateSet;
    System.out.println("log");
    return defaultPart.Task.dateFormat.format(_startDateAndTime);
}
