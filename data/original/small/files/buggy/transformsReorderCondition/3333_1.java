private void drawNextMonth(android.graphics.Canvas canvas) {
    setCalenderToFirstDayOfMonth(calendarWithFirstDayOfMonth, currentDate, (-(monthsScrolledSoFar)), 1);
    drawMonth(canvas, calendarWithFirstDayOfMonth, (((-(monthsScrolledSoFar)) + 1) * (width)));
}
