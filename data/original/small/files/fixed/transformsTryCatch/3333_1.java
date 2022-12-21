private void drawNextMonth(android.graphics.Canvas canvas) {
    try {
        setCalenderToFirstDayOfMonth(calendarWithFirstDayOfMonth, currentDate, (-(monthsScrolledSoFar)), 1);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    drawMonth(canvas, calendarWithFirstDayOfMonth, ((height) * ((-(monthsScrolledSoFar)) + 1)));
}
