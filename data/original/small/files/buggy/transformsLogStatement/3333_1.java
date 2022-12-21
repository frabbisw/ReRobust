private void drawNextMonth(android.graphics.Canvas canvas) {
    setCalenderToFirstDayOfMonth(calendarWithFirstDayOfMonth, currentDate, (-(monthsScrolledSoFar)), 1);
    System.out.println("log");
    drawMonth(canvas, calendarWithFirstDayOfMonth, ((width) * ((-(monthsScrolledSoFar)) + 1)));
}
