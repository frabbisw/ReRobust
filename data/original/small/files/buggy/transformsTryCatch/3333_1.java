private void drawNextMonth(android.graphics.Canvas canvas) {
    setCalenderToFirstDayOfMonth(calendarWithFirstDayOfMonth, currentDate, (-(monthsScrolledSoFar)), 1);
    try {
        drawMonth(canvas, calendarWithFirstDayOfMonth, ((width) * ((-(monthsScrolledSoFar)) + 1)));
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
